package typingsSlinky.baseui.snackbarMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnackbarElementPropsT extends js.Object {
  
  var actionMessage: js.UndefOr[String] = js.native
  
  var actionOnClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], _]] = js.native
  
  var focus: js.UndefOr[Boolean] = js.native
  
  var message: String = js.native
  
  var overrides: js.UndefOr[SnackbarElementOverridesT] = js.native
  
  var progress: js.UndefOr[Boolean] = js.native
  
  var startEnhancer: js.UndefOr[ReactComponentClass[Size]] = js.native
}
object SnackbarElementPropsT {
  
  @scala.inline
  def apply(message: String): SnackbarElementPropsT = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarElementPropsT]
  }
  
  @scala.inline
  implicit class SnackbarElementPropsTOps[Self <: SnackbarElementPropsT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionMessage(value: String): Self = this.set("actionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionMessage: Self = this.set("actionMessage", js.undefined)
    
    @scala.inline
    def setActionOnClick(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => _): Self = this.set("actionOnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionOnClick: Self = this.set("actionOnClick", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setOverrides(value: SnackbarElementOverridesT): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setProgress(value: Boolean): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setStartEnhancer(value: ReactComponentClass[Size]): Self = this.set("startEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartEnhancer: Self = this.set("startEnhancer", js.undefined)
  }
}
