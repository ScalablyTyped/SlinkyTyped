package typingsSlinky.knuddelsUserappsApi.mod

import typingsSlinky.knuddelsUserappsApi.mod.global.Json
import typingsSlinky.knuddelsUserappsApi.mod.global.JsonArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.Date
  - typingsSlinky.knuddelsUserappsApi.mod.global.Json
  - typingsSlinky.knuddelsUserappsApi.mod.global.JsonArray
  - js.UndefOr[scala.Nothing]
*/
trait JsonData extends js.Object

object JsonData {
  @scala.inline
  implicit def apply(value: Boolean): JsonData = value.asInstanceOf[JsonData]
  @scala.inline
  implicit def apply(value: js.Date): JsonData = value.asInstanceOf[JsonData]
  @scala.inline
  implicit def apply(value: Double): JsonData = value.asInstanceOf[JsonData]
  @scala.inline
  implicit def apply(value: Json): JsonData = value.asInstanceOf[JsonData]
  @scala.inline
  implicit def apply(value: JsonArray): JsonData = value.asInstanceOf[JsonData]
  @scala.inline
  implicit def apply(value: String): JsonData = value.asInstanceOf[JsonData]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => JsonData): JsonData = value.asInstanceOf[JsonData]
}

