package typingsSlinky.rcMenu.interfaceMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - js.Function1[/ * props * / js.Any, typingsSlinky.react.mod.ReactNode]
*/
trait RenderIconType extends js.Object

object RenderIconType {
  @scala.inline
  implicit def apply(value: js.Function1[/* props */ js.Any, TagMod[Any]]): RenderIconType = value.asInstanceOf[RenderIconType]
  @scala.inline
  implicit def apply(value: TagMod[Any]): RenderIconType = value.asInstanceOf[RenderIconType]
}

