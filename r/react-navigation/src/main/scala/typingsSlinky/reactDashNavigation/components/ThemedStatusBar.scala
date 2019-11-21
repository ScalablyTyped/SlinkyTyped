package typingsSlinky.reactDashNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.Themed.StatusBar
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.ThemedStatusBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble it yourself using js.Dynamic.literal(...) or similar */
object ThemedStatusBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, StatusBar] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNavigation.reactDashNavigationMod.Themed.StatusBar].asInstanceOf[String | js.Object]
  def apply(props: ThemedStatusBarProps with js.Object, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, StatusBar] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = js.Object
}

