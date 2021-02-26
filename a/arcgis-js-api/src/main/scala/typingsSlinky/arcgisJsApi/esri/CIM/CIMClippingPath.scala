package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMClippingPath extends StObject {
  
  /**
    * The clipping type.
    */
  var clippingType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ClippingType * / any */ String
  ] = js.native
  
  /**
    * The clipping path.
    */
  var path: js.UndefOr[ExternalReferencePolygon] = js.native
  
  var `type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMClippingPath = js.native
}
object CIMClippingPath {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMClippingPath): CIMClippingPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMClippingPath]
  }
  
  @scala.inline
  implicit class CIMClippingPathMutableBuilder[Self <: CIMClippingPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClippingType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ClippingType * / any */ String
    ): Self = StObject.set(x, "clippingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingTypeUndefined: Self = StObject.set(x, "clippingType", js.undefined)
    
    @scala.inline
    def setPath(value: ExternalReferencePolygon): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMClippingPath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
