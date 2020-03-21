package typingsSlinky.iobroker.mod._Global_.ioBroker

import typingsSlinky.iobroker.PartialObjectCommon
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

/* Inlined parent std.Partial<std.Pick<iobroker.iobroker._Global_.ioBroker.OtherObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>> */
trait PartialOtherObject extends PartialObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[ObjectACL] = js.undefined
  var common: js.UndefOr[PartialObjectCommon] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var native: js.UndefOr[Record[String, _]] = js.undefined
  var `type`: js.UndefOr[adapter | config | enum | group | host | info | instance | meta | script | user] = js.undefined
}

object PartialOtherObject {
  @scala.inline
  def apply(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialObjectCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user = null
  ): PartialOtherObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOtherObject]
  }
}

