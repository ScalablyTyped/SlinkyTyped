package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.`var`
import typingsSlinky.exceljs.exceljsStrings.average
import typingsSlinky.exceljs.exceljsStrings.count
import typingsSlinky.exceljs.exceljsStrings.countNums
import typingsSlinky.exceljs.exceljsStrings.custom
import typingsSlinky.exceljs.exceljsStrings.max
import typingsSlinky.exceljs.exceljsStrings.min
import typingsSlinky.exceljs.exceljsStrings.none_
import typingsSlinky.exceljs.exceljsStrings.stdDev
import typingsSlinky.exceljs.exceljsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableColumnProperties extends js.Object {
  
  /**
  	  * Switches the filter control in the header
  	  * @default false
  	  */
  var filterButton: js.UndefOr[Boolean] = js.native
  
  /**
  	  * The name of the column, also used in the header
  	  */
  var name: String = js.native
  
  /**
  	  * Optional formula for custom functions
  	  */
  var totalsRowFormula: js.UndefOr[String] = js.native
  
  /**
  	  * Name of the totals function
  	  * @default 'none'
  	  */
  var totalsRowFunction: js.UndefOr[none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom] = js.native
  
  /**
  	  * Label to describe the totals row (first column)
  	  * @default 'Total'
  	  */
  var totalsRowLabel: js.UndefOr[String] = js.native
}
object TableColumnProperties {
  
  @scala.inline
  def apply(name: String): TableColumnProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnProperties]
  }
  
  @scala.inline
  implicit class TableColumnPropertiesOps[Self <: TableColumnProperties] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterButton(value: Boolean): Self = this.set("filterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterButton: Self = this.set("filterButton", js.undefined)
    
    @scala.inline
    def setTotalsRowFormula(value: String): Self = this.set("totalsRowFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalsRowFormula: Self = this.set("totalsRowFormula", js.undefined)
    
    @scala.inline
    def setTotalsRowFunction(value: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom): Self = this.set("totalsRowFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalsRowFunction: Self = this.set("totalsRowFunction", js.undefined)
    
    @scala.inline
    def setTotalsRowLabel(value: String): Self = this.set("totalsRowLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalsRowLabel: Self = this.set("totalsRowLabel", js.undefined)
  }
}
