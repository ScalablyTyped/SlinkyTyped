package typingsSlinky.iobroker.mod._Global_.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.iobroker.iobrokerStrings.config
import typingsSlinky.iobroker.iobrokerStrings.enum
import typingsSlinky.iobroker.iobrokerStrings.group
import typingsSlinky.iobroker.iobrokerStrings.host
import typingsSlinky.iobroker.iobrokerStrings.info
import typingsSlinky.iobroker.iobrokerStrings.instance
import typingsSlinky.iobroker.iobrokerStrings.meta
import typingsSlinky.iobroker.iobrokerStrings.script
import typingsSlinky.iobroker.iobrokerStrings.user
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherObject
  extends BaseObject
     with Object {
  @JSName("common")
  var common_OtherObject: OtherCommon
  @JSName("type")
  var type_OtherObject: adapter | config | enum | group | host | info | instance | meta | script | user
}

object OtherObject {
  @scala.inline
  def apply(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user,
    acl: ObjectACL = null,
    enums: Record[String, String] = null
  ): OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherObject]
  }
}

