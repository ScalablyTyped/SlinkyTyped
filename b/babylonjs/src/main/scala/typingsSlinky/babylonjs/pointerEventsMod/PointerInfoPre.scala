package typingsSlinky.babylonjs.pointerEventsMod

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.rayMod.Ray
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Events/pointerEvents", "PointerInfoPre")
@js.native
class PointerInfoPre protected () extends PointerInfoBase {
  def this(`type`: Double, event: WheelEvent, localX: Double, localY: Double) = this()
  /**
    * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param localX Defines the local x coordinates of the pointer when the event occured
    * @param localY Defines the local y coordinates of the pointer when the event occured
    */
  def this(`type`: Double, event: PointerEvent, localX: Double, localY: Double) = this()
  
  /**
    * Defines the local position of the pointer on the canvas.
    */
  var localPosition: Vector2 = js.native
  
  /**
    * Ray from a pointer if availible (eg. 6dof controller)
    */
  var ray: Nullable[Ray] = js.native
  
  /**
    * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
    */
  var skipOnPointerObservable: Boolean = js.native
}
