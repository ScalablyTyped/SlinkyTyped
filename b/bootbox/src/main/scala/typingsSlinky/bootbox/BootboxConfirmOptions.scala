package typingsSlinky.bootbox

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Text
import typingsSlinky.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for confirm modals */
@js.native
trait BootboxConfirmOptions extends BootboxDialogOptions[Boolean] {
  
  @JSName("buttons")
  var buttons_BootboxConfirmOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.native
  
  @JSName("callback")
  def callback_MBootboxConfirmOptions(result: Boolean): js.Any = js.native
}
object BootboxConfirmOptions {
  
  @scala.inline
  def apply(
    callback: Boolean => js.Any,
    message: JQuery[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  ): BootboxConfirmOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxConfirmOptions]
  }
  
  @scala.inline
  implicit class BootboxConfirmOptionsMutableBuilder[Self <: BootboxConfirmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: BootboxConfirmPromptButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setCallback(value: Boolean => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
  }
}
