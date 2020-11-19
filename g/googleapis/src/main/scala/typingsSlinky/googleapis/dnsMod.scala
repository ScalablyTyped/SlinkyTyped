package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.dnsV1Mod.dnsV1.Dns
import typingsSlinky.googleapis.dnsV1Mod.dnsV1.Options
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta2
import typingsSlinky.googleapis.googleapisStrings.v2beta1
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns", JSImport.Namespace)
@js.native
object dnsMod extends js.Object {
  
  def dns(options: Options): Dns = js.native
  def dns(options: typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2.Options): typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns = js.native
  def dns(options: typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1.Options): typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns = js.native
  @JSName("dns")
  def dns_v1(version: v1): Dns = js.native
  @JSName("dns")
  def dns_v1beta2(version: v1beta2): typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns = js.native
  @JSName("dns")
  def dns_v2beta1(version: v2beta1): typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Dns {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Dns]
            ]
    
    @js.native
    class v1beta2 protected ()
      extends typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns
              ]
            ]
    
    @js.native
    class v2beta1 protected ()
      extends typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns
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
