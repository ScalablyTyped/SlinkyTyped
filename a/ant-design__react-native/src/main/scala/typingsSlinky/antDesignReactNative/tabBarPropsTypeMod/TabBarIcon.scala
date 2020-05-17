package typingsSlinky.antDesignReactNative.tabBarPropsTypeMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNative.mod.ImageURISource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.ImageURISource
  - js.Array[typingsSlinky.reactNative.mod.ImageURISource]
  - typingsSlinky.reactNative.mod.ImageRequireSource
  - typingsSlinky.react.mod.ReactNode
*/
trait TabBarIcon extends js.Object

object TabBarIcon {
  @scala.inline
  implicit def apply(value: js.Array[ImageURISource]): TabBarIcon = value.asInstanceOf[TabBarIcon]
  @scala.inline
  implicit def apply(value: ImageRequireSource): TabBarIcon = value.asInstanceOf[TabBarIcon]
  @scala.inline
  implicit def apply(value: ImageURISource): TabBarIcon = value.asInstanceOf[TabBarIcon]
  @scala.inline
  implicit def apply(value: TagMod[Any]): TabBarIcon = value.asInstanceOf[TabBarIcon]
}

