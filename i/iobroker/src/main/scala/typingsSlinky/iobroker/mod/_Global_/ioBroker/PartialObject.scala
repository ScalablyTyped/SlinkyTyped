package typingsSlinky.iobroker.mod._Global_.ioBroker

import typingsSlinky.iobroker.PartialChannelCommon
import typingsSlinky.iobroker.PartialDeviceCommon
import typingsSlinky.iobroker.PartialObjectCommon
import typingsSlinky.iobroker.PartialStateACL
import typingsSlinky.iobroker.PartialStateCommon
import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.iobroker.iobrokerStrings.channel
import typingsSlinky.iobroker.iobrokerStrings.config
import typingsSlinky.iobroker.iobrokerStrings.device
import typingsSlinky.iobroker.iobrokerStrings.enum
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

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iobroker.mod._Global_.ioBroker.PartialStateObject
  - typingsSlinky.iobroker.mod._Global_.ioBroker.PartialChannelObject
  - typingsSlinky.iobroker.mod._Global_.ioBroker.PartialDeviceObject
  - typingsSlinky.iobroker.mod._Global_.ioBroker.PartialOtherObject
*/
trait PartialObject extends js.Object

object PartialObject {
  @scala.inline
  def PartialStateObject(
    _id: String = null,
    acl: PartialStateACL = null,
    common: PartialStateCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: state = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialChannelObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialChannelCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: channel = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialDeviceObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialDeviceCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: device = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
  @scala.inline
  def PartialOtherObject(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialObjectCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user = null
  ): PartialObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObject]
  }
}

