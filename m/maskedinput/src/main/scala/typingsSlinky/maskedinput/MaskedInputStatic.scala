package typingsSlinky.maskedinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskedInputStatic extends js.Object {
  var defaults: MaskedInputDefaults = js.native
  def format(value: String, options: MaskedInputStaticDefaults): Boolean = js.native
  def isValid(value: String, options: MaskedInputStaticDefaults): Boolean = js.native
}

object MaskedInputStatic {
  @scala.inline
  def apply(
    defaults: MaskedInputDefaults,
    format: (String, MaskedInputStaticDefaults) => Boolean,
    isValid: (String, MaskedInputStaticDefaults) => Boolean
  ): MaskedInputStatic = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], format = js.Any.fromFunction2(format), isValid = js.Any.fromFunction2(isValid))
    __obj.asInstanceOf[MaskedInputStatic]
  }
  @scala.inline
  implicit class MaskedInputStaticOps[Self <: MaskedInputStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: MaskedInputDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: (String, MaskedInputStaticDefaults) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsValid(value: (String, MaskedInputStaticDefaults) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

