package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeviceSource")
@js.native
class DeviceSource[T /* <: typingsSlinky.babylonjs.BABYLON.DeviceType */] protected ()
  extends typingsSlinky.babylonjs.BABYLON.DeviceSource[T] {
  /**
    * Default Constructor
    * @param deviceInputSystem Reference to DeviceInputSystem
    * @param deviceType Type of device
    * @param deviceSlot "Slot" or index that device is referenced in
    */
  def this(
    deviceInputSystem: typingsSlinky.babylonjs.BABYLON.DeviceInputSystem,
    /** Type of device */
  deviceType: typingsSlinky.babylonjs.BABYLON.DeviceType
  ) = this()
  def this(
    deviceInputSystem: typingsSlinky.babylonjs.BABYLON.DeviceInputSystem,
    /** Type of device */
  deviceType: typingsSlinky.babylonjs.BABYLON.DeviceType,
    /** "Slot" or index that device is referenced in */
  deviceSlot: Double
  ) = this()
}
