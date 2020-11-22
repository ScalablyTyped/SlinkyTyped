package typingsSlinky.babylonjs.edgesRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEdgesRendererOptions extends js.Object {
  
  /**
    * Gets or sets a boolean indicating that tessellation should be applied before finding the edges. You may need to activate this option if your geometry is a bit
    * unusual, like having a vertex of a triangle in-between two vertices of an edge of another triangle. It happens often when using CSG to construct meshes.
    * This option is used only if useAlternateEdgeFinder = true
    */
  var applyTessellation: js.UndefOr[Boolean] = js.native
  
  /**
    * The limit under which 3 vertices are considered to be aligned. 3 vertices PQR are considered aligned if distance(PQ) + distance(QR) - distance(PR) < epsilonVertexAligned
    * The default value is 1e-6
    * This option is used only if useAlternateEdgeFinder = true
    */
  var epsilonVertexAligned: js.UndefOr[Double] = js.native
  
  /**
    * During edges processing, the vertices are merged if they are close enough: epsilonVertexMerge is the limit whithin which vertices are considered to be equal.
    * The default value is 1e-6
    * This option is used only if useAlternateEdgeFinder = true
    */
  var epsilonVertexMerge: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets a boolean indicating that the alternate edge finder algorithm must be used
    * If not defined, the default value is true
    */
  var useAlternateEdgeFinder: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets a boolean indicating that the vertex merger fast processing must be used.
    * If not defined, the default value is true.
    * You should normally leave it undefined (or set it to true), except if you see some artifacts in the edges rendering (can happen with complex geometries)
    * This option is used only if useAlternateEdgeFinder = true
    */
  var useFastVertexMerger: js.UndefOr[Boolean] = js.native
}
object IEdgesRendererOptions {
  
  @scala.inline
  def apply(): IEdgesRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEdgesRendererOptions]
  }
  
  @scala.inline
  implicit class IEdgesRendererOptionsOps[Self <: IEdgesRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyTessellation(value: Boolean): Self = this.set("applyTessellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyTessellation: Self = this.set("applyTessellation", js.undefined)
    
    @scala.inline
    def setEpsilonVertexAligned(value: Double): Self = this.set("epsilonVertexAligned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpsilonVertexAligned: Self = this.set("epsilonVertexAligned", js.undefined)
    
    @scala.inline
    def setEpsilonVertexMerge(value: Double): Self = this.set("epsilonVertexMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpsilonVertexMerge: Self = this.set("epsilonVertexMerge", js.undefined)
    
    @scala.inline
    def setUseAlternateEdgeFinder(value: Boolean): Self = this.set("useAlternateEdgeFinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAlternateEdgeFinder: Self = this.set("useAlternateEdgeFinder", js.undefined)
    
    @scala.inline
    def setUseFastVertexMerger(value: Boolean): Self = this.set("useFastVertexMerger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFastVertexMerger: Self = this.set("useFastVertexMerger", js.undefined)
  }
}
