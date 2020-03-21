package typingsSlinky.rsocketCore

import typingsSlinky.rsocketCore.rsocketleaseMod.RequesterLeaseHandler
import typingsSlinky.rsocketCore.rsocketleaseMod.ResponderLeaseHandler
import typingsSlinky.rsocketCore.rsocketserializationMod.PayloadSerializers
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Responder
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketMachine", JSImport.Namespace)
@js.native
object rsocketmachineMod extends js.Object {
  @js.native
  trait RSocketMachine[D, M] extends ReactiveSocket[D, M] {
    def setRequestHandler(): Unit = js.native
    def setRequestHandler(requestHandler: Partial[Responder[D, M]]): Unit = js.native
  }
  
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]]
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit]
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
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
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ js.Error, Unit]
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ js.Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
}

