package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta1
import typingsSlinky.googleapis.googleapisStrings.v1beta2
import typingsSlinky.googleapis.storageV1Mod.storageV1.Options
import typingsSlinky.googleapis.storageV1Mod.storageV1.Storage
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage", JSImport.Namespace)
@js.native
object storageMod extends js.Object {
  def storage(options: Options): Storage = js.native
  def storage(options: typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.Options): typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.Storage = js.native
  def storage(options: typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2.Options): typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2.Storage = js.native
  @JSName("storage")
  def storage_v1(version: v1): Storage = js.native
  @JSName("storage")
  def storage_v1beta1(version: v1beta1): typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.Storage = js.native
  @JSName("storage")
  def storage_v1beta2(version: v1beta2): typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2.Storage = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Storage {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.Storage {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta2 protected ()
      extends typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2.Storage {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Storage]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.Storage
              ]
            ]
    
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2.Storage
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

