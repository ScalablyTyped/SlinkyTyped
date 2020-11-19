package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the TableCell.
  */
@js.native
trait SchemaTableCellProperties extends js.Object {
  
  /**
    * The alignment of the content in the table cell. The default alignment
    * matches the alignment for newly created table cells in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  
  /**
    * The background fill of the table cell. The default fill matches the fill
    * for newly created table cells in the Slides editor.
    */
  var tableCellBackgroundFill: js.UndefOr[SchemaTableCellBackgroundFill] = js.native
}
object SchemaTableCellProperties {
  
  @scala.inline
  def apply(): SchemaTableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellProperties]
  }
  
  @scala.inline
  implicit class SchemaTableCellPropertiesOps[Self <: SchemaTableCellProperties] (val x: Self) extends AnyVal {
    
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
    def setContentAlignment(value: String): Self = this.set("contentAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAlignment: Self = this.set("contentAlignment", js.undefined)
    
    @scala.inline
    def setTableCellBackgroundFill(value: SchemaTableCellBackgroundFill): Self = this.set("tableCellBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellBackgroundFill: Self = this.set("tableCellBackgroundFill", js.undefined)
  }
}
