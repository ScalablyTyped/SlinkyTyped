package typingsSlinky.reduxPersist.typesMod

import typingsSlinky.reduxPersist.anon.Persist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxPersist.anon.Persist
  - js.UndefOr[scala.Nothing]
*/
trait PersistedState extends js.Object

object PersistedState {
  @scala.inline
  implicit def apply(value: Persist): PersistedState = value.asInstanceOf[PersistedState]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => PersistedState): PersistedState = value.asInstanceOf[PersistedState]
}

