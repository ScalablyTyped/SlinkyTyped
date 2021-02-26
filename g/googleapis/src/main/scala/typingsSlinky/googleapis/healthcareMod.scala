package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleapis.googleapisStrings.v1alpha
import typingsSlinky.googleapis.googleapisStrings.v1alpha2
import typingsSlinky.googleapis.googleapisStrings.v1beta1
import typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2.Options
import typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha.Healthcare
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object healthcareMod {
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1alpha")
    @js.native
    class v1alpha protected () extends Healthcare {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1alpha")
    @js.native
    def v1alpha: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Healthcare] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1alpha2")
    @js.native
    class v1alpha2 protected ()
      extends typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2.Healthcare {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1alpha2")
    @js.native
    def v1alpha2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2.Healthcare
      ] = js.native
    @scala.inline
    def v1alpha2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2.Healthcare
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha2")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def v1alpha_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Healthcare]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1beta1")
    @js.native
    class v1beta1 protected ()
      extends typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare
      ] = js.native
    @scala.inline
    def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/healthcare", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/healthcare", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/healthcare", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typingsSlinky.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/healthcare", "auth.DefaultTransporter.constructor")
      @js.native
      def constructor(): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/healthcare", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/healthcare", "auth.OAuth2")
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
  
  @JSImport("googleapis/build/src/apis/healthcare", "healthcare")
  @js.native
  def healthcare(options: Options): typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2.Healthcare = js.native
  @JSImport("googleapis/build/src/apis/healthcare", "healthcare")
  @js.native
  def healthcare(options: typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha.Options): Healthcare = js.native
  @JSImport("googleapis/build/src/apis/healthcare", "healthcare")
  @js.native
  def healthcare(options: typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Options): typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare = js.native
  @JSImport("googleapis/build/src/apis/healthcare", "healthcare")
  @js.native
  def healthcare_v1alpha(version: v1alpha): Healthcare = js.native
  @JSImport("googleapis/build/src/apis/healthcare", "healthcare")
  @js.native
  def healthcare_v1alpha2(version: v1alpha2): typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2.Healthcare = js.native
  @JSImport("googleapis/build/src/apis/healthcare", "healthcare")
  @js.native
  def healthcare_v1beta1(version: v1beta1): typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare = js.native
}
