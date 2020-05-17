package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base type for Objects. Should not be used directly
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iobroker.mod.global.ioBroker.StateObject
  - typingsSlinky.iobroker.mod.global.ioBroker.ChannelObject
  - typingsSlinky.iobroker.mod.global.ioBroker.DeviceObject
  - typingsSlinky.iobroker.mod.global.ioBroker.FolderObject
  - typingsSlinky.iobroker.mod.global.ioBroker.OtherObject
*/
trait AnyObject extends js.Object

object AnyObject {
  @scala.inline
  implicit def apply(value: ChannelObject): AnyObject = value.asInstanceOf[AnyObject]
  @scala.inline
  implicit def apply(value: DeviceObject): AnyObject = value.asInstanceOf[AnyObject]
  @scala.inline
  implicit def apply(value: FolderObject): AnyObject = value.asInstanceOf[AnyObject]
  @scala.inline
  implicit def apply(value: OtherObject): AnyObject = value.asInstanceOf[AnyObject]
  @scala.inline
  implicit def apply(value: StateObject): AnyObject = value.asInstanceOf[AnyObject]
}

