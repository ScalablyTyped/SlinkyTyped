package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adsensehostV41 {
  
  /**
    * AdSense Host API
    *
    * Generates performance reports, generates ad codes, and provides publisher
    * management capabilities for AdSense Hosts.
    *
    * @example
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * @namespace adsensehost
    * @type {Function}
    * @version v4.1
    * @variation v4.1
    * @param {object=} options Options for Adsensehost
    */
  @JSImport("googleapis", "adsensehost_v4_1.Adsensehost")
  @js.native
  class Adsensehost protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.Adsensehost {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Accounts$Adclients")
  @js.native
  class ResourceAccountsAdclients protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceAccountsAdclients {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Accounts$Adunits")
  @js.native
  class ResourceAccountsAdunits protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceAccountsAdunits {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Accounts$Reports")
  @js.native
  class ResourceAccountsReports protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceAccountsReports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Adclients")
  @js.native
  class ResourceAdclients protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceAdclients {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Associationsessions")
  @js.native
  class ResourceAssociationsessions protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceAssociationsessions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Customchannels")
  @js.native
  class ResourceCustomchannels protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceCustomchannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Reports")
  @js.native
  class ResourceReports protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceReports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adsensehost_v4_1.Resource$Urlchannels")
  @js.native
  class ResourceUrlchannels protected ()
    extends typingsSlinky.googleapis.v41Mod.adsensehostV41.ResourceUrlchannels {
    def this(context: APIRequestContext) = this()
  }
}
