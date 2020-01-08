package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsSlinky.googleapis.buildSrcApisComputeAlphaMod.compute_alpha.Compute
import typingsSlinky.googleapis.buildSrcApisComputeAlphaMod.compute_alpha.Options
import typingsSlinky.googleapis.googleapisStrings.alpha
import typingsSlinky.googleapis.googleapisStrings.beta
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typingsSlinky.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute", JSImport.Namespace)
@js.native
object buildSrcApisComputeMod extends js.Object {
  def compute(options: Options): Compute = js.native
  def compute(options: typingsSlinky.googleapis.buildSrcApisComputeBetaMod.compute_beta.Options): typingsSlinky.googleapis.buildSrcApisComputeBetaMod.compute_beta.Compute = js.native
  def compute(options: typingsSlinky.googleapis.buildSrcApisComputeV1Mod.compute_v1.Options): typingsSlinky.googleapis.buildSrcApisComputeV1Mod.compute_v1.Compute = js.native
  @JSName("compute")
  def compute_alpha(version: alpha): Compute = js.native
  @JSName("compute")
  def compute_beta(version: beta): typingsSlinky.googleapis.buildSrcApisComputeBetaMod.compute_beta.Compute = js.native
  @JSName("compute")
  def compute_v1(version: v1): typingsSlinky.googleapis.buildSrcApisComputeV1Mod.compute_v1.Compute = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class alpha protected () extends Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class beta protected ()
      extends typingsSlinky.googleapis.buildSrcApisComputeBetaMod.compute_beta.Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1 protected ()
      extends typingsSlinky.googleapis.buildSrcApisComputeV1Mod.compute_v1.Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object alpha
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Compute]
            ]
    
    @js.native
    object beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisComputeBetaMod.compute_beta.Compute
              ]
            ]
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisComputeV1Mod.compute_v1.Compute
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

