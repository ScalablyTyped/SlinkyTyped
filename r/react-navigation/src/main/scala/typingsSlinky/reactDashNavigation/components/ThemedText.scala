package typingsSlinky.reactDashNavigation.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.Themed.Text
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.ThemedTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNavigation), Name(reactDashNavigationMod), Name(ThemedTextProps))) was not a @ScalaJSDefined trait */
object ThemedText
  extends ExternalComponentWithAttributesWithRefType[tag.type, Text] {
  @JSImport("react-navigation", "Themed.Text")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ThemedTextProps
}

