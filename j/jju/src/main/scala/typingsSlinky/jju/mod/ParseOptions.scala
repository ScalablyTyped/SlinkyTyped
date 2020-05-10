package typingsSlinky.jju.mod

import typingsSlinky.jju.jjuStrings.`throw`
import typingsSlinky.jju.jjuStrings.cjson
import typingsSlinky.jju.jjuStrings.ignore
import typingsSlinky.jju.jjuStrings.json
import typingsSlinky.jju.jjuStrings.json5
import typingsSlinky.jju.jjuStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  /**
    * Operation mode (default 'json5'). Set to 'json' if you want to throw on non-strict json files.
    */
  var mode: js.UndefOr[json5 | json | cjson] = js.native
  /**
    * Create object as `Object.create(null)` instead of `{}`.
    * - If reserved_keys != 'replace', default is false.
    * - If reserved_keys == 'replace', default is true.
    *
    * It is usually unsafe and not recommended to change this option to false in the last case.
    */
  var null_prototype: js.UndefOr[Boolean] = js.native
  /**
    * What to do with reserved keys (default 'ignore').
    * - "ignore" - ignore reserved keys
    * - "throw" - throw SyntaxError in case of reserved keys
    * - "replace" - replace reserved keys, this is the default JSON.parse behaviour, unsafe
    */
  var reserved_keys: js.UndefOr[ignore | `throw` | replace] = js.native
  /**
    * Reviver function (follows the JSON spec). This function is called for each member of the object.
    * If a member contains nested objects, the nested objects are transformed before the parent object is.
    */
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: json5 | json | cjson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNull_prototype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null_prototype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNull_prototype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null_prototype")(js.undefined)
        ret
    }
    @scala.inline
    def withReserved_keys(value: ignore | `throw` | replace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserved_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved_keys")(js.undefined)
        ret
    }
    @scala.inline
    def withReviver(value: (/* key */ js.Any, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReviver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.undefined)
        ret
    }
  }
  
}

