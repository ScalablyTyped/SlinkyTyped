package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreNumbers.`false`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onClick
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseDown
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseUp
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchEnd
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchStart
import typingsSlinky.atMaterialDashUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
import typingsSlinky.atMaterialDashUiCore.clickAwayListenerMod.default
import typingsSlinky.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClickAwayListener
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atMaterialDashUiCore.clickAwayListenerMod.default].asInstanceOf[String | js.Object]
  def apply(
    onClickAway: ChangeEvent[js.Object] => Unit,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ClickAwayListenerProps
}

