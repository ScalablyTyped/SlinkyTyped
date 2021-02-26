package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataprocV1beta2 {
  
  /**
    * Cloud Dataproc API
    *
    * Manages Hadoop-based clusters and jobs on Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
    *
    * @namespace dataproc
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Dataproc
    */
  @JSImport("googleapis", "dataproc_v1beta2.Dataproc")
  @js.native
  class Dataproc protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.Dataproc {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Locations$Autoscalingpolicies")
  @js.native
  class ResourceProjectsLocationsAutoscalingpolicies protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsLocationsAutoscalingpolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Locations$Workflowtemplates")
  @js.native
  class ResourceProjectsLocationsWorkflowtemplates protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsLocationsWorkflowtemplates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Regions")
  @js.native
  class ResourceProjectsRegions protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsRegions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Regions$Autoscalingpolicies")
  @js.native
  class ResourceProjectsRegionsAutoscalingpolicies protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsRegionsAutoscalingpolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Regions$Clusters")
  @js.native
  class ResourceProjectsRegionsClusters protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsRegionsClusters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Regions$Jobs")
  @js.native
  class ResourceProjectsRegionsJobs protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsRegionsJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Regions$Operations")
  @js.native
  class ResourceProjectsRegionsOperations protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsRegionsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1beta2.Resource$Projects$Regions$Workflowtemplates")
  @js.native
  class ResourceProjectsRegionsWorkflowtemplates protected ()
    extends typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2.ResourceProjectsRegionsWorkflowtemplates {
    def this(context: APIRequestContext) = this()
  }
}
