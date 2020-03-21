package typingsSlinky.reactNative.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.Animated.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactNative), Name(mod), Name(Animated), Name(AnimatedProps))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactNative), Name(mod), Name(Animated), Name(ComponentProps))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactNative), Name(mod), Name(Image))),IArray(),NoComments)),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),NoComments) because couldn't resolve ClassTree. */
object AnimatedImage
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-native", "Animated.Image")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AnimatedProps[ComponentProps[typingsSlinky.reactNative.mod.Image]]
}

