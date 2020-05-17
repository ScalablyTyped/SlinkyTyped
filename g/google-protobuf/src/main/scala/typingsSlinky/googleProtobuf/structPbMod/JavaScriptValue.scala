package typingsSlinky.googleProtobuf.structPbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Double
  - java.lang.String
  - scala.Boolean
  - js.Array[js.Any]
  - js.Object
*/
trait JavaScriptValue extends js.Object

object JavaScriptValue {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): JavaScriptValue = value.asInstanceOf[JavaScriptValue]
  @scala.inline
  implicit def apply(value: Boolean): JavaScriptValue = value.asInstanceOf[JavaScriptValue]
  @scala.inline
  implicit def apply(value: Double): JavaScriptValue = value.asInstanceOf[JavaScriptValue]
  @scala.inline
  implicit def apply(value: Null): JavaScriptValue = value.asInstanceOf[JavaScriptValue]
  @scala.inline
  implicit def apply(value: js.Object): JavaScriptValue = value.asInstanceOf[JavaScriptValue]
  @scala.inline
  implicit def apply(value: String): JavaScriptValue = value.asInstanceOf[JavaScriptValue]
}

