package typingsSlinky.jimpCore.pluginsMod

import typingsSlinky.jimpCore.etcMod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jimpCore.pluginsMod.ClassOrConstantPlugin[T]
  - typingsSlinky.jimpCore.pluginsMod.IllformedPlugin
*/
trait JimpPlugin[T /* <: Image */] extends js.Object

object JimpPlugin {
  @scala.inline
  implicit def apply[T](value: ClassOrConstantPlugin[T]): JimpPlugin[T] = value.asInstanceOf[JimpPlugin[T]]
  @scala.inline
  implicit def apply[T](value: IllformedPlugin): JimpPlugin[T] = value.asInstanceOf[JimpPlugin[T]]
}

