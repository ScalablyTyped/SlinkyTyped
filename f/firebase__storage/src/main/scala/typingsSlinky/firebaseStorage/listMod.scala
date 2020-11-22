package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.referenceMod.ReferenceCompat
import typingsSlinky.firebaseStorage.serviceMod.StorageServiceCompat
import typingsSlinky.firebaseStorageTypes.mod.ListResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/compat/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  
  @js.native
  class ListResultCompat protected () extends ListResult {
    def this(_delegate: typingsSlinky.firebaseStorage.srcListMod.ListResult, _service: StorageServiceCompat) = this()
    
    val _delegate: js.Any = js.native
    
    val _service: js.Any = js.native
    
    @JSName("items")
    def items_MListResultCompat: js.Array[ReferenceCompat] = js.native
    
    @JSName("nextPageToken")
    def nextPageToken_MListResultCompat: String | Null = js.native
    
    @JSName("prefixes")
    def prefixes_MListResultCompat: js.Array[ReferenceCompat] = js.native
  }
}
