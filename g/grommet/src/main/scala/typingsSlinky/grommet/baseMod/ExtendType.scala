package typingsSlinky.grommet.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[/ * args * / js.Any, scala.Unit]
*/
trait ExtendType extends js.Object

object ExtendType {
  @scala.inline
  implicit def apply(value: js.Function1[/* args */ js.Any, Unit]): ExtendType = value.asInstanceOf[ExtendType]
  @scala.inline
  implicit def apply(value: String): ExtendType = value.asInstanceOf[ExtendType]
}

