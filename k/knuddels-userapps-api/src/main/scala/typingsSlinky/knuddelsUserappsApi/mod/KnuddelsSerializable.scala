package typingsSlinky.knuddelsUserappsApi.mod

import typingsSlinky.knuddelsUserappsApi.mod.global.BotUser
import typingsSlinky.knuddelsUserappsApi.mod.global.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.knuddelsUserappsApi.mod.global.User
  - typingsSlinky.knuddelsUserappsApi.mod.global.BotUser
  - js.UndefOr[scala.Nothing]
*/
trait KnuddelsSerializable extends KnuddelsJsonData

object KnuddelsSerializable {
  @scala.inline
  implicit def apply(value: Boolean): KnuddelsSerializable = value.asInstanceOf[KnuddelsSerializable]
  @scala.inline
  implicit def apply(value: BotUser): KnuddelsSerializable = value.asInstanceOf[KnuddelsSerializable]
  @scala.inline
  implicit def apply(value: Double): KnuddelsSerializable = value.asInstanceOf[KnuddelsSerializable]
  @scala.inline
  implicit def apply(value: String): KnuddelsSerializable = value.asInstanceOf[KnuddelsSerializable]
  @scala.inline
  implicit def apply(value: User): KnuddelsSerializable = value.asInstanceOf[KnuddelsSerializable]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => KnuddelsSerializable): KnuddelsSerializable = value.asInstanceOf[KnuddelsSerializable]
}

