package typingsSlinky.activexWia.WIA

import typingsSlinky.activexWia.activexWiaNumbers.`1`
import typingsSlinky.activexWia.activexWiaNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DeviceEvent's type is composed of bits from the WiaEventFlags enumeration. You can test a DeviceEvent's type by using the AND operation with
  * DeviceEvent.Type and a member from the WiaEventFlags enumeration.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexWia.activexWiaNumbers.`2`
  - typingsSlinky.activexWia.activexWiaNumbers.`1`
*/
trait WiaEventFlag extends js.Object
object WiaEventFlag {
  
  @scala.inline
  def ActionEvent: `2` = 2.asInstanceOf[`2`]
  
  @scala.inline
  def NotificationEvent: `1` = 1.asInstanceOf[`1`]
}
