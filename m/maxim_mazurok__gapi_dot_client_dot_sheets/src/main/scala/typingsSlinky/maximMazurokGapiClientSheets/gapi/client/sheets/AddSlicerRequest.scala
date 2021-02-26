package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSlicerRequest extends StObject {
  
  /**
    * The slicer that should be added to the spreadsheet, including the position where it should be placed. The slicerId field is optional; if one is not set, an id will be randomly
    * generated. (It is an error to specify the ID of a slicer that already exists.)
    */
  var slicer: js.UndefOr[Slicer] = js.native
}
object AddSlicerRequest {
  
  @scala.inline
  def apply(): AddSlicerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSlicerRequest]
  }
  
  @scala.inline
  implicit class AddSlicerRequestMutableBuilder[Self <: AddSlicerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlicer(value: Slicer): Self = StObject.set(x, "slicer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicerUndefined: Self = StObject.set(x, "slicer", js.undefined)
  }
}
