package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointerInfo")
@js.native
class PointerInfo protected ()
  extends typingsSlinky.babylonjs.BABYLON.PointerInfo {
  def this(
    `type`: Double,
    event: WheelEvent,
    /**
    * Defines the picking info associated to the info (if any)\
    */
  pickInfo: Nullable[typingsSlinky.babylonjs.BABYLON.PickingInfo]
  ) = this()
  /**
    * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param pickInfo Defines the picking info associated to the info (if any)\
    */
  def this(
    `type`: Double,
    event: PointerEvent,
    /**
    * Defines the picking info associated to the info (if any)\
    */
  pickInfo: Nullable[typingsSlinky.babylonjs.BABYLON.PickingInfo]
  ) = this()
}
