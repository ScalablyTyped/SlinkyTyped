package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsSlinky.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Deploymentmanager
import typingsSlinky.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Options
import typingsSlinky.googleapis.googleapisStrings.alpha
import typingsSlinky.googleapis.googleapisStrings.v2
import typingsSlinky.googleapis.googleapisStrings.v2beta
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typingsSlinky.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/deploymentmanager", JSImport.Namespace)
@js.native
object buildSrcApisDeploymentmanagerMod extends js.Object {
  def deploymentmanager(options: Options): Deploymentmanager = js.native
  def deploymentmanager(options: typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Options): typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Deploymentmanager = js.native
  def deploymentmanager(
    options: typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Options
  ): typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Deploymentmanager = js.native
  @JSName("deploymentmanager")
  def deploymentmanager_alpha(version: alpha): Deploymentmanager = js.native
  @JSName("deploymentmanager")
  def deploymentmanager_v2(version: v2): typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Deploymentmanager = js.native
  @JSName("deploymentmanager")
  def deploymentmanager_v2beta(version: v2beta): typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Deploymentmanager = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class alpha protected () extends Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2beta protected ()
      extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Deploymentmanager
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Deploymentmanager
              ]
            ]
    
    @js.native
    object v2beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Deploymentmanager
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

