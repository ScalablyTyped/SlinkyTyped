package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Script")
@js.native
object Script extends js.Object {
  /**
    * An enumeration that identifies which categories of authorized services Apps Script is able to
    * execute through a triggered function. These values are exposed in triggered functions as the authMode
    * property of the event parameter, e. For
    * more information, see the guide to the
    * authorization lifecycle for add-ons.
    *
    *     function onOpen(e) {
    *       var menu = SpreadsheetApp.getUi().createAddonMenu();
    *       if (e && e.authMode == ScriptApp.AuthMode.NONE) {
    *         // Add a normal menu item (works in all authorization modes).
    *         menu.addItem('Start workflow', 'startWorkflow');
    *       } else {
    *         // Add a menu item based on properties (doesn't work in AuthMode.NONE).
    *         var properties = PropertiesService.getDocumentProperties();
    *         var workflowStarted = properties.getProperty('workflowStarted');
    *         if (workflowStarted) {
    *           menu.addItem('Check workflow status', 'checkWorkflow');
    *         } else {
    *           menu.addItem('Start workflow', 'startWorkflow');
    *         }
    *         // Record analytics.
    *         UrlFetchApp.fetch('http://www.example.com/analytics?event=open');
    *       }
    *       menu.addToUi();
    *     }
    */
  @js.native
  object AuthMode extends js.Object {
    /* 1 */ val CUSTOM_FUNCTION: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode.CUSTOM_FUNCTION with Double = js.native
    /* 3 */ val FULL: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode.FULL with Double = js.native
    /* 2 */ val LIMITED: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode.LIMITED with Double = js.native
    /* 0 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode with Double] = js.native
  }
  
  /**
    * An enumeration denoting the authorization status of a script.
    */
  @js.native
  object AuthorizationStatus extends js.Object {
    /* 1 */ val NOT_REQUIRED: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthorizationStatus.NOT_REQUIRED with Double = js.native
    /* 0 */ val REQUIRED: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthorizationStatus.REQUIRED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthorizationStatus with Double
      ] = js.native
  }
  
  /**
    * An enumeration denoting the type of triggered event.
    */
  @js.native
  object EventType extends js.Object {
    /* 0 */ val CLOCK: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.EventType.CLOCK with Double = js.native
    /* 4 */ val ON_CHANGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.EventType.ON_CHANGE with Double = js.native
    /* 2 */ val ON_EDIT: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.EventType.ON_EDIT with Double = js.native
    /* 5 */ val ON_EVENT_UPDATED: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.EventType.ON_EVENT_UPDATED with Double = js.native
    /* 3 */ val ON_FORM_SUBMIT: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.EventType.ON_FORM_SUBMIT with Double = js.native
    /* 1 */ val ON_OPEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.EventType.ON_OPEN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Script.EventType with Double] = js.native
  }
  
  /**
    * An enumeration that indicates how the script came to be installed as an add-on for the current
    * user.
    */
  @js.native
  object InstallationSource extends js.Object {
    /* 0 */ val APPS_MARKETPLACE_DOMAIN_ADD_ON: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.InstallationSource.APPS_MARKETPLACE_DOMAIN_ADD_ON with Double = js.native
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.InstallationSource.NONE with Double = js.native
    /* 2 */ val WEB_STORE_ADD_ON: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.InstallationSource.WEB_STORE_ADD_ON with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Script.InstallationSource with Double
      ] = js.native
  }
  
  /**
    * An enumeration denoting the source of the event that causes the trigger to fire.
    */
  @js.native
  object TriggerSource extends js.Object {
    /* 4 */ val CALENDAR: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.TriggerSource.CALENDAR with Double = js.native
    /* 1 */ val CLOCK: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.TriggerSource.CLOCK with Double = js.native
    /* 3 */ val DOCUMENTS: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.TriggerSource.DOCUMENTS with Double = js.native
    /* 2 */ val FORMS: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.TriggerSource.FORMS with Double = js.native
    /* 0 */ val SPREADSHEETS: typingsSlinky.googleAppsScript.GoogleAppsScript.Script.TriggerSource.SPREADSHEETS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Script.TriggerSource with Double] = js.native
  }
  
}

