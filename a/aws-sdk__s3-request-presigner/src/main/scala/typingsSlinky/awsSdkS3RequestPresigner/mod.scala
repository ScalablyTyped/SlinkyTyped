package typingsSlinky.awsSdkS3RequestPresigner

import typingsSlinky.awsSdkS3RequestPresigner.anon.PartialBySignatureV4InitS
import typingsSlinky.awsSdkTypes.signatureMod.RequestPresigner
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/s3-request-presigner", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class S3RequestPresigner protected () extends RequestPresigner {
    def this(hasServiceUriEscapePathRest: PartialBySignatureV4InitS) = this()
    
    val signer: js.Any = js.native
  }
  
  /**
    * PartialBy<T, K> makes properties specified in K optional in interface T
    * see: https://stackoverflow.com/questions/43159887/make-a-single-property-optional-in-typescript
    * */
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type PartialBy[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) with (Partial[Pick[T, K]])
}
