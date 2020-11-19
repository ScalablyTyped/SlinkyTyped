package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforePanelOpenEventArgs extends js.Object {
  
  /** Returns the activation panel element.
    */
  var activationPanel: js.UndefOr[js.Any] = js.native
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the range option value.
    */
  var range: js.UndefOr[js.Any] = js.native
  
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object BeforePanelOpenEventArgs {
  
  @scala.inline
  def apply(): BeforePanelOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforePanelOpenEventArgs]
  }
  
  @scala.inline
  implicit class BeforePanelOpenEventArgsOps[Self <: BeforePanelOpenEventArgs] (val x: Self) extends AnyVal {
    
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
    def setActivationPanel(value: js.Any): Self = this.set("activationPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationPanel: Self = this.set("activationPanel", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setRange(value: js.Any): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSheetIdx(value: Double): Self = this.set("sheetIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetIdx: Self = this.set("sheetIdx", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
