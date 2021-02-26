package typingsSlinky.googleGax

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import typingsSlinky.googleGax.anon.Encode
import typingsSlinky.googleGax.anon.TypeofCallCredentials
import typingsSlinky.googleGax.anon.TypeofChannelCredentials
import typingsSlinky.googleGax.anon.TypeofMetadata
import typingsSlinky.googleGax.anon.TypeofServerCredentials
import typingsSlinky.googleGax.anon.Typeofcredentials
import typingsSlinky.googleGax.gaxMod.ClientConfig
import typingsSlinky.grpcGrpcJs.anon.PartialConsole
import typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
import typingsSlinky.grpcGrpcJs.clientMod.ClientOptions
import typingsSlinky.grpcGrpcJs.constantsMod.LogVerbosity
import typingsSlinky.grpcGrpcJs.makeClientMod.GrpcObject
import typingsSlinky.grpcGrpcJs.makeClientMod.PackageDefinition
import typingsSlinky.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typingsSlinky.grpcGrpcJs.mod.Client
import typingsSlinky.grpcProtoLoader.mod.Options
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.protobufjs.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpcMod {
  
  @JSImport("google-gax/build/src/grpc", "ClientStub")
  @js.native
  class ClientStub protected ()
    extends Client
       with /* name */ StringDictionary[js.Function] {
    def this(address: String, credentials: ChannelCredentials) = this()
    def this(address: String, credentials: ChannelCredentials, options: ClientOptions) = this()
  }
  
  @JSImport("google-gax/build/src/grpc", "GoogleProtoFilesRoot")
  @js.native
  class GoogleProtoFilesRoot protected () extends Root {
    def this(args: js.Object*) = this()
  }
  /* static members */
  object GoogleProtoFilesRoot {
    
    @JSImport("google-gax/build/src/grpc", "GoogleProtoFilesRoot._findIncludePath")
    @js.native
    def _findIncludePath(originPath: String, includePath: String): String = js.native
  }
  
  @JSImport("google-gax/build/src/grpc", "GrpcClient")
  @js.native
  /**
    * A class which keeps the context of gRPC and auth for the gRPC.
    *
    * @param {Object=} options - The optional parameters. It will be directly
    *   passed to google-auth-library library, so parameters like keyFile or
    *   credentials will be valid.
    * @param {Object=} options.auth - An instance of google-auth-library.
    *   When specified, this auth instance will be used instead of creating
    *   a new one.
    * @param {Object=} options.grpc - When specified, this will be used
    *   for the 'grpc' module in this context. By default, it will load the grpc
    *   module in the standard way.
    * @constructor
    */
  class GrpcClient () extends StObject {
    def this(options: GrpcClientOptions) = this()
    
    /**
      * Creates a gRPC credentials. It asks the auth data if necessary.
      * @private
      * @param {Object} opts - options values for configuring credentials.
      * @param {Object=} opts.sslCreds - when specified, this is used instead
      *   of default channel credentials.
      * @return {Promise} The promise which will be resolved to the gRPC credential.
      */
    def _getCredentials(opts: ClientStubOptions): js.Promise[typingsSlinky.grpcGrpcJs.mod.ChannelCredentials] = js.native
    
    var auth: GoogleAuth = js.native
    
    /**
      * A wrapper of {@link constructSettings} function under the gRPC context.
      *
      * Most of parameters are common among constructSettings, please take a look.
      * @param {string} serviceName - The fullly-qualified name of the service.
      * @param {Object} clientConfig - A dictionary of the client config.
      * @param {Object} configOverrides - A dictionary of overriding configs.
      * @param {Object} headers - A dictionary of additional HTTP header name to
      *   its value.
      * @return {Object} A mapping of method names to CallSettings.
      */
    def constructSettings(
      serviceName: String,
      clientConfig: ClientConfig,
      configOverrides: ClientConfig,
      headers: OutgoingHttpHeaders
    ): js.Any = js.native
    
    /**
      * Creates a gRPC stub with current gRPC and auth.
      * @param {function} CreateStub - The constructor function of the stub.
      * @param {Object} options - The optional arguments to customize
      *   gRPC connection. This options will be passed to the constructor of
      *   gRPC client too.
      * @param {string} options.servicePath - The name of the server of the service.
      * @param {number} options.port - The port of the service.
      * @param {grpcTypes.ClientCredentials=} options.sslCreds - The credentials to be used
      *   to set up gRPC connection.
      * @return {Promise} A promise which resolves to a gRPC stub instance.
      */
    def createStub(CreateStub: Instantiable0[ClientStub], options: ClientStubOptions): js.Promise[ClientStub] = js.native
    
    var fallback: Boolean = js.native
    
    var grpc: GrpcModule = js.native
    
    var grpcVersion: String = js.native
    
    /**
      * Loads the gRPC service from the proto file(s) at the given path and with the
      * given options.
      * @param filename The path to the proto file(s).
      * @param options Options for loading the proto file.
      */
    def loadFromProto(filename: String, options: Options): GrpcObject = js.native
    def loadFromProto(filename: js.Array[String], options: Options): GrpcObject = js.native
    
    /**
      * Load grpc proto service from a filename hooking in googleapis common protos
      * when necessary.
      * @param {String} protoPath - The directory to search for the protofile.
      * @param {String|String[]} filename - The filename(s) of the proto(s) to be loaded.
      *   If omitted, protoPath will be treated as a file path to load.
      * @return {Object<string, *>} The gRPC loaded result (the toplevel namespace
      *   object).
      */
    def loadProto(protoPath: String): GrpcObject = js.native
    def loadProto(protoPath: String, filename: String): GrpcObject = js.native
    def loadProto(protoPath: String, filename: js.Array[String]): GrpcObject = js.native
    
    def metadataBuilder(headers: OutgoingHttpHeaders): js.Function2[
        /* abTests */ js.UndefOr[js.Object], 
        /* moreHeaders */ js.UndefOr[OutgoingHttpHeaders], 
        typingsSlinky.grpcGrpcJs.mod.Metadata
      ] = js.native
  }
  /* static members */
  object GrpcClient {
    
    @JSImport("google-gax/build/src/grpc", "GrpcClient._resolveFile")
    @js.native
    def _resolveFile(protoPath: String, filename: String): String = js.native
    
    /**
      * Creates a 'bytelength' function for a given proto message class.
      *
      * See {@link BundleDescriptor} about the meaning of the return value.
      *
      * @param {function} message - a constructor function that is generated by
      *   protobuf.js. Assumes 'encoder' field in the message.
      * @return {function(Object):number} - a function to compute the byte length
      *   for an object.
      */
    @JSImport("google-gax/build/src/grpc", "GrpcClient.createByteLengthFunction")
    @js.native
    def createByteLengthFunction(message: Encode): js.Function1[/* obj */ js.Object, Double] = js.native
  }
  
  @js.native
  trait ClientStubOptions
    extends /* index */ StringDictionary[js.UndefOr[String | Double | js.Object]] {
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var servicePath: js.UndefOr[String] = js.native
    
    var sslCreds: js.UndefOr[typingsSlinky.grpcGrpcJs.mod.ChannelCredentials] = js.native
  }
  object ClientStubOptions {
    
    @scala.inline
    def apply(): ClientStubOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientStubOptions]
    }
    
    @scala.inline
    implicit class ClientStubOptionsMutableBuilder[Self <: ClientStubOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
      
      @scala.inline
      def setSslCreds(value: typingsSlinky.grpcGrpcJs.mod.ChannelCredentials): Self = StObject.set(x, "sslCreds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCredsUndefined: Self = StObject.set(x, "sslCreds", js.undefined)
    }
  }
  
  @js.native
  trait GrpcClientOptions extends GoogleAuthOptions {
    
    var auth: js.UndefOr[GoogleAuth] = js.native
    
    var grpc: js.UndefOr[GrpcModule] = js.native
  }
  object GrpcClientOptions {
    
    @scala.inline
    def apply(): GrpcClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrpcClientOptions]
    }
    
    @scala.inline
    implicit class GrpcClientOptionsMutableBuilder[Self <: GrpcClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: GoogleAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setGrpc(value: GrpcModule): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    }
  }
  
  @js.native
  trait GrpcModule extends StObject {
    
    var CallCredentials: TypeofCallCredentials = js.native
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ ChannelCredentials, 
        /* options */ ChannelOptions, 
        typingsSlinky.grpcGrpcJs.mod.Channel
      ] = js.native
    
    var ChannelCredentials: TypeofChannelCredentials = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        typingsSlinky.grpcGrpcJs.mod.Client
      ] = js.native
    
    var InterceptingCall: Instantiable1[
        /* nextCall */ InterceptingCallInterface, 
        typingsSlinky.grpcGrpcJs.mod.InterceptingCall
      ] = js.native
    
    var InterceptorConfigurationError: Instantiable1[/* message */ String, typingsSlinky.grpcGrpcJs.mod.InterceptorConfigurationError] = js.native
    
    var ListenerBuilder: Instantiable0[typingsSlinky.grpcGrpcJs.mod.ListenerBuilder] = js.native
    
    var Metadata: TypeofMetadata = js.native
    
    var RequesterBuilder: Instantiable0[typingsSlinky.grpcGrpcJs.mod.RequesterBuilder] = js.native
    
    var Server: Instantiable0[typingsSlinky.grpcGrpcJs.mod.Server] = js.native
    
    var ServerCredentials: TypeofServerCredentials = js.native
    
    var StatusBuilder: Instantiable0[typingsSlinky.grpcGrpcJs.mod.StatusBuilder] = js.native
    
    def closeClient(client: typingsSlinky.grpcGrpcJs.clientMod.Client): Unit = js.native
    
    val credentials: Typeofcredentials = js.native
    
    def getClientChannel(client: typingsSlinky.grpcGrpcJs.clientMod.Client): Channel = js.native
    
    def load(filename: js.Any, format: js.Any, options: js.Any): scala.Nothing = js.native
    
    def loadObject(value: js.Any, options: js.Any): scala.Nothing = js.native
    
    def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
    
    def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
    
    def setLogger(logger: PartialConsole): Unit = js.native
    
    def waitForClientReady(
      client: typingsSlinky.grpcGrpcJs.clientMod.Client,
      deadline: js.Date,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def waitForClientReady(
      client: typingsSlinky.grpcGrpcJs.clientMod.Client,
      deadline: Double,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Metadata extends Instantiable0[Metadata] {
    
    def get(key: js.Object): js.Object = js.native
    
    def set(key: js.Object): Unit = js.native
    def set(key: js.Object, value: js.Object): Unit = js.native
    
    var value: MetadataValue = js.native
  }
  
  @js.native
  trait MetadataValue extends StObject {
    
    @JSName("equals")
    var equals_FMetadataValue: js.Function = js.native
  }
  object MetadataValue {
    
    @scala.inline
    def apply(equals_ : js.Function): MetadataValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataValue]
    }
    
    @scala.inline
    implicit class MetadataValueMutableBuilder[Self <: MetadataValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: js.Function): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    }
  }
}
