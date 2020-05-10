package typingsSlinky.reactPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.reactPose.AnonCurrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  children ? :any,   pose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   _pose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   initialPose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   withParent ? :boolean, onPoseComplete ? (pose : react-pose.react-pose/lib/components/PoseElement/types.CurrentPose): any,   onValueChange ? :{[key: string] : (v : any): any},   innerRef ? :{  current  :any} | react-pose.react-pose/lib/components/PoseElement/types.RefFunc, [key: string] : any} & react-pose.react-pose/lib/components/PoseElement/types.PoseContextProps */
@js.native
trait PoseElementProps
  extends /* key */ StringDictionary[js.Any] {
  var _pose: js.UndefOr[CurrentPose] = js.native
  var children: js.UndefOr[js.Any] = js.native
  var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.native
  var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.native
  var initialPose: js.UndefOr[CurrentPose] = js.native
  var innerRef: js.UndefOr[AnonCurrent | RefFunc] = js.native
  var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, _]] = js.native
  var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.native
  var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ js.Any, _]]] = js.native
  var pose: js.UndefOr[CurrentPose] = js.native
  var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.native
  var withParent: js.UndefOr[Boolean] = js.native
}

object PoseElementProps {
  @scala.inline
  def apply(): PoseElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoseElementProps]
  }
  @scala.inline
  implicit class PoseElementPropsOps[Self <: PoseElementProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_pose(value: CurrentPose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_pose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pose")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
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
    def withInitialPose(value: CurrentPose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPose")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefFunction1(value: /* el */ Element => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRef(value: AnonCurrent | RefFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPoseComplete(value: /* pose */ CurrentPose => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPoseComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPoseComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPoseComplete")(js.undefined)
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
    def withOnValueChange(value: StringDictionary[js.Function1[/* v */ js.Any, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPose(value: CurrentPose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pose")(js.undefined)
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
    @scala.inline
    def withWithParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withParent")(js.undefined)
        ret
    }
  }
  
}

