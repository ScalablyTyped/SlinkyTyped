package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iobroker.mod.global.ioBroker.PartialStateObject
  - typingsSlinky.iobroker.mod.global.ioBroker.PartialChannelObject
  - typingsSlinky.iobroker.mod.global.ioBroker.PartialDeviceObject
  - typingsSlinky.iobroker.mod.global.ioBroker.PartialFolderObject
  - typingsSlinky.iobroker.mod.global.ioBroker.PartialOtherObject
*/
trait PartialObject extends js.Object

object PartialObject {
  @scala.inline
  implicit def apply(value: PartialChannelObject): PartialObject = value.asInstanceOf[PartialObject]
  @scala.inline
  implicit def apply(value: PartialDeviceObject): PartialObject = value.asInstanceOf[PartialObject]
  @scala.inline
  implicit def apply(value: PartialFolderObject): PartialObject = value.asInstanceOf[PartialObject]
  @scala.inline
  implicit def apply(value: PartialOtherObject): PartialObject = value.asInstanceOf[PartialObject]
  @scala.inline
  implicit def apply(value: PartialStateObject): PartialObject = value.asInstanceOf[PartialObject]
}

