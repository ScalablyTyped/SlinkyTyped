package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta1a
import typingsSlinky.googleapis.googleapisStrings.v1beta2
import typingsSlinky.googleapis.pubsubV1Mod.pubsubV1.Options
import typingsSlinky.googleapis.pubsubV1Mod.pubsubV1.Pubsub
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubMod {
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Pubsub] = js.native
    @scala.inline
    def v1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Pubsub]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1beta1a")
    @js.native
    class v1beta1a protected ()
      extends typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1beta1a")
    @js.native
    def v1beta1a: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub
      ] = js.native
    @scala.inline
    def v1beta1a_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1a")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1beta2")
    @js.native
    class v1beta2 protected ()
      extends typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1beta2")
    @js.native
    def v1beta2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub
      ] = js.native
    @scala.inline
    def v1beta2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/pubsub", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typingsSlinky.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typingsSlinky.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/pubsub", "auth.DefaultTransporter.constructor")
      @js.native
      def constructor(): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "auth.JWT")
    @js.native
    class JWT protected ()
      extends typingsSlinky.googleAuthLibrary.mod.JWT {
      /**
        * JWT service account credentials.
        *
        * Retrieve access token using gtoken.
        *
        * @param email service account email address.
        * @param keyFile path to private key file.
        * @param key value of key
        * @param scopes list of requested scopes or a single scope.
        * @param subject impersonated account's email address.
        * @param key_id the ID of the key
        */
      def this(options: JWTOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "auth.OAuth2")
    @js.native
    /**
      * Handles OAuth2 flow for Google APIs.
      *
      * @param clientId The authentication client ID.
      * @param clientSecret The authentication client secret.
      * @param redirectUri The URI to redirect to after completing the auth
      * request.
      * @param opts optional options for overriding the given parameters.
      * @constructor
      */
    class OAuth2 () extends OAuth2Client
    
    type _To = AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: AuthPlus = ^
  }
  
  @JSImport("googleapis/build/src/apis/pubsub", "pubsub")
  @js.native
  def pubsub(options: Options): Pubsub = js.native
  @JSImport("googleapis/build/src/apis/pubsub", "pubsub")
  @js.native
  def pubsub(options: typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Options): typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub = js.native
  @JSImport("googleapis/build/src/apis/pubsub", "pubsub")
  @js.native
  def pubsub(options: typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a.Options): typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub = js.native
  @JSImport("googleapis/build/src/apis/pubsub", "pubsub")
  @js.native
  def pubsub_v1(version: v1): Pubsub = js.native
  @JSImport("googleapis/build/src/apis/pubsub", "pubsub")
  @js.native
  def pubsub_v1beta1a(version: v1beta1a): typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub = js.native
  @JSImport("googleapis/build/src/apis/pubsub", "pubsub")
  @js.native
  def pubsub_v1beta2(version: v1beta2): typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub = js.native
}
