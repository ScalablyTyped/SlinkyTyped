package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a date range.
  */
@js.native
trait SchemaDateRange extends js.Object {
  
  /**
    * The end date of the date range, inclusive. A string of the format:
    * &quot;yyyy-MM-dd&quot;.
    */
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#dateRange.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The date range relative to the date of when the report is run.
    */
  var relativeDateRange: js.UndefOr[String] = js.native
  
  /**
    * The start date of the date range, inclusive. A string of the format:
    * &quot;yyyy-MM-dd&quot;.
    */
  var startDate: js.UndefOr[String] = js.native
}
object SchemaDateRange {
  
  @scala.inline
  def apply(): SchemaDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRange]
  }
  
  @scala.inline
  implicit class SchemaDateRangeOps[Self <: SchemaDateRange] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRelativeDateRange(value: String): Self = this.set("relativeDateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeDateRange: Self = this.set("relativeDateRange", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}
