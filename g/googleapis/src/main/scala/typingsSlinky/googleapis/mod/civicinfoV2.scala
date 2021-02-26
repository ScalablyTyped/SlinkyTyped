package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object civicinfoV2 {
  
  /**
    * Google Civic Information API
    *
    * Provides polling places, early vote locations, contest data, election
    * officials, and government representatives for U.S. residential addresses.
    *
    * @example
    * const {google} = require('googleapis');
    * const civicinfo = google.civicinfo('v2');
    *
    * @namespace civicinfo
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Civicinfo
    */
  @JSImport("googleapis", "civicinfo_v2.Civicinfo")
  @js.native
  class Civicinfo protected ()
    extends typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2.Civicinfo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "civicinfo_v2.Resource$Divisions")
  @js.native
  class ResourceDivisions protected ()
    extends typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2.ResourceDivisions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "civicinfo_v2.Resource$Elections")
  @js.native
  class ResourceElections protected ()
    extends typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2.ResourceElections {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "civicinfo_v2.Resource$Representatives")
  @js.native
  class ResourceRepresentatives protected ()
    extends typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2.ResourceRepresentatives {
    def this(context: APIRequestContext) = this()
  }
}
