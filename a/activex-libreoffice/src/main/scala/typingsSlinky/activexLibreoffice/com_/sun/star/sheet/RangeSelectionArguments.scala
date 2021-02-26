package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the arguments for starting the range selection.
  * @see com.sun.star.sheet.XRangeSelection
  */
@js.native
trait RangeSelectionArguments extends StObject {
  
  /** specifies if the range selection is finished when the mouse button is released, after selecting cells. */
  var CloseOnMouseRelease: Boolean = js.native
  
  /** contains the initial value for the range descriptor. */
  var InitialValue: String = js.native
  
  /**
    * specifies if the range selection is limited to a single cell only.
    *
    * If `TRUE` , the selection is restricted to a single cell. If `FALSE` , multiple adjoining cells can be selected. The default value is `FALSE` .
    * @since OOo 2.0.3
    */
  var SingleCellMode: Boolean = js.native
  
  /** contains a title for the operation. */
  var Title: String = js.native
}
object RangeSelectionArguments {
  
  @scala.inline
  def apply(CloseOnMouseRelease: Boolean, InitialValue: String, SingleCellMode: Boolean, Title: String): RangeSelectionArguments = {
    val __obj = js.Dynamic.literal(CloseOnMouseRelease = CloseOnMouseRelease.asInstanceOf[js.Any], InitialValue = InitialValue.asInstanceOf[js.Any], SingleCellMode = SingleCellMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectionArguments]
  }
  
  @scala.inline
  implicit class RangeSelectionArgumentsMutableBuilder[Self <: RangeSelectionArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseOnMouseRelease(value: Boolean): Self = StObject.set(x, "CloseOnMouseRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValue(value: String): Self = StObject.set(x, "InitialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleCellMode(value: Boolean): Self = StObject.set(x, "SingleCellMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
