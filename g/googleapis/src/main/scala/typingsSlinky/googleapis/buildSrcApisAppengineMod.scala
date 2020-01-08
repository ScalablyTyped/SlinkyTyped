package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsSlinky.googleapis.buildSrcApisAppengineV1Mod.appengine_v1.Appengine
import typingsSlinky.googleapis.buildSrcApisAppengineV1Mod.appengine_v1.Options
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1alpha
import typingsSlinky.googleapis.googleapisStrings.v1beta
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typingsSlinky.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine", JSImport.Namespace)
@js.native
object buildSrcApisAppengineMod extends js.Object {
  def appengine(options: Options): Appengine = js.native
  def appengine(options: typingsSlinky.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha.Options): typingsSlinky.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha.Appengine = js.native
  def appengine(options: typingsSlinky.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta.Options): typingsSlinky.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta.Appengine = js.native
  @JSName("appengine")
  def appengine_v1(version: v1): Appengine = js.native
  @JSName("appengine")
  def appengine_v1alpha(version: v1alpha): typingsSlinky.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha.Appengine = js.native
  @JSName("appengine")
  def appengine_v1beta(version: v1beta): typingsSlinky.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta.Appengine = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Appengine {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1alpha protected ()
      extends typingsSlinky.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha.Appengine {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta protected ()
      extends typingsSlinky.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta.Appengine {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Appengine]
            ]
    
    @js.native
    object v1alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha.Appengine
              ]
            ]
    
    @js.native
    object v1beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta.Appengine
              ]
            ]
    
  }
  
  @js.native
  object auth extends TopLevel[AuthPlus] {
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
    
    @js.native
    class JWT protected ()
      extends typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT {
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
    
  }
  
}

