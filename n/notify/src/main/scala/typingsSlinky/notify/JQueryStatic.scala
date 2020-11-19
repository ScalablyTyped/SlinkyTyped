package typingsSlinky.notify

import typingsSlinky.notify.Notify.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  def notify(data: js.Any): Unit = js.native
  def notify(data: js.Any, className: String): Unit = js.native
  def notify(data: js.Any, options: Options): Unit = js.native
  def notify(element: JQuery, data: js.Any): Unit = js.native
  def notify(element: JQuery, data: js.Any, className: String): Unit = js.native
  def notify(element: JQuery, data: js.Any, options: Options): Unit = js.native
  /**
    * Create a notification positioned relative to the given element.
    */
  def notify(element: JQuery, text: String): Unit = js.native
  def notify(element: JQuery, text: String, className: String): Unit = js.native
  def notify(element: JQuery, text: String, options: Options): Unit = js.native
  /**
    * Create a global notification.
    */
  def notify(text: String): Unit = js.native
  def notify(text: String, className: String): Unit = js.native
  def notify(text: String, options: Options): Unit = js.native
  @JSName("notify")
  var notify_Original: typingsSlinky.notify.Notify.JQueryStatic = js.native
}
