package typingsSlinky.googleGax

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallMetadataGenerator
import typingsSlinky.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typingsSlinky.grpcGrpcJs.mod.CallCredentials
import typingsSlinky.grpcGrpcJs.mod.ChannelCredentials
import typingsSlinky.grpcGrpcJs.mod.Metadata
import typingsSlinky.grpcGrpcJs.mod.ServerCredentials
import typingsSlinky.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typingsSlinky.node.Buffer
import typingsSlinky.node.http2Mod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Auth extends StObject {
    
    var auth: OAuth2Client = js.native
  }
  object Auth {
    
    @scala.inline
    def apply(auth: OAuth2Client): Auth = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: OAuth2Client): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deadline extends StObject {
    
    var deadline: js.UndefOr[js.Date] = js.native
  }
  object Deadline {
    
    @scala.inline
    def apply(): Deadline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deadline]
    }
    
    @scala.inline
    implicit class DeadlineMutableBuilder[Self <: Deadline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    }
  }
  
  @js.native
  trait Encode extends StObject {
    
    def encode(obj: js.Object): Finish = js.native
  }
  object Encode {
    
    @scala.inline
    def apply(encode: js.Object => Finish): Encode = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Encode]
    }
    
    @scala.inline
    implicit class EncodeMutableBuilder[Self <: Encode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncode(value: js.Object => Finish): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Finish extends StObject {
    
    def finish(): js.Array[js.Object] = js.native
  }
  object Finish {
    
    @scala.inline
    def apply(finish: () => js.Array[js.Object]): Finish = {
      val __obj = js.Dynamic.literal(finish = js.Any.fromFunction0(finish))
      __obj.asInstanceOf[Finish]
    }
    
    @scala.inline
    implicit class FinishMutableBuilder[Self <: Finish] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinish(value: () => js.Array[js.Object]): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofCallCredentials extends Instantiable0[CallCredentials] {
    
    def createEmpty(): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    def createFromGoogleCredential(googleCredentials: typingsSlinky.grpcGrpcJs.callCredentialsMod.OAuth2Client): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  }
  
  @js.native
  trait TypeofChannelCredentials extends Instantiable0[ChannelCredentials] {
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    def createInsecure(): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      */
    def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  }
  
  @js.native
  trait TypeofMetadata extends Instantiable0[Metadata] {
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    def fromHttp2Headers(headers: IncomingHttpHeaders): typingsSlinky.grpcGrpcJs.metadataMod.Metadata = js.native
  }
  
  @js.native
  trait TypeofServerCredentials extends Instantiable0[ServerCredentials] {
    
    def createInsecure(): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  }
  
  @js.native
  trait Typeofcredentials extends StObject {
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials
      * object.
      * @param first The first CallCredentials object.
      * @param additional Any number of additional CallCredentials objects.
      * @return The resulting CallCredentials object.
      */
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
    def combineChannelCredentials(
      channelCredentials: typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      callCredentials: typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    var createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any = js.native
    
    var createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any = js.native
    
    var createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any = js.native
    
    var createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any = js.native
    
    var createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any = js.native
  }
  object Typeofcredentials {
    
    @scala.inline
    def apply(
      combineCallCredentials: (typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials, /* repeated */ typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials) => typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials,
      combineChannelCredentials: (typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials, /* repeated */ typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials) => typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any,
      createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any,
      createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any,
      createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any,
      createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any
    ): Typeofcredentials = {
      val __obj = js.Dynamic.literal(combineCallCredentials = js.Any.fromFunction2(combineCallCredentials), combineChannelCredentials = js.Any.fromFunction2(combineChannelCredentials), createEmpty = createEmpty.asInstanceOf[js.Any], createFromGoogleCredential = createFromGoogleCredential.asInstanceOf[js.Any], createFromMetadataGenerator = createFromMetadataGenerator.asInstanceOf[js.Any], createInsecure = createInsecure.asInstanceOf[js.Any], createSsl = createSsl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofcredentials]
    }
    
    @scala.inline
    implicit class TypeofcredentialsMutableBuilder[Self <: Typeofcredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCombineCallCredentials(
        value: (typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials, /* repeated */ typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials) => typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
      ): Self = StObject.set(x, "combineCallCredentials", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCombineChannelCredentials(
        value: (typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials, /* repeated */ typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials) => typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
      ): Self = StObject.set(x, "combineChannelCredentials", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateEmpty(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any
      ): Self = StObject.set(x, "createEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromGoogleCredential(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any
      ): Self = StObject.set(x, "createFromGoogleCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromMetadataGenerator(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any
      ): Self = StObject.set(x, "createFromMetadataGenerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateInsecure(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any
      ): Self = StObject.set(x, "createInsecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSsl(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any
      ): Self = StObject.set(x, "createSsl", value.asInstanceOf[js.Any])
    }
  }
}
