package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.errorMod.FirebaseStorageError
import typingsSlinky.firebaseStorage.requestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object failrequestMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/failrequest", "FailRequest")
  @js.native
  class FailRequest[T] protected () extends Request[T] {
    def this(error: FirebaseStorageError) = this()
    
    var promise_ : js.Promise[T] = js.native
  }
}
