package typingsSlinky.delaunator.mod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delaunator[P] extends js.Object {
  
  /**
    * An array of input coordinates in the form [x0, y0, x1, y1, ....], of the type provided in the constructor (or Float64Array if you used Delaunator.from).
    */
  var coords: ArrayLike[Double] | js.typedarray.Float64Array = js.native
  
  /**
    * A Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
    * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
    * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
    *
    * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
    */
  var halfedges: js.typedarray.Int32Array = js.native
  
  /**
    * A Uint32Array array of indices that reference points on the convex hull of the input data, counter-clockwise.
    */
  var hull: js.typedarray.Uint32Array = js.native
  
  /**
    * A Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle).
    * All triangles are directed counterclockwise.
    */
  var triangles: js.typedarray.Uint32Array = js.native
}
object Delaunator {
  
  @scala.inline
  def apply[P](
    coords: ArrayLike[Double] | js.typedarray.Float64Array,
    halfedges: js.typedarray.Int32Array,
    hull: js.typedarray.Uint32Array,
    triangles: js.typedarray.Uint32Array
  ): Delaunator[P] = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], halfedges = halfedges.asInstanceOf[js.Any], hull = hull.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delaunator[P]]
  }
  
  @scala.inline
  implicit class DelaunatorOps[Self <: Delaunator[_], P] (val x: Self with Delaunator[P]) extends AnyVal {
    
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
    def setCoordsFloat64Array(value: js.typedarray.Float64Array): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoords(value: ArrayLike[Double] | js.typedarray.Float64Array): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfedges(value: js.typedarray.Int32Array): Self = this.set("halfedges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHull(value: js.typedarray.Uint32Array): Self = this.set("hull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangles(value: js.typedarray.Uint32Array): Self = this.set("triangles", value.asInstanceOf[js.Any])
  }
}
