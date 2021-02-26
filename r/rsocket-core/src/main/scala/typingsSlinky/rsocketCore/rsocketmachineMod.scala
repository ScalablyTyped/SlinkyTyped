package typingsSlinky.rsocketCore

import typingsSlinky.rsocketCore.anon.PartialISubscriberFrame
import typingsSlinky.rsocketCore.rsocketleaseMod.RequesterLeaseHandler
import typingsSlinky.rsocketCore.rsocketleaseMod.ResponderLeaseHandler
import typingsSlinky.rsocketCore.rsocketserializationMod.PayloadSerializers
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Responder
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketmachineMod {
  
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: Partial[Responder[D, M]]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createClientMachine")
  @js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: js.UndefOr[scala.Nothing],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.UndefOr[scala.Nothing],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ js.Error, Unit]
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: js.UndefOr[scala.Nothing],
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  @JSImport("rsocket-core/RSocketMachine", "createServerMachine")
  @js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  
  @js.native
  trait RSocketMachine[D, M] extends ReactiveSocket[D, M] {
    
    def setRequestHandler(): Unit = js.native
    def setRequestHandler(requestHandler: Partial[Responder[D, M]]): Unit = js.native
  }
}
