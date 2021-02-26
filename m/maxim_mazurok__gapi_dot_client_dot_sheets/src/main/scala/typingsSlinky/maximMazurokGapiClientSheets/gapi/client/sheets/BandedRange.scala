package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandedRange extends StObject {
  
  /** The id of the banded range. */
  var bandedRangeId: js.UndefOr[Double] = js.native
  
  /**
    * Properties for column bands. These properties are applied on a column- by-column basis throughout all the columns in the range. At least one of row_properties or column_properties
    * must be specified.
    */
  var columnProperties: js.UndefOr[BandingProperties] = js.native
  
  /** The range over which these properties are applied. */
  var range: js.UndefOr[GridRange] = js.native
  
  /**
    * Properties for row bands. These properties are applied on a row-by-row basis throughout all the rows in the range. At least one of row_properties or column_properties must be
    * specified.
    */
  var rowProperties: js.UndefOr[BandingProperties] = js.native
}
object BandedRange {
  
  @scala.inline
  def apply(): BandedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandedRange]
  }
  
  @scala.inline
  implicit class BandedRangeMutableBuilder[Self <: BandedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRangeId(value: Double): Self = StObject.set(x, "bandedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangeIdUndefined: Self = StObject.set(x, "bandedRangeId", js.undefined)
    
    @scala.inline
    def setColumnProperties(value: BandingProperties): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRowProperties(value: BandingProperties): Self = StObject.set(x, "rowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowPropertiesUndefined: Self = StObject.set(x, "rowProperties", js.undefined)
  }
}
