package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalDataBarNegativeFormat object, for use in `conditionalDataBarNegativeFormat.set({ ... })`. */
@js.native
trait ConditionalDataBarNegativeFormatUpdateData extends js.Object {
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "Empty String" if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies if the negative DataBar has the same border color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveBorderColor: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the negative DataBar has the same fill color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveFillColor: js.UndefOr[Boolean] = js.native
}
object ConditionalDataBarNegativeFormatUpdateData {
  
  @scala.inline
  def apply(): ConditionalDataBarNegativeFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarNegativeFormatUpdateData]
  }
  
  @scala.inline
  implicit class ConditionalDataBarNegativeFormatUpdateDataOps[Self <: ConditionalDataBarNegativeFormatUpdateData] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setMatchPositiveBorderColor(value: Boolean): Self = this.set("matchPositiveBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPositiveBorderColor: Self = this.set("matchPositiveBorderColor", js.undefined)
    
    @scala.inline
    def setMatchPositiveFillColor(value: Boolean): Self = this.set("matchPositiveFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPositiveFillColor: Self = this.set("matchPositiveFillColor", js.undefined)
  }
}
