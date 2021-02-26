package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleapis.googleapisStrings.v3Dot1
import typingsSlinky.googleapis.googleapisStrings.v3Dot2
import typingsSlinky.googleapis.googleapisStrings.v3Dot3
import typingsSlinky.googleapis.v31Mod.dfareportingV31.Dfareporting
import typingsSlinky.googleapis.v31Mod.dfareportingV31.Options
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dfareportingMod {
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.1")
    @js.native
    class v31 protected () extends Dfareporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.1")
    @js.native
    def v31: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Dfareporting
      ] = js.native
    
    @scala.inline
    def v31_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Dfareporting
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3.1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.2")
    @js.native
    class v32 protected ()
      extends typingsSlinky.googleapis.v32Mod.dfareportingV32.Dfareporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.2")
    @js.native
    def v32: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typingsSlinky.googleapis.v32Mod.dfareportingV32.Dfareporting
      ] = js.native
    
    @scala.inline
    def v32_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typingsSlinky.googleapis.v32Mod.dfareportingV32.Dfareporting
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3.2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.3")
    @js.native
    class v33 protected ()
      extends typingsSlinky.googleapis.v33Mod.dfareportingV33.Dfareporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.3")
    @js.native
    def v33: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typingsSlinky.googleapis.v33Mod.dfareportingV33.Dfareporting
      ] = js.native
    
    @scala.inline
    def v33_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typingsSlinky.googleapis.v33Mod.dfareportingV33.Dfareporting
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3.3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/dfareporting", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/dfareporting", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typingsSlinky.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/dfareporting", "auth.DefaultTransporter.constructor")
      @js.native
      def constructor(): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/dfareporting", "auth.OAuth2")
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
  
  @JSImport("googleapis/build/src/apis/dfareporting", "dfareporting")
  @js.native
  def dfareporting(options: Options): Dfareporting = js.native
  @JSImport("googleapis/build/src/apis/dfareporting", "dfareporting")
  @js.native
  def dfareporting(options: typingsSlinky.googleapis.v32Mod.dfareportingV32.Options): typingsSlinky.googleapis.v32Mod.dfareportingV32.Dfareporting = js.native
  @JSImport("googleapis/build/src/apis/dfareporting", "dfareporting")
  @js.native
  def dfareporting(options: typingsSlinky.googleapis.v33Mod.dfareportingV33.Options): typingsSlinky.googleapis.v33Mod.dfareportingV33.Dfareporting = js.native
  @JSImport("googleapis/build/src/apis/dfareporting", "dfareporting")
  @js.native
  def dfareporting_v31(version: v3Dot1): Dfareporting = js.native
  @JSImport("googleapis/build/src/apis/dfareporting", "dfareporting")
  @js.native
  def dfareporting_v32(version: v3Dot2): typingsSlinky.googleapis.v32Mod.dfareportingV32.Dfareporting = js.native
  @JSImport("googleapis/build/src/apis/dfareporting", "dfareporting")
  @js.native
  def dfareporting_v33(version: v3Dot3): typingsSlinky.googleapis.v33Mod.dfareportingV33.Dfareporting = js.native
}
