package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.source.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for snap
  */
@js.native
trait SnapOptions extends StObject {
  
  var edge: js.UndefOr[Boolean] = js.native
  
  var features: js.UndefOr[Collection[Feature]] = js.native
  
  var pixelTolerance: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[Vector] = js.native
  
  var vertex: js.UndefOr[Boolean] = js.native
}
object SnapOptions {
  
  @scala.inline
  def apply(): SnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapOptions]
  }
  
  @scala.inline
  implicit class SnapOptionsMutableBuilder[Self <: SnapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    @scala.inline
    def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
    
    @scala.inline
    def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setVertex(value: Boolean): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
