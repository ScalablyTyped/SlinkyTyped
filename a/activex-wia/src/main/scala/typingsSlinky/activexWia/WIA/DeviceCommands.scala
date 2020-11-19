package typingsSlinky.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeviceCommands object is a collection of all the supported DeviceCommands for an imaging device. See the Commands property of a Device or Item
  * object for more details on determining the collection of supported device commands.
  */
@js.native
trait DeviceCommands extends js.Object {
  
  /** Returns the specified item in the collection by position */
  def apply(Index: Double): DeviceCommand = js.native
  
  /** Returns the number of members in the collection */
  val Count: Double = js.native
  
  /** Returns the specified item in the collection by position */
  def Item(Index: Double): DeviceCommand = js.native
}
