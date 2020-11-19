package typingsSlinky.ejWebAll.ej.Splitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandCollapseEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns collapsed pane details.
    */
  var collapsed: js.UndefOr[js.Any] = js.native
  
  /** returns expanded pane details.
    */
  var expanded: js.UndefOr[js.Any] = js.native
  
  /** returns the splitter model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the current split bar index.
    */
  var splitbarIndex: js.UndefOr[Double] = js.native
  
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ExpandCollapseEventArgs {
  
  @scala.inline
  def apply(): ExpandCollapseEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandCollapseEventArgs]
  }
  
  @scala.inline
  implicit class ExpandCollapseEventArgsOps[Self <: ExpandCollapseEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCollapsed(value: js.Any): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setExpanded(value: js.Any): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSplitbarIndex(value: Double): Self = this.set("splitbarIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitbarIndex: Self = this.set("splitbarIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
