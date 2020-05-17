package typingsSlinky.eyes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  /** Overall base style applied to everything */
  var all: js.UndefOr[String] = js.native
  /** Style when printing booleans */
  var bool: js.UndefOr[String] = js.native
  /** Style when printing the keys in object literals, like 'a' in `{a: 1}` */
  var key: js.UndefOr[String] = js.native
  /** Style when printing inspection labels, like 'array' in `array: [1, 2, 3]` */
  var label: js.UndefOr[String] = js.native
  /** Style when printing numbers */
  var number: js.UndefOr[String] = js.native
  /** Style when printing objects which don't have a literal representation, such as functions */
  var other: js.UndefOr[String] = js.native
  /** Style when printing RegExps */
  var regexp: js.UndefOr[String] = js.native
  /** Style when printing `null`, `undefined`, etc. */
  var special: js.UndefOr[String] = js.native
  /** Style when printing strings */
  var string: js.UndefOr[String] = js.native
}

object All {
  @scala.inline
  def apply(): All = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withBool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

