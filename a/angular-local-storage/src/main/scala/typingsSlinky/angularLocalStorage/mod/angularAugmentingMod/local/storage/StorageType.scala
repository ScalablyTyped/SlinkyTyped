package typingsSlinky.angularLocalStorage.mod.angularAugmentingMod.local.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularLocalStorage.angularLocalStorageStrings.localStorage
  - typingsSlinky.angularLocalStorage.angularLocalStorageStrings.sessionStorage
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typingsSlinky.angularLocalStorage.angularLocalStorageStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def sessionStorage: typingsSlinky.angularLocalStorage.angularLocalStorageStrings.sessionStorage = this.cast("sessionStorage")
}

