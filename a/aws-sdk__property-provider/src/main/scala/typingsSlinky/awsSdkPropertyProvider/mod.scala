package typingsSlinky.awsSdkPropertyProvider

import typingsSlinky.awsSdkPropertyProvider.memoizeMod.MemoizeOverload
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/property-provider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def chain[T](providers: Provider[T]*): Provider[T] = js.native
  
  def fromStatic[T](staticValue: T): Provider[T] = js.native
  
  val memoize: MemoizeOverload = js.native
  
  @js.native
  class ProviderError protected ()
    extends typingsSlinky.awsSdkPropertyProvider.providerErrorMod.ProviderError {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
  }
}
