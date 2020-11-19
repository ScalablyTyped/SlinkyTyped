package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.firestoreV1Mod.firestoreV1.Firestore
import typingsSlinky.googleapis.firestoreV1Mod.firestoreV1.Options
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta1
import typingsSlinky.googleapis.googleapisStrings.v1beta2
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firestore", JSImport.Namespace)
@js.native
object firestoreMod extends js.Object {
  
  def firestore(options: Options): Firestore = js.native
  def firestore(options: typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Options): typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore = js.native
  def firestore(options: typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Options): typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore = js.native
  @JSName("firestore")
  def firestore_v1(version: v1): Firestore = js.native
  @JSName("firestore")
  def firestore_v1beta1(version: v1beta1): typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore = js.native
  @JSName("firestore")
  def firestore_v1beta2(version: v1beta2): typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Firestore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Firestore]
            ]
    
    @js.native
    class v1beta1 protected ()
      extends typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore
              ]
            ]
    
    @js.native
    class v1beta2 protected ()
      extends typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore
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
