package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1.Cloudidentity
import typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1.Options
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta1
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudidentity", JSImport.Namespace)
@js.native
object cloudidentityMod extends js.Object {
  
  def cloudidentity(options: Options): Cloudidentity = js.native
  def cloudidentity(options: typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Options): typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity = js.native
  @JSName("cloudidentity")
  def cloudidentity_v1(version: v1): Cloudidentity = js.native
  @JSName("cloudidentity")
  def cloudidentity_v1beta1(version: v1beta1): typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Cloudidentity {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Cloudidentity
              ]
            ]
    
    @js.native
    class v1beta1 protected ()
      extends typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity
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
