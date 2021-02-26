package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An absolute date range, specified by its start date and end date. The
  * supported range of dates begins 30 days before today and ends today.
  * Validity checked upon filter set creation. If a filter set with an absolute
  * date range is run at a later date more than 30 days after start_date, it
  * will fail.
  */
@js.native
trait SchemaAbsoluteDateRange extends StObject {
  
  /**
    * The end date of the range (inclusive). Must be within the 30 days leading
    * up to current date, and must be equal to or after start_date.
    */
  var endDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * The start date of the range (inclusive). Must be within the 30 days
    * leading up to current date, and must be equal to or before end_date.
    */
  var startDate: js.UndefOr[SchemaDate] = js.native
}
object SchemaAbsoluteDateRange {
  
  @scala.inline
  def apply(): SchemaAbsoluteDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbsoluteDateRange]
  }
  
  @scala.inline
  implicit class SchemaAbsoluteDateRangeMutableBuilder[Self <: SchemaAbsoluteDateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
