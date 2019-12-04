package typingsSlinky.reactDashNavigationDashStack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BackButtonWeb
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-navigation-stack/lib/typescript/views/Header/BackButtonWeb", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(tintColor: String, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(tintColor = tintColor.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsHeaderBackButtonWebMod.Props
}

