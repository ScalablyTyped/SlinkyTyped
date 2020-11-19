package typingsSlinky.reduxLocalstorageDebounce.mod

import typingsSlinky.reduxLocalstorage.mod.StorageAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-localstorage-debounce", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(wait: Double): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  def apply(wait: Double, options: Double): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  def apply(wait: Double, options: DebounceOptions): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
}
