package typingsSlinky.reduxDashStorageDashEngineDashLocalstorage

import typingsSlinky.reduxDashStorage.reduxDashStorageMod.StorageEngine
import typingsSlinky.reduxDashStorageDashEngineDashLocalstorage.reduxDashStorageDashEngineDashLocalstorageMod.Replacer
import typingsSlinky.reduxDashStorageDashEngineDashLocalstorage.reduxDashStorageDashEngineDashLocalstorageMod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-storage-engine-localstorage", JSImport.Namespace)
@js.native
object reduxDashStorageDashEngineDashLocalstorageMod extends js.Object {
  def default(key: String): StorageEngine = js.native
  def default(key: String, replacer: Replacer): StorageEngine = js.native
  def default(key: String, replacer: Replacer, reviver: Reviver): StorageEngine = js.native
  type Replacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
  type Reviver = Replacer
}

