package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.googleapisStrings.v2
import typingsSlinky.googleapis.googleapisStrings.v3
import typingsSlinky.googleapis.googleapisStrings.v3p1beta1
import typingsSlinky.googleapis.jobsV2Mod.jobsV2.Jobs
import typingsSlinky.googleapis.jobsV2Mod.jobsV2.Options
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs", JSImport.Namespace)
@js.native
object jobsMod extends js.Object {
  
  def jobs(options: Options): Jobs = js.native
  def jobs(options: typingsSlinky.googleapis.jobsV3Mod.jobsV3.Options): typingsSlinky.googleapis.jobsV3Mod.jobsV3.Jobs = js.native
  def jobs(options: typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1.Options): typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs = js.native
  @JSName("jobs")
  def jobs_v2(version: v2): Jobs = js.native
  @JSName("jobs")
  def jobs_v3(version: v3): typingsSlinky.googleapis.jobsV3Mod.jobsV3.Jobs = js.native
  @JSName("jobs")
  def jobs_v3p1beta1(version: v3p1beta1): typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v2 protected () extends Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Jobs]
            ]
    
    @js.native
    class v3 protected ()
      extends typingsSlinky.googleapis.jobsV3Mod.jobsV3.Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.jobsV3Mod.jobsV3.Jobs
              ]
            ]
    
    @js.native
    class v3p1beta1 protected ()
      extends typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v3p1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs
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
