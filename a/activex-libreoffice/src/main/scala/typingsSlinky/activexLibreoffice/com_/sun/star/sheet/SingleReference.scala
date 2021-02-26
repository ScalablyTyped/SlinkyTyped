package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a reference to a single cell. */
@js.native
trait SingleReference extends StObject {
  
  /** is the absolute column number. */
  var Column: Double = js.native
  
  /**
    * contains flags.
    * @see ReferenceFlags
    */
  var Flags: Double = js.native
  
  /** is the relative column number. */
  var RelativeColumn: Double = js.native
  
  /** is the relative row number. */
  var RelativeRow: Double = js.native
  
  /** is the relative sheet number. */
  var RelativeSheet: Double = js.native
  
  /** is the absolute row number. */
  var Row: Double = js.native
  
  /** is the absolute sheet number. */
  var Sheet: Double = js.native
}
object SingleReference {
  
  @scala.inline
  def apply(
    Column: Double,
    Flags: Double,
    RelativeColumn: Double,
    RelativeRow: Double,
    RelativeSheet: Double,
    Row: Double,
    Sheet: Double
  ): SingleReference = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], RelativeColumn = RelativeColumn.asInstanceOf[js.Any], RelativeRow = RelativeRow.asInstanceOf[js.Any], RelativeSheet = RelativeSheet.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleReference]
  }
  
  @scala.inline
  implicit class SingleReferenceMutableBuilder[Self <: SingleReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeColumn(value: Double): Self = StObject.set(x, "RelativeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeRow(value: Double): Self = StObject.set(x, "RelativeRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeSheet(value: Double): Self = StObject.set(x, "RelativeSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: Double): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
  }
}
