package typingsSlinky.baseui.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioGroupOverrides extends js.Object {
  var RadioGroupRoot: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object RadioGroupOverrides {
  @scala.inline
  def apply(): RadioGroupOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioGroupOverrides]
  }
  @scala.inline
  implicit class RadioGroupOverridesOps[Self <: RadioGroupOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadioGroupRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadioGroupRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioGroupRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadioGroupRoot")(js.undefined)
        ret
    }
  }
  
}

