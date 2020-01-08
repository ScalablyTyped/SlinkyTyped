package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "abusiveexperiencereport_v1")
@js.native
object abusiveexperiencereport_v1 extends js.Object {
  /**
    * Abusive Experience Report API
    *
    * Views Abusive Experience Report data, and gets a list of sites that have a
    * significant number of abusive experiences.
    *
    * @example
    * const {google} = require('googleapis');
    * const abusiveexperiencereport = google.abusiveexperiencereport('v1');
    *
    * @namespace abusiveexperiencereport
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Abusiveexperiencereport
    */
  @js.native
  class Abusiveexperiencereport protected ()
    extends typingsSlinky.googleapis.buildSrcApisAbusiveexperiencereportV1Mod.abusiveexperiencereport_v1.Abusiveexperiencereport {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Sites protected ()
    extends typingsSlinky.googleapis.buildSrcApisAbusiveexperiencereportV1Mod.abusiveexperiencereport_v1.Resource$Sites {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Violatingsites protected ()
    extends typingsSlinky.googleapis.buildSrcApisAbusiveexperiencereportV1Mod.abusiveexperiencereport_v1.Resource$Violatingsites {
    def this(context: APIRequestContext) = this()
  }
  
}

