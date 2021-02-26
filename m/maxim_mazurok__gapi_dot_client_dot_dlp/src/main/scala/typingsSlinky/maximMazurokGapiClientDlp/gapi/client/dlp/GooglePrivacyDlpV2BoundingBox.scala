package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2BoundingBox extends StObject {
  
  /** Height of the bounding box in pixels. */
  var height: js.UndefOr[Double] = js.native
  
  /** Left coordinate of the bounding box. (0,0) is upper left. */
  var left: js.UndefOr[Double] = js.native
  
  /** Top coordinate of the bounding box. (0,0) is upper left. */
  var top: js.UndefOr[Double] = js.native
  
  /** Width of the bounding box in pixels. */
  var width: js.UndefOr[Double] = js.native
}
object GooglePrivacyDlpV2BoundingBox {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2BoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BoundingBox]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2BoundingBoxMutableBuilder[Self <: GooglePrivacyDlpV2BoundingBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
