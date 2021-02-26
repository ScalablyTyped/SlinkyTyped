package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spannerV1 {
  
  @JSImport("googleapis", "spanner_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.spannerV1Mod.spannerV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "spanner_v1.Resource$Projects$Instanceconfigs")
  @js.native
  class ResourceProjectsInstanceconfigs protected ()
    extends typingsSlinky.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstanceconfigs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "spanner_v1.Resource$Projects$Instances")
  @js.native
  class ResourceProjectsInstances protected ()
    extends typingsSlinky.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "spanner_v1.Resource$Projects$Instances$Databases")
  @js.native
  class ResourceProjectsInstancesDatabases protected ()
    extends typingsSlinky.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesDatabases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "spanner_v1.Resource$Projects$Instances$Databases$Operations")
  @js.native
  class ResourceProjectsInstancesDatabasesOperations protected ()
    extends typingsSlinky.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesDatabasesOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "spanner_v1.Resource$Projects$Instances$Databases$Sessions")
  @js.native
  class ResourceProjectsInstancesDatabasesSessions protected ()
    extends typingsSlinky.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesDatabasesSessions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "spanner_v1.Resource$Projects$Instances$Operations")
  @js.native
  class ResourceProjectsInstancesOperations protected ()
    extends typingsSlinky.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesOperations {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Spanner API
    *
    * Cloud Spanner is a managed, mission-critical, globally consistent and
    * scalable relational database service.
    *
    * @example
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * @namespace spanner
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Spanner
    */
  @JSImport("googleapis", "spanner_v1.Spanner")
  @js.native
  class Spanner protected ()
    extends typingsSlinky.googleapis.spannerV1Mod.spannerV1.Spanner {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
