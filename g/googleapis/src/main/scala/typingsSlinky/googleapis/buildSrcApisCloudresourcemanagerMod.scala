package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1.Cloudresourcemanager
import typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1.Options
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta1
import typingsSlinky.googleapis.googleapisStrings.v2
import typingsSlinky.googleapis.googleapisStrings.v2beta1
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typingsSlinky.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudresourcemanager", JSImport.Namespace)
@js.native
object buildSrcApisCloudresourcemanagerMod extends js.Object {
  def cloudresourcemanager(options: Options): Cloudresourcemanager = js.native
  def cloudresourcemanager(
    options: typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1.Options
  ): typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1.Cloudresourcemanager = js.native
  def cloudresourcemanager(
    options: typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2Mod.cloudresourcemanager_v2.Options
  ): typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2Mod.cloudresourcemanager_v2.Cloudresourcemanager = js.native
  def cloudresourcemanager(
    options: typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1.Options
  ): typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1.Cloudresourcemanager = js.native
  @JSName("cloudresourcemanager")
  def cloudresourcemanager_v1(version: v1): Cloudresourcemanager = js.native
  @JSName("cloudresourcemanager")
  def cloudresourcemanager_v1beta1(version: v1beta1): typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1.Cloudresourcemanager = js.native
  @JSName("cloudresourcemanager")
  def cloudresourcemanager_v2(version: v2): typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2Mod.cloudresourcemanager_v2.Cloudresourcemanager = js.native
  @JSName("cloudresourcemanager")
  def cloudresourcemanager_v2beta1(version: v2beta1): typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1.Cloudresourcemanager = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Cloudresourcemanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1.Cloudresourcemanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2Mod.cloudresourcemanager_v2.Cloudresourcemanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2beta1 protected ()
      extends typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1.Cloudresourcemanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Cloudresourcemanager
              ]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1.Cloudresourcemanager
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2Mod.cloudresourcemanager_v2.Cloudresourcemanager
              ]
            ]
    
    @js.native
    object v2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1.Cloudresourcemanager
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

