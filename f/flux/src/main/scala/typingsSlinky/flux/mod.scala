package typingsSlinky.flux

import typingsSlinky.flux.dispatcherMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flux", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Create an instance of the Dispatcher class to use throughout the application.
    *
    * Specify a type in the 'TPayload' generic argument to use strongly-typed payloads,
    * otherwise specify 'any'
    *
    * Examples:
    *     var dispatcher = new flux.Dispatcher<any>()
    *     var typedDispatcher = new flux.Dispatcher<MyCustomActionType>()
    */
  class Dispatcher[TPayload] () extends ^[TPayload]
}
