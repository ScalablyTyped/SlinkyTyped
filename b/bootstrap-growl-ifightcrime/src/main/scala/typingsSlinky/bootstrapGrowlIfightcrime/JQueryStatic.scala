package typingsSlinky.bootstrapGrowlIfightcrime

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime.Options
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  /**
    * Show standard Bootstrap alerts into hovering "Growl-like" notifications
    * @param message to show.
    * @param options should be an options object.
    * @returns The element.
    */
  def bootstrapGrowl(message: String): JQuery[HTMLElement] = js.native
  def bootstrapGrowl(message: String, options: Options): JQuery[HTMLElement] = js.native
}
