package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.alphaMod.computeAlpha.Compute
import typingsSlinky.googleapis.alphaMod.computeAlpha.Options
import typingsSlinky.googleapis.googleapisStrings.alpha
import typingsSlinky.googleapis.googleapisStrings.beta
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute", JSImport.Namespace)
@js.native
object computeMod extends js.Object {
  def compute(options: Options): Compute = js.native
  def compute(options: typingsSlinky.googleapis.betaMod.computeBeta.Options): typingsSlinky.googleapis.betaMod.computeBeta.Compute = js.native
  def compute(options: typingsSlinky.googleapis.computeV1Mod.computeV1.Options): typingsSlinky.googleapis.computeV1Mod.computeV1.Compute = js.native
  @JSName("compute")
  def compute_alpha(version: alpha): Compute = js.native
  @JSName("compute")
  def compute_beta(version: beta): typingsSlinky.googleapis.betaMod.computeBeta.Compute = js.native
  @JSName("compute")
  def compute_v1(version: v1): typingsSlinky.googleapis.computeV1Mod.computeV1.Compute = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class alpha protected () extends Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class beta protected ()
      extends typingsSlinky.googleapis.betaMod.computeBeta.Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1 protected ()
      extends typingsSlinky.googleapis.computeV1Mod.computeV1.Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object alpha
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Compute]
            ]
    
    @js.native
    object beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.betaMod.computeBeta.Compute
              ]
            ]
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.computeV1Mod.computeV1.Compute
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
      extends typingsSlinky.googleAuthLibrary.mod.Compute
    
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
    
  }
  
}

