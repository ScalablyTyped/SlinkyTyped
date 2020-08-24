package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.iobroker.iobrokerStrings.channel
import typingsSlinky.iobroker.iobrokerStrings.config
import typingsSlinky.iobroker.iobrokerStrings.device
import typingsSlinky.iobroker.iobrokerStrings.enum
import typingsSlinky.iobroker.iobrokerStrings.folder
import typingsSlinky.iobroker.iobrokerStrings.group
import typingsSlinky.iobroker.iobrokerStrings.host
import typingsSlinky.iobroker.iobrokerStrings.info
import typingsSlinky.iobroker.iobrokerStrings.instance
import typingsSlinky.iobroker.iobrokerStrings.meta
import typingsSlinky.iobroker.iobrokerStrings.script
import typingsSlinky.iobroker.iobrokerStrings.state
import typingsSlinky.iobroker.iobrokerStrings.user
import typingsSlinky.std.Record
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
  def StateObject(_id: String, common: StateCommon, native: Record[String, ObjectField], `type`: state): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  @scala.inline
  def FolderObject(_id: String, common: OtherCommon, native: Record[String, ObjectField], `type`: folder): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  @scala.inline
  def DeviceObject(_id: String, common: DeviceCommon, native: Record[String, ObjectField], `type`: device): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  @scala.inline
  def ChannelObject(_id: String, common: ChannelCommon, native: Record[String, ObjectField], `type`: channel): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  @scala.inline
  def OtherObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, ObjectField],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user
  ): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
}

