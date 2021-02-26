package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.anon.PartialConsole
import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallMetadataGenerator
import typingsSlinky.grpcGrpcJs.callCredentialsMod.OAuth2Client
import typingsSlinky.grpcGrpcJs.callMod.ClientDuplexStream
import typingsSlinky.grpcGrpcJs.callMod.ClientReadableStream
import typingsSlinky.grpcGrpcJs.callMod.ClientUnaryCall
import typingsSlinky.grpcGrpcJs.callMod.ClientWritableStream
import typingsSlinky.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typingsSlinky.grpcGrpcJs.channelMod.ChannelImplementation
import typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.Requester
import typingsSlinky.grpcGrpcJs.clientMod.ClientOptions
import typingsSlinky.grpcGrpcJs.constantsMod.LogVerbosity
import typingsSlinky.grpcGrpcJs.constantsMod.Propagate
import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.makeClientMod.GrpcObject
import typingsSlinky.grpcGrpcJs.makeClientMod.PackageDefinition
import typingsSlinky.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typingsSlinky.grpcGrpcJs.metadataMod.MetadataOptions
import typingsSlinky.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typingsSlinky.node.Buffer
import typingsSlinky.node.http2Mod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@grpc/grpc-js", "CallCredentials")
  @js.native
  abstract class CallCredentials ()
    extends typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
  /* static members */
  object CallCredentials {
    
    @JSImport("@grpc/grpc-js", "CallCredentials.createEmpty")
    @js.native
    def createEmpty(): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    @JSImport("@grpc/grpc-js", "CallCredentials.createFromGoogleCredential")
    @js.native
    def createFromGoogleCredential(googleCredentials: OAuth2Client): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    @JSImport("@grpc/grpc-js", "CallCredentials.createFromMetadataGenerator")
    @js.native
    def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  }
  
  @JSImport("@grpc/grpc-js", "Channel")
  @js.native
  class Channel protected () extends ChannelImplementation {
    def this(
      target: String,
      credentials: typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      options: ChannelOptions
    ) = this()
  }
  
  @JSImport("@grpc/grpc-js", "ChannelCredentials")
  @js.native
  abstract class ChannelCredentials protected ()
    extends typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials {
    protected def this(callCredentials: typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials) = this()
  }
  /* static members */
  object ChannelCredentials {
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    @JSImport("@grpc/grpc-js", "ChannelCredentials.createInsecure")
    @js.native
    def createInsecure(): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      */
    @JSImport("@grpc/grpc-js", "ChannelCredentials.createSsl")
    @js.native
    def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  }
  
  @JSImport("@grpc/grpc-js", "Client")
  @js.native
  class Client protected ()
    extends typingsSlinky.grpcGrpcJs.clientMod.Client {
    def this(address: String, credentials: typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials) = this()
    def this(
      address: String,
      credentials: typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      options: ClientOptions
    ) = this()
  }
  
  @JSImport("@grpc/grpc-js", "InterceptingCall")
  @js.native
  class InterceptingCall protected ()
    extends typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptingCall {
    def this(nextCall: InterceptingCallInterface) = this()
    def this(nextCall: InterceptingCallInterface, requester: Requester) = this()
  }
  
  @JSImport("@grpc/grpc-js", "InterceptorConfigurationError")
  @js.native
  class InterceptorConfigurationError protected ()
    extends typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptorConfigurationError {
    def this(message: String) = this()
  }
  
  @JSImport("@grpc/grpc-js", "ListenerBuilder")
  @js.native
  class ListenerBuilder ()
    extends typingsSlinky.grpcGrpcJs.clientInterceptorsMod.ListenerBuilder
  
  @JSImport("@grpc/grpc-js", "Metadata")
  @js.native
  class Metadata ()
    extends typingsSlinky.grpcGrpcJs.metadataMod.Metadata {
    def this(options: MetadataOptions) = this()
  }
  /* static members */
  object Metadata {
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    @JSImport("@grpc/grpc-js", "Metadata.fromHttp2Headers")
    @js.native
    def fromHttp2Headers(headers: IncomingHttpHeaders): typingsSlinky.grpcGrpcJs.metadataMod.Metadata = js.native
  }
  
  @JSImport("@grpc/grpc-js", "RequesterBuilder")
  @js.native
  class RequesterBuilder ()
    extends typingsSlinky.grpcGrpcJs.clientInterceptorsMod.RequesterBuilder
  
  @JSImport("@grpc/grpc-js", "Server")
  @js.native
  class Server ()
    extends typingsSlinky.grpcGrpcJs.serverMod.Server {
    def this(options: ChannelOptions) = this()
  }
  
  @JSImport("@grpc/grpc-js", "ServerCredentials")
  @js.native
  abstract class ServerCredentials ()
    extends typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials
  /* static members */
  object ServerCredentials {
    
    @JSImport("@grpc/grpc-js", "ServerCredentials.createInsecure")
    @js.native
    def createInsecure(): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    
    @JSImport("@grpc/grpc-js", "ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    @JSImport("@grpc/grpc-js", "ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    @JSImport("@grpc/grpc-js", "ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    @JSImport("@grpc/grpc-js", "ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  }
  
  @JSImport("@grpc/grpc-js", "StatusBuilder")
  @js.native
  class StatusBuilder ()
    extends typingsSlinky.grpcGrpcJs.statusBuilderMod.StatusBuilder
  
  @JSImport("@grpc/grpc-js", "closeClient")
  @js.native
  def closeClient(client: typingsSlinky.grpcGrpcJs.clientMod.Client): Unit = js.native
  
  @JSImport("@grpc/grpc-js", "connectivityState")
  @js.native
  object connectivityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConnectivityState with Double] = js.native
    
    /* 0 */ val CONNECTING: typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState.CONNECTING with Double = js.native
    
    /* 3 */ val IDLE: typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState.IDLE with Double = js.native
    
    /* 1 */ val READY: typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState.READY with Double = js.native
    
    /* 4 */ val SHUTDOWN: typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState.SHUTDOWN with Double = js.native
    
    /* 2 */ val TRANSIENT_FAILURE: typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState.TRANSIENT_FAILURE with Double = js.native
  }
  
  object credentials {
    
    @JSImport("@grpc/grpc-js", "credentials")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials
      * object.
      * @param first The first CallCredentials object.
      * @param additional Any number of additional CallCredentials objects.
      * @return The resulting CallCredentials object.
      */
    @JSImport("@grpc/grpc-js", "credentials.combineCallCredentials")
    @js.native
    def combineCallCredentials(
      first: typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials,
      additional: typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a
      * single ChannelCredentials object.
      * @param channelCredentials The ChannelCredentials object.
      * @param callCredentials Any number of CallCredentials objects.
      * @return The resulting ChannelCredentials object.
      */
    @JSImport("@grpc/grpc-js", "credentials.combineChannelCredentials")
    @js.native
    def combineChannelCredentials(
      channelCredentials: typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      callCredentials: typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    @JSImport("@grpc/grpc-js", "credentials.createEmpty")
    @js.native
    def createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any = js.native
    @scala.inline
    def createEmpty_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createEmpty")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createFromGoogleCredential")
    @js.native
    def createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any = js.native
    @scala.inline
    def createFromGoogleCredential_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromGoogleCredential")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createFromMetadataGenerator")
    @js.native
    def createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any = js.native
    @scala.inline
    def createFromMetadataGenerator_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromMetadataGenerator")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createInsecure")
    @js.native
    def createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any = js.native
    @scala.inline
    def createInsecure_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createInsecure")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createSsl")
    @js.native
    def createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any = js.native
    @scala.inline
    def createSsl_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSsl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@grpc/grpc-js", "getClientChannel")
  @js.native
  def getClientChannel(client: typingsSlinky.grpcGrpcJs.clientMod.Client): typingsSlinky.grpcGrpcJs.channelMod.Channel = js.native
  
  @JSImport("@grpc/grpc-js", "load")
  @js.native
  def load(filename: js.Any, format: js.Any, options: js.Any): scala.Nothing = js.native
  
  @JSImport("@grpc/grpc-js", "loadObject")
  @js.native
  def loadObject(value: js.Any, options: js.Any): scala.Nothing = js.native
  
  @JSImport("@grpc/grpc-js", "loadPackageDefinition")
  @js.native
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
  
  @JSImport("@grpc/grpc-js", "logVerbosity")
  @js.native
  object logVerbosity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogVerbosity with Double] = js.native
    
    /* 0 */ val DEBUG: typingsSlinky.grpcGrpcJs.constantsMod.LogVerbosity.DEBUG with Double = js.native
    
    /* 2 */ val ERROR: typingsSlinky.grpcGrpcJs.constantsMod.LogVerbosity.ERROR with Double = js.native
    
    /* 1 */ val INFO: typingsSlinky.grpcGrpcJs.constantsMod.LogVerbosity.INFO with Double = js.native
  }
  
  @JSImport("@grpc/grpc-js", "makeClientConstructor")
  @js.native
  def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  @JSImport("@grpc/grpc-js", "makeClientConstructor")
  @js.native
  def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  @JSImport("@grpc/grpc-js", "makeGenericClientConstructor")
  @js.native
  def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  @JSImport("@grpc/grpc-js", "makeGenericClientConstructor")
  @js.native
  def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  @JSImport("@grpc/grpc-js", "propagate")
  @js.native
  object propagate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Propagate with Double] = js.native
    
    /* 8 */ val CANCELLATION: typingsSlinky.grpcGrpcJs.constantsMod.Propagate.CANCELLATION with Double = js.native
    
    /* 2 */ val CENSUS_STATS_CONTEXT: typingsSlinky.grpcGrpcJs.constantsMod.Propagate.CENSUS_STATS_CONTEXT with Double = js.native
    
    /* 4 */ val CENSUS_TRACING_CONTEXT: typingsSlinky.grpcGrpcJs.constantsMod.Propagate.CENSUS_TRACING_CONTEXT with Double = js.native
    
    /* 1 */ val DEADLINE: typingsSlinky.grpcGrpcJs.constantsMod.Propagate.DEADLINE with Double = js.native
    
    /* 65536 */ val DEFAULTS: typingsSlinky.grpcGrpcJs.constantsMod.Propagate.DEFAULTS with Double = js.native
  }
  
  @JSImport("@grpc/grpc-js", "setLogVerbosity")
  @js.native
  def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
  
  @JSImport("@grpc/grpc-js", "setLogger")
  @js.native
  def setLogger(logger: PartialConsole): Unit = js.native
  
  @JSImport("@grpc/grpc-js", "status")
  @js.native
  object status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    /* 10 */ val ABORTED: typingsSlinky.grpcGrpcJs.constantsMod.Status.ABORTED with Double = js.native
    
    /* 6 */ val ALREADY_EXISTS: typingsSlinky.grpcGrpcJs.constantsMod.Status.ALREADY_EXISTS with Double = js.native
    
    /* 1 */ val CANCELLED: typingsSlinky.grpcGrpcJs.constantsMod.Status.CANCELLED with Double = js.native
    
    /* 15 */ val DATA_LOSS: typingsSlinky.grpcGrpcJs.constantsMod.Status.DATA_LOSS with Double = js.native
    
    /* 4 */ val DEADLINE_EXCEEDED: typingsSlinky.grpcGrpcJs.constantsMod.Status.DEADLINE_EXCEEDED with Double = js.native
    
    /* 9 */ val FAILED_PRECONDITION: typingsSlinky.grpcGrpcJs.constantsMod.Status.FAILED_PRECONDITION with Double = js.native
    
    /* 13 */ val INTERNAL: typingsSlinky.grpcGrpcJs.constantsMod.Status.INTERNAL with Double = js.native
    
    /* 3 */ val INVALID_ARGUMENT: typingsSlinky.grpcGrpcJs.constantsMod.Status.INVALID_ARGUMENT with Double = js.native
    
    /* 5 */ val NOT_FOUND: typingsSlinky.grpcGrpcJs.constantsMod.Status.NOT_FOUND with Double = js.native
    
    /* 0 */ val OK: typingsSlinky.grpcGrpcJs.constantsMod.Status.OK with Double = js.native
    
    /* 11 */ val OUT_OF_RANGE: typingsSlinky.grpcGrpcJs.constantsMod.Status.OUT_OF_RANGE with Double = js.native
    
    /* 7 */ val PERMISSION_DENIED: typingsSlinky.grpcGrpcJs.constantsMod.Status.PERMISSION_DENIED with Double = js.native
    
    /* 8 */ val RESOURCE_EXHAUSTED: typingsSlinky.grpcGrpcJs.constantsMod.Status.RESOURCE_EXHAUSTED with Double = js.native
    
    /* 16 */ val UNAUTHENTICATED: typingsSlinky.grpcGrpcJs.constantsMod.Status.UNAUTHENTICATED with Double = js.native
    
    /* 14 */ val UNAVAILABLE: typingsSlinky.grpcGrpcJs.constantsMod.Status.UNAVAILABLE with Double = js.native
    
    /* 12 */ val UNIMPLEMENTED: typingsSlinky.grpcGrpcJs.constantsMod.Status.UNIMPLEMENTED with Double = js.native
    
    /* 2 */ val UNKNOWN: typingsSlinky.grpcGrpcJs.constantsMod.Status.UNKNOWN with Double = js.native
  }
  
  @JSImport("@grpc/grpc-js", "waitForClientReady")
  @js.native
  def waitForClientReady(
    client: typingsSlinky.grpcGrpcJs.clientMod.Client,
    deadline: js.Date,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  @JSImport("@grpc/grpc-js", "waitForClientReady")
  @js.native
  def waitForClientReady(
    client: typingsSlinky.grpcGrpcJs.clientMod.Client,
    deadline: Double,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  
  type Call = ClientUnaryCall | ClientReadableStream[js.Any] | ClientWritableStream[js.Any] | (ClientDuplexStream[js.Any, js.Any])
}
