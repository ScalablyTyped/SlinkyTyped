package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.accepted
import typingsSlinky.devtoolsProtocol.mod.Protocol.Tethering.AcceptedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Tethering.BindRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Tethering.UnbindRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TetheringApi extends StObject {
  
  /**
    * Request browser port binding.
    */
  def bind(params: BindRequest): js.Promise[Unit] = js.native
  
  /**
    * Informs that port was successfully bound and got a specified connection id.
    */
  @JSName("on")
  def on_accepted(event: accepted, listener: js.Function1[/* params */ AcceptedEvent, Unit]): Unit = js.native
  
  /**
    * Request browser port unbinding.
    */
  def unbind(params: UnbindRequest): js.Promise[Unit] = js.native
}
object TetheringApi {
  
  @scala.inline
  def apply(
    bind: BindRequest => js.Promise[Unit],
    on: (accepted, js.Function1[/* params */ AcceptedEvent, Unit]) => Unit,
    unbind: UnbindRequest => js.Promise[Unit]
  ): TetheringApi = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), on = js.Any.fromFunction2(on), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[TetheringApi]
  }
  
  @scala.inline
  implicit class TetheringApiMutableBuilder[Self <: TetheringApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: BindRequest => js.Promise[Unit]): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (accepted, js.Function1[/* params */ AcceptedEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnbind(value: UnbindRequest => js.Promise[Unit]): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
  }
}
