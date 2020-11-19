package typingsSlinky.awsSdkHttpHeaders

import typingsSlinky.awsSdkHttpHeaders.awsSdkHttpHeadersStrings.Map
import typingsSlinky.awsSdkTypes.httpMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/http-headers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class HttpHeaders () extends Headers {
    def this(entries: js.Iterable[js.Tuple2[String, String]]) = this()
    
    @JSName("clone")
    var clone_FHttpHeaders: js.Any = js.native
    
    var originalHeaders: js.Any = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_HttpHeaders: Map = js.native
  }
}
