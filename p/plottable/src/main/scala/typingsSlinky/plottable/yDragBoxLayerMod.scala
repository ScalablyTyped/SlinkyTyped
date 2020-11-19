package typingsSlinky.plottable

import typingsSlinky.plottable.dragBoxLayerMod.DragBoxLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/components/yDragBoxLayer", JSImport.Namespace)
@js.native
object yDragBoxLayerMod extends js.Object {
  
  @js.native
  /**
    * A YDragBoxLayer is a DragBoxLayer whose size can only be set in the Y-direction.
    * The x-values of the bounds() are always set to 0 and the width() of the YDragBoxLayer.
    *
    * @constructor
    */
  class YDragBoxLayer () extends DragBoxLayer
}
