package typingsSlinky.baseui.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconOverrides extends js.Object {
  var Svg: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledComponentArgsT> */ js.Any
  ] = js.native
}

object IconOverrides {
  @scala.inline
  def apply(): IconOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOverrides]
  }
  @scala.inline
  implicit class IconOverridesOps[Self <: IconOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSvg(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledComponentArgsT> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Svg")(js.undefined)
        ret
    }
  }
  
}

