package typingsSlinky.reactPose.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.reactPose.AnonCurrent
import typingsSlinky.reactPose.typesMod.ChildRegistration
import typingsSlinky.reactPose.typesMod.ConfigFactory
import typingsSlinky.reactPose.typesMod.CurrentPose
import typingsSlinky.reactPose.typesMod.PoseElementInternalProps
import typingsSlinky.reactPose.typesMod.RefFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PoseElement
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactPose.poseElementMod.PoseElement] {
  @JSImport("react-pose/lib/components/PoseElement", "PoseElement")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    elementType: js.Any,
    poseConfig: DomPopmotionConfig | ConfigFactory,
    _pose: CurrentPose = null,
    getInitialPoseFromParent: () => CurrentPose | Unit = null,
    getParentPoseConfig: () => DomPopmotionConfig = null,
    initialPose: CurrentPose = null,
    innerRef: AnonCurrent | RefFunc = null,
    onPoseComplete: /* pose */ CurrentPose => _ = null,
    onUnmount: /* child */ DomPopmotionPoser => _ = null,
    pose: CurrentPose = null,
    registerChild: /* props */ ChildRegistration => Unit = null,
    withParent: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactPose.poseElementMod.PoseElement] = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
    if (_pose != null) __obj.updateDynamic("_pose")(_pose.asInstanceOf[js.Any])
    if (getInitialPoseFromParent != null) __obj.updateDynamic("getInitialPoseFromParent")(js.Any.fromFunction0(getInitialPoseFromParent))
    if (getParentPoseConfig != null) __obj.updateDynamic("getParentPoseConfig")(js.Any.fromFunction0(getParentPoseConfig))
    if (initialPose != null) __obj.updateDynamic("initialPose")(initialPose.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onPoseComplete != null) __obj.updateDynamic("onPoseComplete")(js.Any.fromFunction1(onPoseComplete))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction1(onUnmount))
    if (pose != null) __obj.updateDynamic("pose")(pose.asInstanceOf[js.Any])
    if (registerChild != null) __obj.updateDynamic("registerChild")(js.Any.fromFunction1(registerChild))
    if (!js.isUndefined(withParent)) __obj.updateDynamic("withParent")(withParent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PoseElementInternalProps
}

