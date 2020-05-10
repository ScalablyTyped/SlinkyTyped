package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignDisplayPattern extends js.Object {
  var always: NotationPattern = js.native
  var auto: NotationPattern = js.native
  var exceptZero: NotationPattern = js.native
  var never: NotationPattern = js.native
}

object SignDisplayPattern {
  @scala.inline
  def apply(
    always: NotationPattern,
    auto: NotationPattern,
    exceptZero: NotationPattern,
    never: NotationPattern
  ): SignDisplayPattern = {
    val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any], auto = auto.asInstanceOf[js.Any], exceptZero = exceptZero.asInstanceOf[js.Any], never = never.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignDisplayPattern]
  }
  @scala.inline
  implicit class SignDisplayPatternOps[Self <: SignDisplayPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways(value: NotationPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto(value: NotationPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptZero(value: NotationPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNever(value: NotationPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("never")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

