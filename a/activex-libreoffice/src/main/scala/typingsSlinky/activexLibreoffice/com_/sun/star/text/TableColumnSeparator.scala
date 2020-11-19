package typingsSlinky.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The width of the cells of a text table is defined by the position of the separator between neighboring cells.
  *
  * If cells of the table are merged, this separator is not removed, but it is hidden.
  *
  * A text table or a text table row provides the separators in a sequence of TableColumnSeparators. If the table only consists of one column, then this
  * sequence is empty.
  *
  * The real width of a table depends on the environment (page style and number of text columns at the table's position, alignment, and left and right
  * margins). For that reason, the table column separator does not contain metric values for the column widths. The values are relative to the value of
  * the property {@link TextTable.TableColumnRelativeSum} .
  *
  * A table provides this property only if all rows have the same structure. If the table does not provide the property, then it cannot be set using.
  *
  * The state of {@link TableColumnSeparator.IsVisible} and the count of the sequence must be the same in as it was in. Hidden separators cannot be moved
  * and they cannot be overtaken by visible separators.
  * @see com.sun.star.text.TextTable
  */
@js.native
trait TableColumnSeparator extends js.Object {
  
  /** determines if the separator is visible. */
  var IsVisible: Boolean = js.native
  
  /** contains the position of the separator. */
  var Position: Double = js.native
}
object TableColumnSeparator {
  
  @scala.inline
  def apply(IsVisible: Boolean, Position: Double): TableColumnSeparator = {
    val __obj = js.Dynamic.literal(IsVisible = IsVisible.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnSeparator]
  }
  
  @scala.inline
  implicit class TableColumnSeparatorOps[Self <: TableColumnSeparator] (val x: Self) extends AnyVal {
    
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
    def setIsVisible(value: Boolean): Self = this.set("IsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
  }
}
