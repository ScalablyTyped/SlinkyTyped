package typingsSlinky.awsCryptoSha256Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-crypto/sha256-js/build/RawSha256", JSImport.Namespace)
@js.native
object rawSha256Mod extends js.Object {
  
  @js.native
  class RawSha256 () extends js.Object {
    
    var buffer: js.Any = js.native
    
    var bufferLength: js.Any = js.native
    
    var bytesHashed: js.Any = js.native
    
    def digest(): js.typedarray.Uint8Array = js.native
    
    /**
      * @internal
      */
    var finished: Boolean = js.native
    
    var hashBuffer: js.Any = js.native
    
    var state: js.Any = js.native
    
    var temp: js.Any = js.native
    
    def update(data: js.typedarray.Uint8Array): Unit = js.native
  }
}
