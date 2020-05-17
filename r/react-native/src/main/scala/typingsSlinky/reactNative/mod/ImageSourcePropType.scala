package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.ImageURISource
  - js.Array[typingsSlinky.reactNative.mod.ImageURISource]
  - typingsSlinky.reactNative.mod.ImageRequireSource
*/
trait ImageSourcePropType extends js.Object

object ImageSourcePropType {
  @scala.inline
  implicit def apply(value: js.Array[ImageURISource]): ImageSourcePropType = value.asInstanceOf[ImageSourcePropType]
  @scala.inline
  implicit def apply(value: ImageRequireSource): ImageSourcePropType = value.asInstanceOf[ImageSourcePropType]
  @scala.inline
  implicit def apply(value: ImageURISource): ImageSourcePropType = value.asInstanceOf[ImageSourcePropType]
}

