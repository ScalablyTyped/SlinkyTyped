package typingsSlinky.reduxFirstRouterLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - js.Object
*/
trait To extends js.Object

object To {
  @scala.inline
  implicit def apply(value: js.Array[String]): To = value.asInstanceOf[To]
  @scala.inline
  implicit def apply(value: js.Object): To = value.asInstanceOf[To]
  @scala.inline
  implicit def apply(value: String): To = value.asInstanceOf[To]
}

