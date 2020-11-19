package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1p1beta1
import typingsSlinky.googleapis.googleapisStrings.v1p2beta1
import typingsSlinky.googleapis.visionV1Mod.visionV1.Options
import typingsSlinky.googleapis.visionV1Mod.visionV1.Vision
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vision", JSImport.Namespace)
@js.native
object visionMod extends js.Object {
  
  def vision(options: Options): Vision = js.native
  def vision(options: typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Options): typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Vision = js.native
  def vision(options: typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Options): typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Vision = js.native
  @JSName("vision")
  def vision_v1(version: v1): Vision = js.native
  @JSName("vision")
  def vision_v1p1beta1(version: v1p1beta1): typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Vision = js.native
  @JSName("vision")
  def vision_v1p2beta1(version: v1p2beta1): typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Vision = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Vision {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Vision]
            ]
    
    @js.native
    class v1p1beta1 protected ()
      extends typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Vision {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1p1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Vision
              ]
            ]
    
    @js.native
    class v1p2beta1 protected ()
      extends typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Vision {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1p2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1.Vision
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
