package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Size")
@js.native
class Size protected ()
  extends typingsSlinky.babylonjs.indexMod.Size {
  /**
    * Creates a Size object from the given width and height (floats).
    * @param width width of the new size
    * @param height height of the new size
    */
  def this(width: Double, height: Double) = this()
}
/* static members */
object Size {
  
  /**
    * Creates a new Size set at the linear interpolation "amount" between "start" and "end"
    * @param start starting size to lerp between
    * @param end end size to lerp between
    * @param amount amount to lerp between the start and end values
    * @returns a new Size set at the linear interpolation "amount" between "start" and "end"
    */
  @JSImport("babylonjs/Legacy/legacy", "Size.Lerp")
  @js.native
  def Lerp(
    start: typingsSlinky.babylonjs.mathSizeMod.Size,
    end: typingsSlinky.babylonjs.mathSizeMod.Size,
    amount: Double
  ): typingsSlinky.babylonjs.mathSizeMod.Size = js.native
  
  /**
    * Create a new size of zero
    * @returns a new Size set to (0.0, 0.0)
    */
  @JSImport("babylonjs/Legacy/legacy", "Size.Zero")
  @js.native
  def Zero(): typingsSlinky.babylonjs.mathSizeMod.Size = js.native
}
