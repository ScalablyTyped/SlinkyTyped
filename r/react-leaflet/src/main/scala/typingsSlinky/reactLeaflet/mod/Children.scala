package typingsSlinky.reactLeaflet.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - js.Array[typingsSlinky.react.mod.ReactNode]
*/
trait Children extends js.Object

object Children {
  @scala.inline
  implicit def apply(value: js.Array[TagMod[Any]]): Children = value.asInstanceOf[Children]
  @scala.inline
  implicit def apply(value: TagMod[Any]): Children = value.asInstanceOf[Children]
}

