package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a single data row, specified by its name and a sequence of data points.
  *
  * This struct is currently used nowhere.
  * @deprecated Deprecated
  */
@js.native
trait ChartDataRow extends StObject {
  
  /** The name of the data row. */
  var Name: String = js.native
  
  /** The points contained in this data row. */
  var Points: SafeArray[SafeArray[ChartDataValue]] = js.native
}
object ChartDataRow {
  
  @scala.inline
  def apply(Name: String, Points: SafeArray[SafeArray[ChartDataValue]]): ChartDataRow = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataRow]
  }
  
  @scala.inline
  implicit class ChartDataRowMutableBuilder[Self <: ChartDataRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: SafeArray[SafeArray[ChartDataValue]]): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
  }
}
