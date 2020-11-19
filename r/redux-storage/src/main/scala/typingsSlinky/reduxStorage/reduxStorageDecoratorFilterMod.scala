package typingsSlinky.reduxStorage

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.reduxStorage.mod.StorageEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-storage-decorator-filter", JSImport.Namespace)
@js.native
object reduxStorageDecoratorFilterMod extends js.Object {
  
  def default(engine: StorageEngine): StorageEngine = js.native
  def default(engine: StorageEngine, whitelist: js.UndefOr[scala.Nothing], blacklist: FilterList): StorageEngine = js.native
  def default(engine: StorageEngine, whitelist: FilterList): StorageEngine = js.native
  def default(engine: StorageEngine, whitelist: FilterList, blacklist: FilterList): StorageEngine = js.native
  
  type FilterList = NumberDictionary[String | js.Array[String]]
}
