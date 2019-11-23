package typingsSlinky.reactDashNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
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
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNavigation.reactDashNavigationMod.Themed.TextInput].asInstanceOf[String | js.Object]
  def apply(props: ThemedTextInputProps with js.Object, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, TextInput] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ThemedTextInputProps
}

