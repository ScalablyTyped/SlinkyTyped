package typingsSlinky.activexLibreoffice.com_.sun.star.accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure lets an event give access to a change of a table model.
  *
  * The data members of the {@link AccessibleTableModelChange} structure give access to the type and cell range of a change of a table model. See {@link
  * AccessibleTableModelChangeType} for details of the change type. The range of the affected rows, columns, and/or cells can be obtained by accessing the
  * other four data members.
  * @since OOo 1.1.2
  */
@js.native
trait AccessibleTableModelChange extends js.Object {
  
  /**
    * The lowest index of a column that has changed.
    *
    * The first column that has been changed or contains modified cells.
    */
  var FirstColumn: Double = js.native
  
  /**
    * The lowest index of a row that has changed.
    *
    * The first row that has been changed or that contains modified cells.
    */
  var FirstRow: Double = js.native
  
  /**
    * The highest index of a column that has changed.
    *
    * The last column that has been changed or contains modified cells.
    */
  var LastColumn: Double = js.native
  
  /**
    * The highest index of a row that has changed.
    *
    * The last row that has been changed or that contains modified cells.
    */
  var LastRow: Double = js.native
  
  /**
    * The type of the event as defined in {@link AccessibleTableModelChangeType} .
    *
    * The model change either inserted or deleted one or more rows and/or columns or modified the content of a number of cells. See {@link
    * AccessibleTableModelChangeType} for details of the type of the model change.
    */
  var Type: Double = js.native
}
object AccessibleTableModelChange {
  
  @scala.inline
  def apply(FirstColumn: Double, FirstRow: Double, LastColumn: Double, LastRow: Double, Type: Double): AccessibleTableModelChange = {
    val __obj = js.Dynamic.literal(FirstColumn = FirstColumn.asInstanceOf[js.Any], FirstRow = FirstRow.asInstanceOf[js.Any], LastColumn = LastColumn.asInstanceOf[js.Any], LastRow = LastRow.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibleTableModelChange]
  }
  
  @scala.inline
  implicit class AccessibleTableModelChangeOps[Self <: AccessibleTableModelChange] (val x: Self) extends AnyVal {
    
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
    def setFirstColumn(value: Double): Self = this.set("FirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRow(value: Double): Self = this.set("FirstRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastColumn(value: Double): Self = this.set("LastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRow(value: Double): Self = this.set("LastRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
