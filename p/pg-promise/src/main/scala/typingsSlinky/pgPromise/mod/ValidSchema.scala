package typingsSlinky.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - scala.Null
  - scala.Unit
*/
trait ValidSchema extends js.Object

object ValidSchema {
  @scala.inline
  implicit def apply(value: js.Array[String]): ValidSchema = value.asInstanceOf[ValidSchema]
  @scala.inline
  implicit def apply(value: Null): ValidSchema = value.asInstanceOf[ValidSchema]
  @scala.inline
  implicit def apply(value: String): ValidSchema = value.asInstanceOf[ValidSchema]
  @scala.inline
  implicit def apply(value: Unit): ValidSchema = value.asInstanceOf[ValidSchema]
}

