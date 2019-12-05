package typingsSlinky.reactDashNativeDashElements.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.SearchBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNativeDashElements), Name(reactDashNativeDashElementsMod), Name(SearchBarProps))) was not a @ScalaJSDefined trait */
object SearchBar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.SearchBar
    ] {
  @JSImport("react-native-elements", "SearchBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = SearchBarProps
}

