package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "bigquery_v2")
@js.native
object bigquery_v2 extends js.Object {
  /**
    * BigQuery API
    *
    * A data platform for customers to create, manage, share and query data.
    *
    * @example
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * @namespace bigquery
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Bigquery
    */
  @js.native
  class Bigquery protected ()
    extends typingsSlinky.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Bigquery {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Datasets protected ()
    extends typingsSlinky.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Resource$Datasets {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Jobs protected ()
    extends typingsSlinky.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Resource$Jobs {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Models protected ()
    extends typingsSlinky.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Resource$Models {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Projects protected ()
    extends typingsSlinky.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Resource$Projects {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Tabledata protected ()
    extends typingsSlinky.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Resource$Tabledata {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Tables protected ()
    extends typingsSlinky.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Resource$Tables {
    def this(context: APIRequestContext) = this()
  }
  
}

