package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ArrayTools")
@js.native
class ArrayTools ()
  extends typingsSlinky.babylonjs.BABYLON.ArrayTools
/* static members */
object ArrayTools {
  
  /**
    * Returns an array of the given size filled with element built from the given constructor and the paramters
    * @param size the number of element to construct and put in the array
    * @param itemBuilder a callback responsible for creating new instance of item. Called once per array entry.
    * @returns a new array filled with new objects
    */
  @JSGlobal("BABYLON.ArrayTools.BuildArray")
  @js.native
  def BuildArray[T](size: Double, itemBuilder: js.Function0[T]): js.Array[T] = js.native
}
