package typingsSlinky.reactDashNavigation.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.Themed.TextInput
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.ThemedTextInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNavigation), Name(reactDashNavigationMod), Name(ThemedTextInputProps))) was not a @ScalaJSDefined trait */
object ThemedTextInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, TextInput] {
  @JSImport("react-navigation", "Themed.TextInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ThemedTextInputProps
}

