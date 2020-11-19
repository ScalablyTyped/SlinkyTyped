package typingsSlinky.firebaseStorage

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/blob", JSImport.Namespace)
@js.native
object blobMod extends js.Object {
  
  @js.native
  class FbsBlob protected () extends js.Object {
    def this(data: js.typedarray.ArrayBuffer) = this()
    def this(data: Blob) = this()
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: js.typedarray.ArrayBuffer, elideCopy: Boolean) = this()
    def this(data: Blob, elideCopy: Boolean) = this()
    def this(data: js.typedarray.Uint8Array, elideCopy: Boolean) = this()
    
    var data_ : js.Any = js.native
    
    def size(): Double = js.native
    
    var size_ : js.Any = js.native
    
    def slice(startByte: Double, endByte: Double): FbsBlob | Null = js.native
    
    def `type`(): String = js.native
    
    var type_ : js.Any = js.native
    
    def uploadData(): Blob | js.typedarray.Uint8Array = js.native
  }
  /* static members */
  @js.native
  object FbsBlob extends js.Object {
    
    def getBlob(args: (String | FbsBlob)*): FbsBlob | Null = js.native
  }
}
