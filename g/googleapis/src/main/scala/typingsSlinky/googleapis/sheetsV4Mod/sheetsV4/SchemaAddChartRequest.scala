package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a chart to a sheet in the spreadsheet.
  */
@js.native
trait SchemaAddChartRequest extends StObject {
  
  /**
    * The chart that should be added to the spreadsheet, including the position
    * where it should be placed. The chartId field is optional; if one is not
    * set, an id will be randomly generated. (It is an error to specify the ID
    * of a chart that already exists.)
    */
  var chart: js.UndefOr[SchemaEmbeddedChart] = js.native
}
object SchemaAddChartRequest {
  
  @scala.inline
  def apply(): SchemaAddChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddChartRequest]
  }
  
  @scala.inline
  implicit class SchemaAddChartRequestMutableBuilder[Self <: SchemaAddChartRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: SchemaEmbeddedChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
  }
}
