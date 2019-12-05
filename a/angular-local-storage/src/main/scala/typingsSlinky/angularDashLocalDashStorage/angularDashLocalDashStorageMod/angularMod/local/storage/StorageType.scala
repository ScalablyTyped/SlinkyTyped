package typingsSlinky.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularDashLocalDashStorage.angularDashLocalDashStorageStrings.localStorage
  - typings.angularDashLocalDashStorage.angularDashLocalDashStorageStrings.sessionStorage
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typingsSlinky.angularDashLocalDashStorage.angularDashLocalDashStorageStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def sessionStorage: typingsSlinky.angularDashLocalDashStorage.angularDashLocalDashStorageStrings.sessionStorage = this.cast("sessionStorage")
}

