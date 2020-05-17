package typingsSlinky.knuddelsUserappsApi.mod

import typingsSlinky.knuddelsUserappsApi.mod.global.KnuddelsJson
import typingsSlinky.knuddelsUserappsApi.mod.global.KnuddelsJsonArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.Date
  - typingsSlinky.knuddelsUserappsApi.mod.global.KnuddelsJson
  - typingsSlinky.knuddelsUserappsApi.mod.global.KnuddelsJsonArray
  - typingsSlinky.knuddelsUserappsApi.mod.KnuddelsSerializable
  - js.UndefOr[scala.Nothing]
*/
trait KnuddelsJsonData extends js.Object

object KnuddelsJsonData {
  @scala.inline
  implicit def apply(value: Boolean): KnuddelsJsonData = value.asInstanceOf[KnuddelsJsonData]
  @scala.inline
  implicit def apply(value: js.Date): KnuddelsJsonData = value.asInstanceOf[KnuddelsJsonData]
  @scala.inline
  implicit def apply(value: Double): KnuddelsJsonData = value.asInstanceOf[KnuddelsJsonData]
  @scala.inline
  implicit def apply(value: KnuddelsJson): KnuddelsJsonData = value.asInstanceOf[KnuddelsJsonData]
  @scala.inline
  implicit def apply(value: KnuddelsJsonArray): KnuddelsJsonData = value.asInstanceOf[KnuddelsJsonData]
  @scala.inline
  implicit def apply(value: KnuddelsSerializable): KnuddelsJsonData = value.asInstanceOf[KnuddelsJsonData]
  @scala.inline
  implicit def apply(value: String): KnuddelsJsonData = value.asInstanceOf[KnuddelsJsonData]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => KnuddelsJsonData): KnuddelsJsonData = value.asInstanceOf[KnuddelsJsonData]
}

