package typingsSlinky.qtip2.QTip2

import typingsSlinky.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qtip2.JQuery
  - js.Array[scala.Double]
  - java.lang.String
*/
trait Target extends js.Object

object Target {
  @scala.inline
  implicit def apply(value: js.Array[Double]): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: JQuery): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: String): Target = value.asInstanceOf[Target]
}

