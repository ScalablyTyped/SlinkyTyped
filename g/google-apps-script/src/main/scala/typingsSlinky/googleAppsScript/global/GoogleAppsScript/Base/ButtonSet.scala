package typingsSlinky.googleAppsScript.global.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enum representing predetermined, localized sets of one or more dialog buttons that can be
  * added to an alert or a prompt. To determine which button the user clicked,
  * use Button.
  *
  *     // Display a dialog box with a message and "Yes" and "No" buttons.
  *     var ui = DocumentApp.getUi();
  *     var response = ui.alert('Are you sure you want to continue?', ui.ButtonSet.YES_NO);
  *
  *     // Process the user's response.
  *     if (response == ui.Button.YES) {
  *       Logger.log('The user clicked "Yes."');
  *     } else {
  *       Logger.log('The user clicked "No" or the dialog\'s close button.');
  *     }
  */
@JSGlobal("GoogleAppsScript.Base.ButtonSet")
@js.native
object ButtonSet extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet with Double] = js.native
  
  /* 0 */ val OK: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet.OK with Double = js.native
  
  /* 1 */ val OK_CANCEL: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet.OK_CANCEL with Double = js.native
  
  /* 2 */ val YES_NO: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet.YES_NO with Double = js.native
  
  /* 3 */ val YES_NO_CANCEL: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet.YES_NO_CANCEL with Double = js.native
}
