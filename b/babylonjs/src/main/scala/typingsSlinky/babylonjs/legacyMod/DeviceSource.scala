package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DeviceSource")
@js.native
class DeviceSource[T /* <: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType */] protected ()
  extends typingsSlinky.babylonjs.indexMod.DeviceSource[T] {
  /**
    * Default Constructor
    * @param deviceInputSystem Reference to DeviceInputSystem
    * @param deviceType Type of device
    * @param deviceSlot "Slot" or index that device is referenced in
    */
  def this(
    deviceInputSystem: typingsSlinky.babylonjs.deviceInputSystemMod.DeviceInputSystem,
    /** Type of device */
  deviceType: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType
  ) = this()
  def this(
    deviceInputSystem: typingsSlinky.babylonjs.deviceInputSystemMod.DeviceInputSystem,
    /** Type of device */
  deviceType: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType,
    /** "Slot" or index that device is referenced in */
  deviceSlot: Double
  ) = this()
}
