package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1alpha1
import typingsSlinky.googleapis.tpuV1Mod.tpuV1.Options
import typingsSlinky.googleapis.tpuV1Mod.tpuV1.Tpu
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tpu", JSImport.Namespace)
@js.native
object tpuMod extends js.Object {
  
  def tpu(options: Options): Tpu = js.native
  def tpu(options: typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1.Options): typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1.Tpu = js.native
  @JSName("tpu")
  def tpu_v1(version: v1): Tpu = js.native
  @JSName("tpu")
  def tpu_v1alpha1(version: v1alpha1): typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1.Tpu = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Tpu {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Tpu]
            ]
    
    @js.native
    class v1alpha1 protected ()
      extends typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1.Tpu {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1alpha1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1.Tpu
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
