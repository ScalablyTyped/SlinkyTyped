package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appengineV1 {
  
  /**
    * App Engine Admin API
    *
    * Provisions and manages developers&#39; App Engine applications.
    *
    * @example
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
    *
    * @namespace appengine
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Appengine
    */
  @JSImport("googleapis", "appengine_v1.Appengine")
  @js.native
  class Appengine protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.Appengine {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps")
  @js.native
  class ResourceApps protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceApps {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Authorizedcertificates")
  @js.native
  class ResourceAppsAuthorizedcertificates protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsAuthorizedcertificates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Authorizeddomains")
  @js.native
  class ResourceAppsAuthorizeddomains protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsAuthorizeddomains {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Domainmappings")
  @js.native
  class ResourceAppsDomainmappings protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsDomainmappings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Firewall")
  @js.native
  class ResourceAppsFirewall protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsFirewall {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Firewall$Ingressrules")
  @js.native
  class ResourceAppsFirewallIngressrules protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsFirewallIngressrules {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Locations")
  @js.native
  class ResourceAppsLocations protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Operations")
  @js.native
  class ResourceAppsOperations protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Services")
  @js.native
  class ResourceAppsServices protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Services$Versions")
  @js.native
  class ResourceAppsServicesVersions protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsServicesVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1.Resource$Apps$Services$Versions$Instances")
  @js.native
  class ResourceAppsServicesVersionsInstances protected ()
    extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.ResourceAppsServicesVersionsInstances {
    def this(context: APIRequestContext) = this()
  }
}
