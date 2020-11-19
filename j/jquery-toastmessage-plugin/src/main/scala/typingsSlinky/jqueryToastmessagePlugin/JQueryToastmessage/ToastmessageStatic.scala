package typingsSlinky.jqueryToastmessagePlugin.JQueryToastmessage

import typingsSlinky.jqueryToastmessagePlugin.JQuery
import typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.removeToast
import typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastmessageStatic extends js.Object {
  
  /* shows a toast message of the specified type */
  def apply(command: ShowToastCommand, message: String): JQuery = js.native
  /** removes the specified toast and returns it */
  def apply(command: removeToast, toast: JQuery): Unit = js.native
  def apply(command: removeToast, toast: JQuery, closeOpts: ToastOptions): Unit = js.native
  /** shows a custom toast */
  def apply(command: showToast, toastOpts: ToastOptions): JQuery = js.native
  /** configures the default toast options */
  def apply(toastOpts: ToastOptions): Unit = js.native
}
