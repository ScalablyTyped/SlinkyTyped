package typingsSlinky.atMaterialDashUiLab.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.ClassNameMap
import typingsSlinky.atMaterialDashUiLab.PartialFabProps
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.down
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.left
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.right
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.up
import typingsSlinky.atMaterialDashUiLab.speedDialSpeedDialMod.CloseReason
import typingsSlinky.atMaterialDashUiLab.speedDialSpeedDialMod.OpenReason
import typingsSlinky.atMaterialDashUiLab.speedDialSpeedDialMod.SpeedDialClassKey
import typingsSlinky.atMaterialDashUiLab.speedDialSpeedDialMod.SpeedDialProps
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashTransitionDashGroup.Anon_Appear
import typingsSlinky.reactDashTransitionDashGroup.transitionMod.TransitionProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SpeedDial
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@material-ui/lab/SpeedDial/SpeedDial", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, hidden, open */
  def apply(
    ariaLabel: String,
    FabProps: PartialFabProps = null,
    TransitionComponent: ReactComponentClass[TransitionProps] = null,
    TransitionProps: TransitionProps = null,
    classes: Partial[ClassNameMap[SpeedDialClassKey]] = null,
    direction: up | down | left | right = null,
    icon: TagMod[Any] = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    onClose: (/* event */ SyntheticEvent[Event, js.Object], /* reason */ CloseReason) => Unit = null,
    onOpen: (/* event */ SyntheticEvent[Event, js.Object], /* reason */ OpenReason) => Unit = null,
    openIcon: TagMod[Any] = null,
    style: CSSProperties = null,
    transitionDuration: Double | Anon_Appear = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any])
    if (FabProps != null) __obj.updateDynamic("FabProps")(FabProps.asInstanceOf[js.Any])
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SpeedDialProps
}

