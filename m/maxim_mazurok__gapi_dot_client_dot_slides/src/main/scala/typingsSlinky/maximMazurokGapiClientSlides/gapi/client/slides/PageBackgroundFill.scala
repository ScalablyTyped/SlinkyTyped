package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageBackgroundFill extends StObject {
  
  /**
    * The background fill property state. Updating the fill on a page will implicitly update this field to `RENDERED`, unless another value is specified in the same request. To have no
    * fill on a page, set this field to `NOT_RENDERED`. In this case, any other fill fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.native
  
  /** Stretched picture fill. */
  var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.native
}
object PageBackgroundFill {
  
  @scala.inline
  def apply(): PageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBackgroundFill]
  }
  
  @scala.inline
  implicit class PageBackgroundFillMutableBuilder[Self <: PageBackgroundFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setSolidFill(value: SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
    
    @scala.inline
    def setStretchedPictureFill(value: StretchedPictureFill): Self = StObject.set(x, "stretchedPictureFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchedPictureFillUndefined: Self = StObject.set(x, "stretchedPictureFill", js.undefined)
  }
}
