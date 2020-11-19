package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxesLabelRenderingEventArgs extends js.Object {
  
  /** returns the Chart label information.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** returns the model object bound with PivotClient control.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** returns the current action of PivotClient control.
    */
  var `type`: js.UndefOr[String] = js.native
}
object AxesLabelRenderingEventArgs {
  
  @scala.inline
  def apply(): AxesLabelRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesLabelRenderingEventArgs]
  }
  
  @scala.inline
  implicit class AxesLabelRenderingEventArgsOps[Self <: AxesLabelRenderingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
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
