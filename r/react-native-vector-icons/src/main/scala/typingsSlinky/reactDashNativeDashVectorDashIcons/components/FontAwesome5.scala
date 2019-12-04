package typingsSlinky.reactDashNativeDashVectorDashIcons.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.FontAwesome5IconProps
import typingsSlinky.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNativeDashVectorDashIcons), Name(fontAwesome5Mod), Name(FontAwesome5IconProps))) was not a @ScalaJSDefined trait */
object FontAwesome5
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = FontAwesome5IconProps
}

