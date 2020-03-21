package typingsSlinky.reactNativeVectorIcons.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps
import typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactNativeVectorIcons), Name(fontAwesome5Mod), Name(FontAwesome5IconProps))),IArray(),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object FontAwesome5
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = FontAwesome5IconProps
}

