package typingsSlinky.maximMazurokGapiClientBlogger.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lat extends StObject {
  
  /** Location's latitude. */
  var lat: js.UndefOr[Double] = js.native
  
  /** Location's longitude. */
  var lng: js.UndefOr[Double] = js.native
  
  /** Location name. */
  var name: js.UndefOr[String] = js.native
  
  /** Location's viewport span. Can be used when rendering a map preview. */
  var span: js.UndefOr[String] = js.native
}
object Lat {
  
  @scala.inline
  def apply(): Lat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lat]
  }
  
  @scala.inline
  implicit class LatMutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSpan(value: String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
