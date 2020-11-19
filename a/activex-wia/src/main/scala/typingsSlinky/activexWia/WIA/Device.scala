package typingsSlinky.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Device object represents an active connection to an imaging device. */
@js.native
trait Device extends js.Object {
  
  /** Returns the specified item in the collection by position */
  /** A collection of all commands for this imaging device */
  def Commands(Index: Double): DeviceCommand = js.native
  /** A collection of all commands for this imaging device */
  @JSName("Commands")
  val Commands_Original: DeviceCommands = js.native
  
  /** Returns the DeviceID for this Device */
  val DeviceID: String = js.native
  
  /** Returns the specified item in the collection by position */
  /** A collection of all events for this imaging device */
  def Events(Index: Double): DeviceEvent = js.native
  /** A collection of all events for this imaging device */
  @JSName("Events")
  val Events_Original: DeviceEvents = js.native
  
  /**
    * Issues the command specified by CommandID to the imaging device. CommandIDs are device dependent. Valid CommandIDs for this Device are contained in
    * the Commands collection.
    */
  def ExecuteCommand(CommandID: String): Item = js.native
  
  /** Returns the Item object specified by ItemID if it exists */
  def GetItem(ItemID: String): Item = js.native
  
  /** Returns the specified item in the collection by position */
  /** A collection of all items for this imaging device */
  def Items(Index: Double): Item = js.native
  /** A collection of all items for this imaging device */
  @JSName("Items")
  val Items_Original: Items = js.native
  
  def Properties(Index: String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this imaging device */
  def Properties(Index: Double): Property = js.native
  /** A collection of all properties for this imaging device */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  /** Returns the Type of Device */
  val Type: WiaDeviceType = js.native
  
  @JSName("WIA.Device_typekey")
  var WIADotDevice_typekey: Device = js.native
}
