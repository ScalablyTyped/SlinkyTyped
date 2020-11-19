package typingsSlinky.openfin.transportMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.openfin.anon.Reject
import typingsSlinky.openfin.environmentMod.Environment
import typingsSlinky.openfin.eventAggregatorMod.EventAggregator
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.openfinBooleans.`true`
import typingsSlinky.openfin.openfinStrings.`request-external-authorization`
import typingsSlinky.openfin.utilEntityTypeMod.EntityTypeHelpers
import typingsSlinky.openfin.wireMod.ConnectConfig
import typingsSlinky.openfin.wireMod.ExistingConnectConfig
import typingsSlinky.openfin.wireMod.InternalConnectConfig
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends EventEmitter {
  
  var READY_STATE: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ js.Any = js.native
  
  /* protected */ def addWireListener(id: Double, resolve: js.Function, reject: js.Function, uncorrelated: Boolean): Unit = js.native
  
  def connect(config: InternalConnectConfig): js.Promise[String] = js.native
  
  def connectByPort(config: ExistingConnectConfig): js.Promise[String] = js.native
  
  def connectSync(config: ConnectConfig): Unit = js.native
  
  var environment: Environment = js.native
  
  var eventAggregator: EventAggregator = js.native
  
  def ferryAction(data: js.Any): js.Promise[Message[_]] = js.native
  
  def getPort(): String = js.native
  
  /* protected */ def handleMessage(data: Message[Payload]): Boolean = js.native
  
  var me: Identity with EntityTypeHelpers = js.native
  
  var messageHandlers: js.Array[MessageHandler] = js.native
  
  /* protected */ def onmessage(data: Message[Payload]): Unit = js.native
  
  def registerMessageHandler(handler: MessageHandler): Unit = js.native
  
  def sendAction(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
  def sendAction(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
  
  def sendRaw(data: js.Any): js.Promise[_] = js.native
  @JSName("sendRaw")
  var sendRaw_Original: js.Function1[/* data */ js.Any, js.Promise[_]] = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  
  var topicRefMap: Map[String, Double] = js.native
  
  var uncorrelatedListener: js.Function = js.native
  
  var wireListeners: Map[Double, Reject] = js.native
}
