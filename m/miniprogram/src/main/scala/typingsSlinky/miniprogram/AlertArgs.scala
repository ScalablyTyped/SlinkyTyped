package typingsSlinky.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertArgs extends AsyncCallback[Unit] {
  
  /**
    * Button text, which is OK by default.
    */
  var buttonText: js.UndefOr[String] = js.native
  
  /**
    * Contents of the alert box.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Title of the alert box.
    */
  var title: js.UndefOr[String] = js.native
}
object AlertArgs {
  
  @scala.inline
  def apply(): AlertArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertArgs]
  }
  
  @scala.inline
  implicit class AlertArgsOps[Self <: AlertArgs] (val x: Self) extends AnyVal {
    
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
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
