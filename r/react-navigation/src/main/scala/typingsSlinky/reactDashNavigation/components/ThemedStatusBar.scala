package typingsSlinky.reactDashNavigation.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.Themed.StatusBar
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.ThemedStatusBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNavigation), Name(reactDashNavigationMod), Name(ThemedStatusBarProps))) was not a @ScalaJSDefined trait */
object ThemedStatusBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, StatusBar] {
  @JSImport("react-navigation", "Themed.StatusBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ThemedStatusBarProps
}

