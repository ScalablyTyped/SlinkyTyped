package typingsSlinky.awsSdkPropertyProvider

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/property-provider/dist/cjs/ProviderError", JSImport.Namespace)
@js.native
object providerErrorMod extends js.Object {
  
  @js.native
  class ProviderError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
    
    val tryNextLink: Boolean = js.native
  }
}
