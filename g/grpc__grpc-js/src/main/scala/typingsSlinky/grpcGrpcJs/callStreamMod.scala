package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
import typingsSlinky.grpcGrpcJs.channelMod.ChannelImplementation
import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.filterMod.Filter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import typingsSlinky.grpcGrpcJs.filterStackMod.FilterStackFactory
import typingsSlinky.grpcGrpcJs.grpcGrpcJsNumbers.`1`
import typingsSlinky.grpcGrpcJs.grpcGrpcJsNumbers.`2`
import typingsSlinky.grpcGrpcJs.grpcGrpcJsNumbers.`4`
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.grpcGrpcJs.subchannelMod.Subchannel
import typingsSlinky.node.Buffer
import typingsSlinky.node.http2Mod.ClientHttp2Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callStreamMod {
  
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
    
    def attachHttp2Stream(stream: ClientHttp2Stream, subchannel: Subchannel): Unit = js.native
    def attachHttp2Stream(stream: ClientHttp2Stream, subchannel: Subchannel, extraFilterFactory: FilterFactory[Filter]): Unit = js.native
    
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
    
    def getStatus(): StatusObject | Null = js.native
    
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
  }
  
  @JSImport("@grpc/grpc-js/build/src/call-stream", "InterceptingListenerImpl")
  @js.native
  class InterceptingListenerImpl protected () extends InterceptingListener {
    def this(listener: FullListener, nextListener: InterceptingListener) = this()
    
    var listener: js.Any = js.native
    
    var nextListener: js.Any = js.native
    
    var pendingStatus: js.Any = js.native
    
    var processingMessage: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/call-stream", "isInterceptingListener")
  @js.native
  def isInterceptingListener(listener: InterceptingListener): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener */ Boolean = js.native
  @JSImport("@grpc/grpc-js/build/src/call-stream", "isInterceptingListener")
  @js.native
  def isInterceptingListener(listener: Listener): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener */ Boolean = js.native
  
  @js.native
  trait Call extends StObject {
    
    def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    def getCredentials(): CallCredentials = js.native
    
    def getDeadline(): Deadline = js.native
    
    def getHost(): String = js.native
    
    def getMethod(): String = js.native
    
    def getPeer(): String = js.native
    
    def halfClose(): Unit = js.native
    
    def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
    
    def setCredentials(credentials: CallCredentials): Unit = js.native
    
    def start(metadata: Metadata, listener: InterceptingListener): Unit = js.native
    
    def startRead(): Unit = js.native
  }
  object Call {
    
    @scala.inline
    def apply(
      cancelWithStatus: (Status, String) => Unit,
      getCredentials: () => CallCredentials,
      getDeadline: () => Deadline,
      getHost: () => String,
      getMethod: () => String,
      getPeer: () => String,
      halfClose: () => Unit,
      sendMessageWithContext: (MessageContext, Buffer) => Unit,
      setCredentials: CallCredentials => Unit,
      start: (Metadata, InterceptingListener) => Unit,
      startRead: () => Unit
    ): Call = {
      val __obj = js.Dynamic.literal(cancelWithStatus = js.Any.fromFunction2(cancelWithStatus), getCredentials = js.Any.fromFunction0(getCredentials), getDeadline = js.Any.fromFunction0(getDeadline), getHost = js.Any.fromFunction0(getHost), getMethod = js.Any.fromFunction0(getMethod), getPeer = js.Any.fromFunction0(getPeer), halfClose = js.Any.fromFunction0(halfClose), sendMessageWithContext = js.Any.fromFunction2(sendMessageWithContext), setCredentials = js.Any.fromFunction1(setCredentials), start = js.Any.fromFunction2(start), startRead = js.Any.fromFunction0(startRead))
      __obj.asInstanceOf[Call]
    }
    
    @scala.inline
    implicit class CallMutableBuilder[Self <: Call] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelWithStatus(value: (Status, String) => Unit): Self = StObject.set(x, "cancelWithStatus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetCredentials(value: () => CallCredentials): Self = StObject.set(x, "getCredentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDeadline(value: () => Deadline): Self = StObject.set(x, "getDeadline", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHost(value: () => String): Self = StObject.set(x, "getHost", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMethod(value: () => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPeer(value: () => String): Self = StObject.set(x, "getPeer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHalfClose(value: () => Unit): Self = StObject.set(x, "halfClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSendMessageWithContext(value: (MessageContext, Buffer) => Unit): Self = StObject.set(x, "sendMessageWithContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetCredentials(value: CallCredentials => Unit): Self = StObject.set(x, "setCredentials", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: (Metadata, InterceptingListener) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartRead(value: () => Unit): Self = StObject.set(x, "startRead", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CallStreamOptions extends StObject {
    
    var deadline: Deadline = js.native
    
    var flags: Double = js.native
    
    var host: String = js.native
    
    var parentCall: Call | Null = js.native
  }
  object CallStreamOptions {
    
    @scala.inline
    def apply(deadline: Deadline, flags: Double, host: String): CallStreamOptions = {
      val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallStreamOptions]
    }
    
    @scala.inline
    implicit class CallStreamOptionsMutableBuilder[Self <: CallStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadline(value: Deadline): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineDate(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentCall(value: Call): Self = StObject.set(x, "parentCall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentCallNull: Self = StObject.set(x, "parentCall", null)
    }
  }
  
  type Deadline = js.Date | Double
  
  @js.native
  trait FullListener extends StObject {
    
    def onReceiveMessage(message: js.Any, next: js.Function1[/* message */ js.Any, Unit]): Unit = js.native
    @JSName("onReceiveMessage")
    var onReceiveMessage_Original: MessageListener = js.native
    
    def onReceiveMetadata(metadata: Metadata, next: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
    @JSName("onReceiveMetadata")
    var onReceiveMetadata_Original: MetadataListener = js.native
    
    def onReceiveStatus(status: StatusObject, next: js.Function1[/* status */ StatusObject, Unit]): Unit = js.native
    @JSName("onReceiveStatus")
    var onReceiveStatus_Original: StatusListener = js.native
  }
  
  @js.native
  trait InterceptingListener extends StObject {
    
    def onReceiveMessage(message: js.Any): Unit = js.native
    
    def onReceiveMetadata(metadata: Metadata): Unit = js.native
    
    def onReceiveStatus(status: StatusObject): Unit = js.native
  }
  object InterceptingListener {
    
    @scala.inline
    def apply(
      onReceiveMessage: js.Any => Unit,
      onReceiveMetadata: Metadata => Unit,
      onReceiveStatus: StatusObject => Unit
    ): InterceptingListener = {
      val __obj = js.Dynamic.literal(onReceiveMessage = js.Any.fromFunction1(onReceiveMessage), onReceiveMetadata = js.Any.fromFunction1(onReceiveMetadata), onReceiveStatus = js.Any.fromFunction1(onReceiveStatus))
      __obj.asInstanceOf[InterceptingListener]
    }
    
    @scala.inline
    implicit class InterceptingListenerMutableBuilder[Self <: InterceptingListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnReceiveMessage(value: js.Any => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReceiveMetadata(value: Metadata => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReceiveStatus(value: StatusObject => Unit): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.FullListener> */
  @js.native
  trait Listener extends StObject {
    
    var onReceiveMessage: js.UndefOr[MessageListener] = js.native
    
    var onReceiveMetadata: js.UndefOr[MetadataListener] = js.native
    
    var onReceiveStatus: js.UndefOr[StatusListener] = js.native
  }
  object Listener {
    
    @scala.inline
    def apply(): Listener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnReceiveMessage(value: (/* message */ js.Any, /* next */ js.Function1[/* message */ js.Any, Unit]) => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
      
      @scala.inline
      def setOnReceiveMetadata(value: (/* metadata */ Metadata, /* next */ js.Function1[/* metadata */ Metadata, Unit]) => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
      
      @scala.inline
      def setOnReceiveStatus(
        value: (/* status */ StatusObject, /* next */ js.Function1[/* status */ StatusObject, Unit]) => Unit
      ): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
    }
  }
  
  @js.native
  trait MessageContext extends StObject {
    
    var callback: js.UndefOr[WriteCallback] = js.native
    
    var flags: js.UndefOr[Double] = js.native
  }
  object MessageContext {
    
    @scala.inline
    def apply(): MessageContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageContext]
    }
    
    @scala.inline
    implicit class MessageContextMutableBuilder[Self <: MessageContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* error */ js.UndefOr[js.Error | Null] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    }
  }
  
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function1[/* message */ js.Any, Unit], Unit]
  
  type MetadataListener = js.Function2[
    /* metadata */ Metadata, 
    /* next */ js.Function1[/* metadata */ Metadata, Unit], 
    Unit
  ]
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.CallStreamOptions> */
  @js.native
  trait PartialCallStreamOptions extends StObject {
    
    var deadline: js.UndefOr[Deadline] = js.native
    
    var flags: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var parentCall: js.UndefOr[Call | Null] = js.native
  }
  object PartialCallStreamOptions {
    
    @scala.inline
    def apply(): PartialCallStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCallStreamOptions]
    }
    
    @scala.inline
    implicit class PartialCallStreamOptionsMutableBuilder[Self <: PartialCallStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadline(value: Deadline): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineDate(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setParentCall(value: Call): Self = StObject.set(x, "parentCall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentCallNull: Self = StObject.set(x, "parentCall", null)
      
      @scala.inline
      def setParentCallUndefined: Self = StObject.set(x, "parentCall", js.undefined)
    }
  }
  
  type StatusListener = js.Function2[
    /* status */ StatusObject, 
    /* next */ js.Function1[/* status */ StatusObject, Unit], 
    Unit
  ]
  
  @js.native
  trait StatusObject extends StObject {
    
    var code: Status = js.native
    
    var details: String = js.native
    
    var metadata: Metadata = js.native
  }
  object StatusObject {
    
    @scala.inline
    def apply(code: Status, details: String, metadata: Metadata): StatusObject = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusObject]
    }
    
    @scala.inline
    implicit class StatusObjectMutableBuilder[Self <: StatusObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  type WriteCallback = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grpcGrpcJs.grpcGrpcJsNumbers.`1`
    - typingsSlinky.grpcGrpcJs.grpcGrpcJsNumbers.`2`
    - typingsSlinky.grpcGrpcJs.grpcGrpcJsNumbers.`4`
  */
  trait WriteFlags extends StObject
  object WriteFlags {
    
    @scala.inline
    def BufferHint: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def NoCompress: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def WriteThrough: `4` = 4.asInstanceOf[`4`]
  }
  
  @js.native
  trait WriteObject extends StObject {
    
    var flags: js.UndefOr[Double] = js.native
    
    var message: Buffer = js.native
  }
  object WriteObject {
    
    @scala.inline
    def apply(message: Buffer): WriteObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteObject]
    }
    
    @scala.inline
    implicit class WriteObjectMutableBuilder[Self <: WriteObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setMessage(value: Buffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
