package typingsSlinky.hapiHapi.mod.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjson)
  */
@js.native
trait StringifyArguments extends js.Object {
  /* calls Hoek.jsonEscape() after conversion to JSON string. Defaults to false. */
  var escape: js.UndefOr[Boolean] = js.native
  /** the replacer function or array. Defaults to no action. */
  var replacer: js.UndefOr[StringifyReplacer] = js.native
  /** number of spaces to indent nested object keys. Defaults to no indentation. */
  var space: js.UndefOr[StringifySpace] = js.native
  /* string suffix added after conversion to JSON string. Defaults to no suffix. */
  var suffix: js.UndefOr[String] = js.native
}

object StringifyArguments {
  @scala.inline
  def apply(): StringifyArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyArguments]
  }
  @scala.inline
  implicit class StringifyArgumentsOps[Self <: StringifyArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReplacer(value: StringifyReplacer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: StringifySpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

