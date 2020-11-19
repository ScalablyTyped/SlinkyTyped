package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.errorMod.FirebaseStorageError
import typingsSlinky.firebaseStorage.requestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/failrequest", JSImport.Namespace)
@js.native
object failrequestMod extends js.Object {
  
  @js.native
  class FailRequest[T] protected () extends Request[T] {
    def this(error: FirebaseStorageError) = this()
    
    var promise_ : js.Promise[T] = js.native
  }
}
