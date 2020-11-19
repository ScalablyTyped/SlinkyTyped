package typingsSlinky.recurlyRecurlyJs.paypalMod

import typingsSlinky.recurlyRecurlyJs.emitterMod.Emitter
import typingsSlinky.recurlyRecurlyJs.errorMod.RecurlyError
import typingsSlinky.recurlyRecurlyJs.tokenMod.TokenHandler
import typingsSlinky.recurlyRecurlyJs.tokenMod.TokenPayload
import typingsSlinky.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayPalInstance extends Emitter[PayPalEvent] {
  
  def destroy(): Unit = js.native
  @JSName("destroy")
  var destroy_Original: VoidFunction = js.native
  
  def start(): Unit = js.native
  def start(payPalStartOptions: PayPalStartOptions): Unit = js.native
  
  def token(error: Null, token: TokenPayload): Unit = js.native
  def token(error: RecurlyError, token: TokenPayload): Unit = js.native
  @JSName("token")
  var token_Original: TokenHandler = js.native
}
