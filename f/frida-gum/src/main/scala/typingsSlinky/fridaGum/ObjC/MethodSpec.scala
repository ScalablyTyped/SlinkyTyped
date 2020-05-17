package typingsSlinky.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.ObjC.SimpleMethodSpec[I]
  - typingsSlinky.fridaGum.ObjC.DetailedMethodSpec[I]
*/
trait MethodSpec[I] extends js.Object

object MethodSpec {
  @scala.inline
  implicit def apply[I](value: DetailedMethodSpec[I]): MethodSpec[I] = value.asInstanceOf[MethodSpec[I]]
  @scala.inline
  implicit def apply[I](value: SimpleMethodSpec[I]): MethodSpec[I] = value.asInstanceOf[MethodSpec[I]]
}

