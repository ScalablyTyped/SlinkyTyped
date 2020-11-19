package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.indexMod.Index
import typingsSlinky.firebaseDatabase.nodeFilterMod.NodeFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/view/filter/IndexedFilter", JSImport.Namespace)
@js.native
object indexedFilterMod extends js.Object {
  
  @js.native
  class IndexedFilter protected () extends NodeFilter {
    def this(index_ : Index) = this()
    
    val index_ : js.Any = js.native
  }
}
