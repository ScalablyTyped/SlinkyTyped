package typingsSlinky.mongodbMemoryServerCore.getosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodbMemoryServerCore.getosMod.OtherOS
  - typingsSlinky.mongodbMemoryServerCore.getosMod.LinuxOS
*/
trait AnyOS extends js.Object

object AnyOS {
  @scala.inline
  implicit def apply(value: LinuxOS): AnyOS = value.asInstanceOf[AnyOS]
  @scala.inline
  implicit def apply(value: OtherOS): AnyOS = value.asInstanceOf[AnyOS]
}

