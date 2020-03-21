package typingsSlinky.reactMotionUiPack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import typingsSlinky.reactMotionUiPack.mod.Transition.TransitionProps
import typingsSlinky.reactMotionUiPack.mod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMotionUiPack
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-motion-ui-pack", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    appear: Style = null,
    component: String | Boolean | ReactElement = null,
    enter: Style = null,
    leave: Style = null,
    onEnter: /* style */ PlainStyle => Unit = null,
    onLeave: /* style */ Style => Unit = null,
    runOnMount: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (appear != null) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction1(onLeave))
    if (!js.isUndefined(runOnMount)) __obj.updateDynamic("runOnMount")(runOnMount.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactMotionUiPack.mod.default.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TransitionProps
}

