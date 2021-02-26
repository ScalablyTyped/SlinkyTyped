package typingsSlinky.pixiJs.global.PIXI

import typingsSlinky.pixiJs.PIXI.GD8Symmetry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements the dihedral group D8, which is similar to
  * [group D4]{@link http://mathworld.wolfram.com/DihedralGroupD4.html};
  * D8 is the same but with diagonals, and it is used for texture
  * rotations.
  *
  * The directions the U- and V- axes after rotation
  * of an angle of `a: GD8Constant` are the vectors `(uX(a), uY(a))`
  * and `(vX(a), vY(a))`. These aren't necessarily unit vectors.
  *
  * **Origin:**<br>
  *  This is the small part of gameofbombs.com portal system. It works.
  *
  * @see PIXI.groupD8.E
  * @see PIXI.groupD8.SE
  * @see PIXI.groupD8.S
  * @see PIXI.groupD8.SW
  * @see PIXI.groupD8.W
  * @see PIXI.groupD8.NW
  * @see PIXI.groupD8.N
  * @see PIXI.groupD8.NE
  * @author Ivan @ivanpopelyshev
  * @namespace PIXI.groupD8
  * @memberof PIXI
  */
object groupD8 {
  
  @JSGlobal("PIXI.groupD8")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 0°       | East      |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.E")
  @js.native
  def E: GD8Symmetry = js.native
  @scala.inline
  def E_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("E")(x.asInstanceOf[js.Any])
  
  /**
    * Reflection about the main diagonal.
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.MAIN_DIAGONAL")
  @js.native
  def MAIN_DIAGONAL: GD8Symmetry = js.native
  @scala.inline
  def MAIN_DIAGONAL_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAIN_DIAGONAL")(x.asInstanceOf[js.Any])
  
  /**
    * Reflection about X-axis.
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.MIRROR_HORIZONTAL")
  @js.native
  def MIRROR_HORIZONTAL: GD8Symmetry = js.native
  @scala.inline
  def MIRROR_HORIZONTAL_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIRROR_HORIZONTAL")(x.asInstanceOf[js.Any])
  
  /**
    * Reflection about Y-axis.
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.MIRROR_VERTICAL")
  @js.native
  def MIRROR_VERTICAL: GD8Symmetry = js.native
  @scala.inline
  def MIRROR_VERTICAL_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIRROR_VERTICAL")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -90°/270°↻  | North        |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.N")
  @js.native
  def N: GD8Symmetry = js.native
  
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -45°/315°↻  | Northeast    |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.NE")
  @js.native
  def NE: GD8Symmetry = js.native
  @scala.inline
  def NE_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NE")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation    | Direction    |
    * |-------------|--------------|
    * | -135°/225°↻ | Northwest    |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.NW")
  @js.native
  def NW: GD8Symmetry = js.native
  @scala.inline
  def NW_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NW")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def N_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("N")(x.asInstanceOf[js.Any])
  
  /**
    * Reflection about reverse diagonal.
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.REVERSE_DIAGONAL")
  @js.native
  def REVERSE_DIAGONAL: GD8Symmetry = js.native
  @scala.inline
  def REVERSE_DIAGONAL_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVERSE_DIAGONAL")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 90°↻     | South     |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.S")
  @js.native
  def S: GD8Symmetry = js.native
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 45°↻     | Southeast |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.SE")
  @js.native
  def SE: GD8Symmetry = js.native
  @scala.inline
  def SE_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SE")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 135°↻    | Southwest |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.SW")
  @js.native
  def SW: GD8Symmetry = js.native
  @scala.inline
  def SW_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SW")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def S_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S")(x.asInstanceOf[js.Any])
  
  /**
    * | Rotation | Direction |
    * |----------|-----------|
    * | 180°     | West      |
    *
    * @memberof PIXI.groupD8
    * @constant {PIXI.GD8Symmetry}
    */
  @JSGlobal("PIXI.groupD8.W")
  @js.native
  def W: GD8Symmetry = js.native
  @scala.inline
  def W_=(x: GD8Symmetry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("W")(x.asInstanceOf[js.Any])
  
  /**
    * Composes the two D8 operations.
    *
    * Taking `^` as reflection:
    *
    * |       | E=0 | S=2 | W=4 | N=6 | E^=8 | S^=10 | W^=12 | N^=14 |
    * |-------|-----|-----|-----|-----|------|-------|-------|-------|
    * | E=0   | E   | S   | W   | N   | E^   | S^    | W^    | N^    |
    * | S=2   | S   | W   | N   | E   | S^   | W^    | N^    | E^    |
    * | W=4   | W   | N   | E   | S   | W^   | N^    | E^    | S^    |
    * | N=6   | N   | E   | S   | W   | N^   | E^    | S^    | W^    |
    * | E^=8  | E^  | N^  | W^  | S^  | E    | N     | W     | S     |
    * | S^=10 | S^  | E^  | N^  | W^  | S    | E     | N     | W     |
    * | W^=12 | W^  | S^  | E^  | N^  | W    | S     | E     | N     |
    * | N^=14 | N^  | W^  | S^  | E^  | N    | W     | S     | E     |
    *
    * [This is a Cayley table]{@link https://en.wikipedia.org/wiki/Cayley_table}
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} rotationSecond - Second operation, which
    *   is the row in the above cayley table.
    * @param {PIXI.GD8Symmetry} rotationFirst - First operation, which
    *   is the column in the above cayley table.
    * @return {PIXI.GD8Symmetry} Composed operation
    */
  @JSGlobal("PIXI.groupD8.add")
  @js.native
  def add(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry = js.native
  
  /**
    * Approximates the vector `V(dx,dy)` into one of the
    * eight directions provided by `groupD8`.
    *
    * @memberof PIXI.groupD8
    * @param {number} dx - X-component of the vector
    * @param {number} dy - Y-component of the vector
    * @return {PIXI.GD8Symmetry} Approximation of the vector into
    *  one of the eight symmetries.
    */
  @JSGlobal("PIXI.groupD8.byDirection")
  @js.native
  def byDirection(dx: Double, dy: Double): GD8Symmetry = js.native
  
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} rotation - symmetry whose opposite
    *   is needed. Only rotations have opposite symmetries while
    *   reflections don't.
    * @return {PIXI.GD8Symmetry} The opposite symmetry of `rotation`
    */
  @JSGlobal("PIXI.groupD8.inv")
  @js.native
  def inv(rotation: GD8Symmetry): GD8Symmetry = js.native
  
  /**
    * Checks if the rotation angle is vertical, i.e. south
    * or north. It doesn't work for reflections.
    *
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} rotation - The number to check.
    * @returns {boolean} Whether or not the direction is vertical
    */
  @JSGlobal("PIXI.groupD8.isVertical")
  @js.native
  def isVertical(rotation: GD8Symmetry): Boolean = js.native
  
  /**
    * Helps sprite to compensate texture packer rotation.
    *
    * @memberof PIXI.groupD8
    * @param {PIXI.Matrix} matrix - sprite world matrix
    * @param {PIXI.GD8Symmetry} rotation - The rotation factor to use.
    * @param {number} tx - sprite anchoring
    * @param {number} ty - sprite anchoring
    */
  @JSGlobal("PIXI.groupD8.matrixAppendRotationInv")
  @js.native
  def matrixAppendRotationInv(matrix: typingsSlinky.pixiJs.PIXI.Matrix, rotation: GD8Symmetry, tx: Double, ty: Double): Unit = js.native
  
  /**
    * Adds 180 degrees to rotation, which is a commutative
    * operation.
    *
    * @memberof PIXI.groupD8
    * @param {number} rotation - The number to rotate.
    * @returns {number} Rotated number
    */
  @JSGlobal("PIXI.groupD8.rotate180")
  @js.native
  def rotate180(rotation: Double): Double = js.native
  
  /**
    * Reverse of `add`.
    *
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} rotationSecond - Second operation
    * @param {PIXI.GD8Symmetry} rotationFirst - First operation
    * @return {PIXI.GD8Symmetry} Result
    */
  @JSGlobal("PIXI.groupD8.sub")
  @js.native
  def sub(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry = js.native
  
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @return {PIXI.GD8Symmetry} The X-component of the U-axis
    *    after rotating the axes.
    */
  @JSGlobal("PIXI.groupD8.uX")
  @js.native
  def uX(ind: GD8Symmetry): GD8Symmetry = js.native
  
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @return {PIXI.GD8Symmetry} The Y-component of the U-axis
    *    after rotating the axes.
    */
  @JSGlobal("PIXI.groupD8.uY")
  @js.native
  def uY(ind: GD8Symmetry): GD8Symmetry = js.native
  
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @return {PIXI.GD8Symmetry} The X-component of the V-axis
    *    after rotating the axes.
    */
  @JSGlobal("PIXI.groupD8.vX")
  @js.native
  def vX(ind: GD8Symmetry): GD8Symmetry = js.native
  
  /**
    * @memberof PIXI.groupD8
    * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
    * @return {PIXI.GD8Symmetry} The Y-component of the V-axis
    *    after rotating the axes.
    */
  @JSGlobal("PIXI.groupD8.vY")
  @js.native
  def vY(ind: GD8Symmetry): GD8Symmetry = js.native
}
