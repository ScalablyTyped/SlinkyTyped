package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Size")
@js.native
class Size protected ()
  extends typingsSlinky.babylonjs.mathsIndexMod.Size {
  /**
    * Creates a Size object from the given width and height (floats).
    * @param width width of the new size
    * @param height height of the new size
    */
  def this(width: Double, height: Double) = this()
}
/* static members */
@JSImport("babylonjs/index", "Size")
@js.native
object Size extends js.Object {
  
  /**
    * Creates a new Size set at the linear interpolation "amount" between "start" and "end"
    * @param start starting size to lerp between
    * @param end end size to lerp between
    * @param amount amount to lerp between the start and end values
    * @returns a new Size set at the linear interpolation "amount" between "start" and "end"
    */
  def Lerp(
    start: typingsSlinky.babylonjs.mathSizeMod.Size,
    end: typingsSlinky.babylonjs.mathSizeMod.Size,
    amount: Double
  ): typingsSlinky.babylonjs.mathSizeMod.Size = js.native
  
  /**
    * Create a new size of zero
    * @returns a new Size set to (0.0, 0.0)
    */
  def Zero(): typingsSlinky.babylonjs.mathSizeMod.Size = js.native
}
