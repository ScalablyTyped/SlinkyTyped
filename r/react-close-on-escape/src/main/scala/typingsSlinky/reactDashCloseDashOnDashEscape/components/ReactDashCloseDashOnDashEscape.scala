package typingsSlinky.reactDashCloseDashOnDashEscape.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCloseDashOnDashEscape.reactDashCloseDashOnDashEscapeMod.CloseOnEscapeProps
import typingsSlinky.reactDashCloseDashOnDashEscape.reactDashCloseDashOnDashEscapeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashCloseDashOnDashEscape
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-close-on-escape", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(onEscape: () => Unit, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onEscape = js.Any.fromFunction0(onEscape))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CloseOnEscapeProps
}

