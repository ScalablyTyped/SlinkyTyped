package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageChangeEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the current page number in view.
    */
  var currentPageNumber: js.UndefOr[Double] = js.native
  
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object PageChangeEventArgs {
  
  @scala.inline
  def apply(): PageChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageChangeEventArgs]
  }
  
  @scala.inline
  implicit class PageChangeEventArgsOps[Self <: PageChangeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCurrentPageNumber(value: Double): Self = this.set("currentPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPageNumber: Self = this.set("currentPageNumber", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
