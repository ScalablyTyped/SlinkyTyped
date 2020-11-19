package typingsSlinky.notify

import typingsSlinky.notify.Notify.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def notify(data: js.Any): Unit = js.native
  def notify(data: js.Any, className: String): Unit = js.native
  def notify(data: js.Any, options: Options): Unit = js.native
  /**
    * Create a notification positioned relative to the currently selected element.
    */
  def notify(text: String): Unit = js.native
  def notify(text: String, className: String): Unit = js.native
  def notify(text: String, options: Options): Unit = js.native
}
