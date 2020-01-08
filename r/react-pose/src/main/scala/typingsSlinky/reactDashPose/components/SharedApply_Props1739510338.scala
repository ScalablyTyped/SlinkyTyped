package typingsSlinky.reactDashPose.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_Props1739510338[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    animateOnMount: js.UndefOr[Boolean] = js.undefined,
    enterAfterExit: js.UndefOr[Boolean] = js.undefined,
    enterPose: String = null,
    exitPose: String = null,
    flipMove: js.UndefOr[Boolean] = js.undefined,
    onRest: () => Unit = null,
    preEnterPose: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateOnMount)) __obj.updateDynamic("animateOnMount")(animateOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(enterAfterExit)) __obj.updateDynamic("enterAfterExit")(enterAfterExit.asInstanceOf[js.Any])
    if (enterPose != null) __obj.updateDynamic("enterPose")(enterPose.asInstanceOf[js.Any])
    if (exitPose != null) __obj.updateDynamic("exitPose")(exitPose.asInstanceOf[js.Any])
    if (!js.isUndefined(flipMove)) __obj.updateDynamic("flipMove")(flipMove.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    if (preEnterPose != null) __obj.updateDynamic("preEnterPose")(preEnterPose.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashPose.libComponentsTransitionTypesMod.Props
}

