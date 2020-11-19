package typingsSlinky.materialUiLab.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@material-ui/lab.@material-ui/lab/Alert/Alert.Color, react.react.ReactNode>> */
@js.native
trait PartialRecordColorReactNo extends js.Object {
  
  var error: js.UndefOr[ReactElement] = js.native
  
  var info: js.UndefOr[ReactElement] = js.native
  
  var success: js.UndefOr[ReactElement] = js.native
  
  var warning: js.UndefOr[ReactElement] = js.native
}
object PartialRecordColorReactNo {
  
  @scala.inline
  def apply(): PartialRecordColorReactNo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordColorReactNo]
  }
  
  @scala.inline
  implicit class PartialRecordColorReactNoOps[Self <: PartialRecordColorReactNo] (val x: Self) extends AnyVal {
    
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
    def setErrorReactElement(value: ReactElement): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ReactElement): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInfoReactElement(value: ReactElement): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: ReactElement): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setSuccessReactElement(value: ReactElement): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ReactElement): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWarningReactElement(value: ReactElement): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: ReactElement): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
