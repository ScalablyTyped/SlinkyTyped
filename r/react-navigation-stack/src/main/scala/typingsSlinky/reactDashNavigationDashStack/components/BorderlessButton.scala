package typingsSlinky.reactDashNavigationDashStack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsBorderlessButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BorderlessButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-stack/lib/typescript/views/BorderlessButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(activeOpacity: Double, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsBorderlessButtonMod.Props
}

