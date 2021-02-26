package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudkmsV1 {
  
  /**
    * Cloud Key Management Service (KMS) API
    *
    * Manages keys and performs cryptographic operations in a central cloud
    * service, for direct use by other cloud resources and applications.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * @namespace cloudkms
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudkms
    */
  @JSImport("googleapis", "cloudkms_v1.Cloudkms")
  @js.native
  class Cloudkms protected ()
    extends typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1.Cloudkms {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudkms_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudkms_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudkms_v1.Resource$Projects$Locations$Keyrings")
  @js.native
  class ResourceProjectsLocationsKeyrings protected ()
    extends typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1.ResourceProjectsLocationsKeyrings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Cryptokeys")
  @js.native
  class ResourceProjectsLocationsKeyringsCryptokeys protected ()
    extends typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1.ResourceProjectsLocationsKeyringsCryptokeys {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Cryptokeys$Cryptokeyversions")
  @js.native
  class ResourceProjectsLocationsKeyringsCryptokeysCryptokeyversions protected ()
    extends typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1.ResourceProjectsLocationsKeyringsCryptokeysCryptokeyversions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Importjobs")
  @js.native
  class ResourceProjectsLocationsKeyringsImportjobs protected ()
    extends typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1.ResourceProjectsLocationsKeyringsImportjobs {
    def this(context: APIRequestContext) = this()
  }
}
