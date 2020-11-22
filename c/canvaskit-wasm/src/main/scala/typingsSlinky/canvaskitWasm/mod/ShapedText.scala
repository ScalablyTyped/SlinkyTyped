package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapedText extends EmbindObject[ShapedText] {
  
  /**
    * Return the bounding area for the given text.
    * @param outputArray - if provided, the bounding box will be copied into this array instead of
    *                      allocating a new one.
    */
  def getBounds(): js.typedarray.Float32Array = js.native
  def getBounds(outputArray: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
}
