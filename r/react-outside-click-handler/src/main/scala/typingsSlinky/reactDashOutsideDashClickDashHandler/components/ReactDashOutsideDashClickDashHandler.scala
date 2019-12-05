package typingsSlinky.reactDashOutsideDashClickDashHandler.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashOutsideDashClickDashHandler
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onOutsideClick: SyntheticMouseEvent[HTMLElement] => Unit,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerMod.Props
}

