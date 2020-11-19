package typingsSlinky.reduxLocalstorageFilter

import typingsSlinky.reduxLocalstorage.mod.StorageAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-localstorage-filter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  def default(paths: String): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  def default(paths: js.Array[String]): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  
  def getSubset(obj: js.Any, paths: js.Array[String]): js.Any = js.native
}
