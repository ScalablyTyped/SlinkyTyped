package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gmailV1 {
  
  /**
    * Gmail API
    *
    * Access Gmail mailboxes including sending user email.
    *
    * @example
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * @namespace gmail
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Gmail
    */
  @JSImport("googleapis", "gmail_v1.Gmail")
  @js.native
  class Gmail protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.Gmail {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Drafts")
  @js.native
  class ResourceUsersDrafts protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersDrafts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$History")
  @js.native
  class ResourceUsersHistory protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersHistory {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Labels")
  @js.native
  class ResourceUsersLabels protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersLabels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Messages")
  @js.native
  class ResourceUsersMessages protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersMessages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Messages$Attachments")
  @js.native
  class ResourceUsersMessagesAttachments protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersMessagesAttachments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Settings")
  @js.native
  class ResourceUsersSettings protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Settings$Delegates")
  @js.native
  class ResourceUsersSettingsDelegates protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsDelegates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Settings$Filters")
  @js.native
  class ResourceUsersSettingsFilters protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsFilters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Settings$Forwardingaddresses")
  @js.native
  class ResourceUsersSettingsForwardingaddresses protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsForwardingaddresses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Settings$Sendas")
  @js.native
  class ResourceUsersSettingsSendas protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsSendas {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Settings$Sendas$Smimeinfo")
  @js.native
  class ResourceUsersSettingsSendasSmimeinfo protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsSendasSmimeinfo {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gmail_v1.Resource$Users$Threads")
  @js.native
  class ResourceUsersThreads protected ()
    extends typingsSlinky.googleapis.gmailV1Mod.gmailV1.ResourceUsersThreads {
    def this(context: APIRequestContext) = this()
  }
}
