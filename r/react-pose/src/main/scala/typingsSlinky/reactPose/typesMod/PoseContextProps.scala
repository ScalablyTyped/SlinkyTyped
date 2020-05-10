package typingsSlinky.reactPose.typesMod

import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoseContextProps extends js.Object {
  var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.native
  var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.native
  var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.native
  var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.native
}

object PoseContextProps {
  @scala.inline
  def apply(): PoseContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoseContextProps]
  }
  @scala.inline
  implicit class PoseContextPropsOps[Self <: PoseContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInitialPoseFromParent(value: () => CurrentPose | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialPoseFromParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInitialPoseFromParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialPoseFromParent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParentPoseConfig(value: () => DomPopmotionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentPoseConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParentPoseConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentPoseConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnmount(value: /* child */ DomPopmotionPoser => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnmount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterChild(value: /* props */ ChildRegistration => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegisterChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerChild")(js.undefined)
        ret
    }
  }
  
}

