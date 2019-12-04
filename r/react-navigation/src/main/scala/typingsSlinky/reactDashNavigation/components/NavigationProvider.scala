package typingsSlinky.reactDashNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNavigation.Anon_Value
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationProvider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationProvider
    ] {
  @JSImport("react-navigation", "NavigationProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(value: NavigationProp[_], overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationProvider
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Anon_Value
}

