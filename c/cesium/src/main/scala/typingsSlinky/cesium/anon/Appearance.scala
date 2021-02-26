package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.GeometryInstance
import typingsSlinky.cesium.mod.Matrix4
import typingsSlinky.cesium.mod.ShadowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appearance extends StObject {
  
  var allowPicking: js.UndefOr[Boolean] = js.native
  
  var appearance: js.UndefOr[typingsSlinky.cesium.mod.Appearance] = js.native
  
  var asynchronous: js.UndefOr[Boolean] = js.native
  
  var compressVertices: js.UndefOr[Boolean] = js.native
  
  var cull: js.UndefOr[Boolean] = js.native
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  
  var interleave: js.UndefOr[Boolean] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.native
  
  var shadows: js.UndefOr[ShadowMode] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var vertexCacheOptimize: js.UndefOr[Boolean] = js.native
}
object Appearance {
  
  @scala.inline
  def apply(): Appearance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appearance]
  }
  
  @scala.inline
  implicit class AppearanceMutableBuilder[Self <: Appearance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPicking(value: Boolean): Self = StObject.set(x, "allowPicking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPickingUndefined: Self = StObject.set(x, "allowPicking", js.undefined)
    
    @scala.inline
    def setAppearance(value: typingsSlinky.cesium.mod.Appearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setAsynchronous(value: Boolean): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
    
    @scala.inline
    def setCompressVertices(value: Boolean): Self = StObject.set(x, "compressVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressVerticesUndefined: Self = StObject.set(x, "compressVertices", js.undefined)
    
    @scala.inline
    def setCull(value: Boolean): Self = StObject.set(x, "cull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCullUndefined: Self = StObject.set(x, "cull", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setGeometryInstances(value: js.Array[GeometryInstance] | GeometryInstance): Self = StObject.set(x, "geometryInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryInstancesUndefined: Self = StObject.set(x, "geometryInstances", js.undefined)
    
    @scala.inline
    def setGeometryInstancesVarargs(value: GeometryInstance*): Self = StObject.set(x, "geometryInstances", js.Array(value :_*))
    
    @scala.inline
    def setInterleave(value: Boolean): Self = StObject.set(x, "interleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterleaveUndefined: Self = StObject.set(x, "interleave", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    @scala.inline
    def setReleaseGeometryInstances(value: Boolean): Self = StObject.set(x, "releaseGeometryInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseGeometryInstancesUndefined: Self = StObject.set(x, "releaseGeometryInstances", js.undefined)
    
    @scala.inline
    def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setVertexCacheOptimize(value: Boolean): Self = StObject.set(x, "vertexCacheOptimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexCacheOptimizeUndefined: Self = StObject.set(x, "vertexCacheOptimize", js.undefined)
  }
}
