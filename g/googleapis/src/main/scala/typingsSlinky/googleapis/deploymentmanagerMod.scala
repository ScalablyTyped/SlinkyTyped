package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.Deploymentmanager
import typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.Options
import typingsSlinky.googleapis.googleapisStrings.alpha
import typingsSlinky.googleapis.googleapisStrings.v2
import typingsSlinky.googleapis.googleapisStrings.v2beta
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/deploymentmanager", JSImport.Namespace)
@js.native
object deploymentmanagerMod extends js.Object {
  
  def deploymentmanager(options: Options): Deploymentmanager = js.native
  def deploymentmanager(options: typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Options): typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager = js.native
  def deploymentmanager(options: typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta.Options): typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta.Deploymentmanager = js.native
  @JSName("deploymentmanager")
  def deploymentmanager_alpha(version: alpha): Deploymentmanager = js.native
  @JSName("deploymentmanager")
  def deploymentmanager_v2(version: v2): typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager = js.native
  @JSName("deploymentmanager")
  def deploymentmanager_v2beta(version: v2beta): typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta.Deploymentmanager = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class alpha protected () extends Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Deploymentmanager
              ]
            ]
    
    @js.native
    class v2 protected ()
      extends typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager
              ]
            ]
    
    @js.native
    class v2beta protected ()
      extends typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta.Deploymentmanager
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
