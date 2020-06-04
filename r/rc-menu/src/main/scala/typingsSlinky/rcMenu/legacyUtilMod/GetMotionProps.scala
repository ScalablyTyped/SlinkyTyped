package typingsSlinky.rcMenu.legacyUtilMod

import typingsSlinky.rcMenu.interfaceMod.OpenAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMotionProps extends js.Object {
  var motion: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any
  ] = js.undefined
  var openAnimation: js.UndefOr[OpenAnimation] = js.undefined
  var openTransitionName: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionNameType */ js.Any
  ] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object GetMotionProps {
  @scala.inline
  def apply(): GetMotionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMotionProps]
  }
  @scala.inline
  implicit class GetMotionPropsOps[Self <: GetMotionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMotion(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any
    ): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotion: Self = this.set("motion", js.undefined)
    @scala.inline
    def setOpenAnimation(value: OpenAnimation): Self = this.set("openAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenAnimation: Self = this.set("openAnimation", js.undefined)
    @scala.inline
    def setOpenTransitionName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionNameType */ js.Any
    ): Self = this.set("openTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenTransitionName: Self = this.set("openTransitionName", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

