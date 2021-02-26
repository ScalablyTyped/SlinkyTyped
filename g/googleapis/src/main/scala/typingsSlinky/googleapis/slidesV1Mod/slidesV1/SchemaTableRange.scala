package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A table range represents a reference to a subset of a table.  It&#39;s
  * important to note that the cells specified by a table range do not
  * necessarily form a rectangle. For example, let&#39;s say we have a 3 x 3
  * table where all the cells of the last row are merged together. The table
  * looks like this:                      [             ]  A table range with
  * location = (0, 0), row span = 3 and column span = 2 specifies the following
  * cells:        x     x       [ x    x    x ]
  */
@js.native
trait SchemaTableRange extends StObject {
  
  /**
    * The column span of the table range.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  
  /**
    * The starting location of the table range.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  
  /**
    * The row span of the table range.
    */
  var rowSpan: js.UndefOr[Double] = js.native
}
object SchemaTableRange {
  
  @scala.inline
  def apply(): SchemaTableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRange]
  }
  
  @scala.inline
  implicit class SchemaTableRangeMutableBuilder[Self <: SchemaTableRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}
