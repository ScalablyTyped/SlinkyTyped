package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIM3DSymbolProperties extends StObject {
  
  /**
    * The dominant size axis.
    */
  var dominantSizeAxis3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
  ] = js.native
  
  /**
    * The rotation order 3D.
    */
  var rotationOrder3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RotationOrder * / any */ String
  ] = js.native
  
  /**
    * The scale Y.
    */
  var scaleY: js.UndefOr[Double] = js.native
  
  /**
    * The scale Z.
    */
  var scaleZ: js.UndefOr[Double] = js.native
  
  var `type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIM3DSymbolProperties = js.native
}
object CIM3DSymbolProperties {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIM3DSymbolProperties): CIM3DSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIM3DSymbolProperties]
  }
  
  @scala.inline
  implicit class CIM3DSymbolPropertiesMutableBuilder[Self <: CIM3DSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDominantSizeAxis3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
    ): Self = StObject.set(x, "dominantSizeAxis3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantSizeAxis3DUndefined: Self = StObject.set(x, "dominantSizeAxis3D", js.undefined)
    
    @scala.inline
    def setRotationOrder3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RotationOrder * / any */ String
    ): Self = StObject.set(x, "rotationOrder3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationOrder3DUndefined: Self = StObject.set(x, "rotationOrder3D", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setScaleZ(value: Double): Self = StObject.set(x, "scaleZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleZUndefined: Self = StObject.set(x, "scaleZ", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIM3DSymbolProperties): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
