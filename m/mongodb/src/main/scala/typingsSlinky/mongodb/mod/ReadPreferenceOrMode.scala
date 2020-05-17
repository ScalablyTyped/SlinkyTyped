package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.ReadPreference
  - typingsSlinky.mongodb.mod.ReadPreferenceMode
*/
trait ReadPreferenceOrMode extends js.Object

object ReadPreferenceOrMode {
  @scala.inline
  implicit def apply(value: ReadPreference): ReadPreferenceOrMode = value.asInstanceOf[ReadPreferenceOrMode]
  @scala.inline
  implicit def apply(value: ReadPreferenceMode): ReadPreferenceOrMode = value.asInstanceOf[ReadPreferenceOrMode]
}

