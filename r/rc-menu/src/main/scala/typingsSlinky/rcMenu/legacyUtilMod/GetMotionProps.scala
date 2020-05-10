package typingsSlinky.rcMenu.legacyUtilMod

import typingsSlinky.rcMenu.interfaceMod.OpenAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMotionProps extends js.Object {
  var motion: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any
  ] = js.native
  var openAnimation: js.UndefOr[OpenAnimation] = js.native
  var openTransitionName: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionNameType */ js.Any
  ] = js.native
  var prefixCls: js.UndefOr[String] = js.native
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
    def withMotion(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenAnimation(value: OpenAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenTransitionName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionNameType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTransitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
  }
  
}

