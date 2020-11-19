package typingsSlinky.onsenui.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("onsenui", "createAlertDialog")
@js.native
object createAlertDialog extends js.Object {
  
  /**
    * @description Create a alert dialog instance from a template.
    * @return Promise object that resolves to the alert dialog component object.
    */
  def apply(page: String): js.Promise[HTMLElement] = js.native
  def apply(page: String, options: OnsOptions): js.Promise[HTMLElement] = js.native
}
