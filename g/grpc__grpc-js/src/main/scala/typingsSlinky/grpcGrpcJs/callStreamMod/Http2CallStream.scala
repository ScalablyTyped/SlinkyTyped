package typingsSlinky.grpcGrpcJs.callStreamMod

import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
import typingsSlinky.grpcGrpcJs.channelMod.ChannelImplementation
import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.filterMod.Filter
import typingsSlinky.grpcGrpcJs.filterStackMod.FilterStackFactory
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.grpcGrpcJs.subchannelMod.Subchannel
import typingsSlinky.node.Buffer
import typingsSlinky.node.http2Mod.ClientHttp2Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/call-stream", "Http2CallStream")
@js.native
class Http2CallStream protected () extends Call {
  def this(
    methodName: String,
    channel: ChannelImplementation,
    options: CallStreamOptions,
    filterStackFactory: FilterStackFactory,
    channelCallCredentials: CallCredentials,
    callNumber: Double
  ) = this()
  val callNumber: js.Any = js.native
  var canPush: js.Any = js.native
  val channel: js.Any = js.native
  val channelCallCredentials: js.Any = js.native
  var credentials: CallCredentials = js.native
  var decoder: js.Any = js.native
  var destroyHttp2Stream: js.Any = js.native
  var disconnectListener: js.Any = js.native
  /**
    * On first call, emits a 'status' event with the given StatusObject.
    * Subsequent calls are no-ops.
    * @param status The status of the call.
    */
  var endCall: js.Any = js.native
  var filterReceivedMessage: js.Any = js.native
  var filterStack: Filter = js.native
  var finalStatus: js.Any = js.native
  var handleFilterError: js.Any = js.native
  var handleFilteredRead: js.Any = js.native
  var handleTrailers: js.Any = js.native
  var http2Stream: js.Any = js.native
  var isReadFilterPending: js.Any = js.native
  var isWriteFilterPending: js.Any = js.native
  var listener: js.Any = js.native
  var mappedStatusCode: js.Any = js.native
  var maybeCloseWrites: js.Any = js.native
  var maybeOutputStatus: js.Any = js.native
  val methodName: js.Any = js.native
  val options: js.Any = js.native
  var outputStatus: js.Any = js.native
  var pendingRead: js.Any = js.native
  var pendingWrite: js.Any = js.native
  var pendingWriteCallback: js.Any = js.native
  var push: js.Any = js.native
  /**
    * Indicates that an 'end' event has come from the http2 stream, so there
    * will be no more data events.
    */
  var readsClosed: js.Any = js.native
  var statusOutput: js.Any = js.native
  var subchannel: js.Any = js.native
  var trace: js.Any = js.native
  var tryPush: js.Any = js.native
  var unfilteredReadMessages: js.Any = js.native
  var unpushedReadMessages: js.Any = js.native
  var writesClosed: js.Any = js.native
  def attachHttp2Stream(stream: ClientHttp2Stream, subchannel: Subchannel): Unit = js.native
  /* CompleteClass */
  override def cancelWithStatus(status: Status, details: String): Unit = js.native
  /* CompleteClass */
  override def getCredentials(): CallCredentials = js.native
  /* CompleteClass */
  override def getDeadline(): Deadline = js.native
  /* CompleteClass */
  override def getHost(): String = js.native
  /* CompleteClass */
  override def getMethod(): String = js.native
  /* CompleteClass */
  override def getPeer(): String = js.native
  def getStatus(): StatusObject | Null = js.native
  /* CompleteClass */
  override def halfClose(): Unit = js.native
  /* CompleteClass */
  override def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
  /* CompleteClass */
  override def setCredentials(credentials: CallCredentials): Unit = js.native
  /* CompleteClass */
  override def start(metadata: Metadata, listener: InterceptingListener): Unit = js.native
  /* CompleteClass */
  override def startRead(): Unit = js.native
}

