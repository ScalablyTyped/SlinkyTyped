package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.issueAdded
import typingsSlinky.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Audits.IssueAddedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditsApi extends StObject {
  
  /**
    * Disables issues domain, prevents further issues from being reported to the client.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables issues domain, sends the issues collected so far to the client by means of the
    * `issueAdded` event.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Returns the response body and size if it were re-encoded with the specified settings. Only
    * applies to images.
    */
  def getEncodedResponse(params: GetEncodedResponseRequest): js.Promise[GetEncodedResponseResponse] = js.native
  
  @JSName("on")
  def on_issueAdded(event: issueAdded, listener: js.Function1[/* params */ IssueAddedEvent, Unit]): Unit = js.native
}
object AuditsApi {
  
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getEncodedResponse: GetEncodedResponseRequest => js.Promise[GetEncodedResponseResponse],
    on: (issueAdded, js.Function1[/* params */ IssueAddedEvent, Unit]) => Unit
  ): AuditsApi = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getEncodedResponse = js.Any.fromFunction1(getEncodedResponse), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[AuditsApi]
  }
  
  @scala.inline
  implicit class AuditsApiMutableBuilder[Self <: AuditsApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEncodedResponse(value: GetEncodedResponseRequest => js.Promise[GetEncodedResponseResponse]): Self = StObject.set(x, "getEncodedResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (issueAdded, js.Function1[/* params */ IssueAddedEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
