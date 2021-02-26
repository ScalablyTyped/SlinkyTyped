package typingsSlinky.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Standard 2D geometry used in PixiJS.
  *
  * Geometry can be defined without passing in a style or data if required.
  *
  * ```js
  * const geometry = new PIXI.Geometry();
  *
  * geometry.addAttribute('positions', [0, 0, 100, 0, 100, 100, 0, 100], 2);
  * geometry.addAttribute('uvs', [0,0,1,0,1,1,0,1], 2);
  * geometry.addIndex([0,1,2,1,3,2]);
  *
  * ```
  * @class
  * @memberof PIXI
  * @extends PIXI.Geometry
  */
@JSImport("pixi.js", "MeshGeometry")
@js.native
class MeshGeometry ()
  extends typingsSlinky.pixiJs.PIXI.MeshGeometry {
  def this(vertices: js.Array[Double]) = this()
  def this(vertices: js.typedarray.Float32Array) = this()
  def this(vertices: js.UndefOr[scala.Nothing], uvs: js.Array[Double]) = this()
  def this(vertices: js.UndefOr[scala.Nothing], uvs: js.typedarray.Float32Array) = this()
  def this(vertices: js.Array[Double], uvs: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], uvs: js.typedarray.Float32Array) = this()
  def this(vertices: js.typedarray.Float32Array, uvs: js.Array[Double]) = this()
  def this(vertices: js.typedarray.Float32Array, uvs: js.typedarray.Float32Array) = this()
  def this(vertices: js.UndefOr[scala.Nothing], uvs: js.UndefOr[scala.Nothing], index: js.Array[Double]) = this()
  def this(
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.UndefOr[scala.Nothing],
    index: js.typedarray.Uint16Array
  ) = this()
  def this(vertices: js.UndefOr[scala.Nothing], uvs: js.Array[Double], index: js.Array[Double]) = this()
  def this(vertices: js.UndefOr[scala.Nothing], uvs: js.Array[Double], index: js.typedarray.Uint16Array) = this()
  def this(vertices: js.UndefOr[scala.Nothing], uvs: js.typedarray.Float32Array, index: js.Array[Double]) = this()
  def this(
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.typedarray.Float32Array,
    index: js.typedarray.Uint16Array
  ) = this()
  def this(vertices: js.Array[Double], uvs: js.UndefOr[scala.Nothing], index: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], uvs: js.UndefOr[scala.Nothing], index: js.typedarray.Uint16Array) = this()
  def this(vertices: js.Array[Double], uvs: js.Array[Double], index: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], uvs: js.Array[Double], index: js.typedarray.Uint16Array) = this()
  def this(vertices: js.Array[Double], uvs: js.typedarray.Float32Array, index: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], uvs: js.typedarray.Float32Array, index: js.typedarray.Uint16Array) = this()
  def this(vertices: js.typedarray.Float32Array, uvs: js.UndefOr[scala.Nothing], index: js.Array[Double]) = this()
  def this(
    vertices: js.typedarray.Float32Array,
    uvs: js.UndefOr[scala.Nothing],
    index: js.typedarray.Uint16Array
  ) = this()
  def this(vertices: js.typedarray.Float32Array, uvs: js.Array[Double], index: js.Array[Double]) = this()
  def this(vertices: js.typedarray.Float32Array, uvs: js.Array[Double], index: js.typedarray.Uint16Array) = this()
  def this(vertices: js.typedarray.Float32Array, uvs: js.typedarray.Float32Array, index: js.Array[Double]) = this()
  def this(
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    index: js.typedarray.Uint16Array
  ) = this()
}
