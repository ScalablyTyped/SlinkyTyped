package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1alpha
import typingsSlinky.googleapis.googleapisStrings.v2
import typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Options
import typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Remotebuildexecution
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remotebuildexecutionMod {
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Remotebuildexecution
      ] = js.native
    @scala.inline
    def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Remotebuildexecution
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v1alpha")
    @js.native
    class v1alpha protected ()
      extends typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v1alpha")
    @js.native
    def v1alpha: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution
      ] = js.native
    @scala.inline
    def v1alpha_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v2")
    @js.native
    class v2 protected ()
      extends typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution
      ] = js.native
    @scala.inline
    def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typingsSlinky.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.DefaultTransporter.constructor")
      @js.native
      def constructor(): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.OAuth2")
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
  
  @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution")
  @js.native
  def remotebuildexecution(options: Options): Remotebuildexecution = js.native
  @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution")
  @js.native
  def remotebuildexecution(
    options: typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Options
  ): typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution = js.native
  @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution")
  @js.native
  def remotebuildexecution(options: typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Options): typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution = js.native
  @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution")
  @js.native
  def remotebuildexecution_v1(version: v1): Remotebuildexecution = js.native
  @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution")
  @js.native
  def remotebuildexecution_v1alpha(version: v1alpha): typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution = js.native
  @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution")
  @js.native
  def remotebuildexecution_v2(version: v2): typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution = js.native
}
