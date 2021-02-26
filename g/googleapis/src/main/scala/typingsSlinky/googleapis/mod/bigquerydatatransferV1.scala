package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigquerydatatransferV1 {
  
  /**
    * BigQuery Data Transfer API
    *
    * Schedule queries or transfer external data from SaaS applications to Google
    * BigQuery on a regular basis.
    *
    * @example
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * @namespace bigquerydatatransfer
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Bigquerydatatransfer
    */
  @JSImport("googleapis", "bigquerydatatransfer_v1.Bigquerydatatransfer")
  @js.native
  class Bigquerydatatransfer protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.Bigquerydatatransfer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Datasources")
  @js.native
  class ResourceProjectsDatasources protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsDatasources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Locations$Datasources")
  @js.native
  class ResourceProjectsLocationsDatasources protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsLocationsDatasources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Locations$Transferconfigs")
  @js.native
  class ResourceProjectsLocationsTransferconfigs protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsLocationsTransferconfigs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Locations$Transferconfigs$Runs")
  @js.native
  class ResourceProjectsLocationsTransferconfigsRuns protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsLocationsTransferconfigsRuns {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Locations$Transferconfigs$Runs$Transferlogs")
  @js.native
  class ResourceProjectsLocationsTransferconfigsRunsTransferlogs protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsLocationsTransferconfigsRunsTransferlogs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Transferconfigs")
  @js.native
  class ResourceProjectsTransferconfigs protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsTransferconfigs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Transferconfigs$Runs")
  @js.native
  class ResourceProjectsTransferconfigsRuns protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsTransferconfigsRuns {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigquerydatatransfer_v1.Resource$Projects$Transferconfigs$Runs$Transferlogs")
  @js.native
  class ResourceProjectsTransferconfigsRunsTransferlogs protected ()
    extends typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1.ResourceProjectsTransferconfigsRunsTransferlogs {
    def this(context: APIRequestContext) = this()
  }
}
