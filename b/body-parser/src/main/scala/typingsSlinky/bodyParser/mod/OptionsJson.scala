package typingsSlinky.bodyParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsJson extends Options {
  /**
    *
    * The reviver option is passed directly to JSON.parse as the second argument.
    */
  var reviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  /**
    * When set to `true`, will only accept arrays and objects;
    * when `false` will accept anything JSON.parse accepts. Defaults to `true`.
    */
  var strict: js.UndefOr[Boolean] = js.native
}

object OptionsJson {
  @scala.inline
  def apply(): OptionsJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsJson]
  }
  @scala.inline
  implicit class OptionsJsonOps[Self <: OptionsJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReviver(value: (/* key */ String, /* value */ js.Any) => _): Self = {
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
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

