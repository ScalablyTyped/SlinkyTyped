package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Success extends js.Object {
  
  val Success: Boolean = js.native
  
  val Wb: Workbook = js.native
}
object Success {
  
  @scala.inline
  def apply(Success: Boolean, Wb: Workbook): Success = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit class SuccessOps[Self <: Success] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: Boolean): Self = this.set("Success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWb(value: Workbook): Self = this.set("Wb", value.asInstanceOf[js.Any])
  }
}
