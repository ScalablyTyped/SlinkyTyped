package typingsSlinky.awsSdkPropertyProvider

import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/property-provider/build/memoize", JSImport.Namespace)
@js.native
object memoizeMod extends js.Object {
  
  def memoize[T](provider: Provider[T]): Provider[T] = js.native
  def memoize[T](provider: Provider[T], isExpired: js.Function1[/* resolved */ T, Boolean]): Provider[T] = js.native
  def memoize[T](
    provider: Provider[T],
    isExpired: js.Function1[/* resolved */ T, Boolean],
    requiresRefresh: js.Function1[/* resolved */ T, Boolean]
  ): Provider[T] = js.native
}
