package typingsSlinky.electronSettings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line no-empty-interface
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - typingsSlinky.electronSettings.mod.JsonArray
  - typingsSlinky.electronSettings.mod.JsonObject
*/
trait JsonValue extends js.Object

object JsonValue {
  @scala.inline
  implicit def apply(value: Boolean): JsonValue = value.asInstanceOf[JsonValue]
  @scala.inline
  implicit def apply(value: Double): JsonValue = value.asInstanceOf[JsonValue]
  @scala.inline
  implicit def apply(value: JsonArray): JsonValue = value.asInstanceOf[JsonValue]
  @scala.inline
  implicit def apply(value: JsonObject): JsonValue = value.asInstanceOf[JsonValue]
  @scala.inline
  implicit def apply(value: Null): JsonValue = value.asInstanceOf[JsonValue]
  @scala.inline
  implicit def apply(value: String): JsonValue = value.asInstanceOf[JsonValue]
}

