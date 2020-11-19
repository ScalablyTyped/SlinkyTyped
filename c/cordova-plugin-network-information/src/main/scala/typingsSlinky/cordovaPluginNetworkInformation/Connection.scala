package typingsSlinky.cordovaPluginNetworkInformation

import typingsSlinky.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The connection object, exposed via navigator.connection, provides information
  * about the device's cellular and wifi connection.
  */
@js.native
trait Connection extends js.Object {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, useCapture: Boolean): Unit = js.native
  
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, useCapture: Boolean): Unit = js.native
  
  /**
    * This property offers a fast way to determine the device's network connection state, and type of connection.
    * One of:
    *     Connection.UNKNOWN
    *     Connection.ETHERNET
    *     Connection.WIFI
    *     Connection.CELL_2G
    *     Connection.CELL_3G
    *     Connection.CELL_4G
    *     Connection.CELL
    *     Connection.NONE
    */
  var `type`: String = js.native
}
