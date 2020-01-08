package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsSlinky.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1.Dataproc
import typingsSlinky.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1.Options
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta2
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typingsSlinky.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc", JSImport.Namespace)
@js.native
object buildSrcApisDataprocMod extends js.Object {
  def dataproc(options: Options): Dataproc = js.native
  def dataproc(options: typingsSlinky.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2.Options): typingsSlinky.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2.Dataproc = js.native
  @JSName("dataproc")
  def dataproc_v1(version: v1): Dataproc = js.native
  @JSName("dataproc")
  def dataproc_v1beta2(version: v1beta2): typingsSlinky.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2.Dataproc = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Dataproc {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta2 protected ()
      extends typingsSlinky.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2.Dataproc {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Dataproc]
            ]
    
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2.Dataproc
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

