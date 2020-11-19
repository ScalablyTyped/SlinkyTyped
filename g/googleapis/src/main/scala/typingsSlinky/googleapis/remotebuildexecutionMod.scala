package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1alpha
import typingsSlinky.googleapis.googleapisStrings.v2
import typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Options
import typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Remotebuildexecution
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution", JSImport.Namespace)
@js.native
object remotebuildexecutionMod extends js.Object {
  
  def remotebuildexecution(options: Options): Remotebuildexecution = js.native
  def remotebuildexecution(
    options: typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Options
  ): typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution = js.native
  def remotebuildexecution(options: typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Options): typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v1(version: v1): Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v1alpha(version: v1alpha): typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v2(version: v2): typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Remotebuildexecution
              ]
            ]
    
    @js.native
    class v1alpha protected ()
      extends typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution
              ]
            ]
    
    @js.native
    class v2 protected ()
      extends typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution
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
