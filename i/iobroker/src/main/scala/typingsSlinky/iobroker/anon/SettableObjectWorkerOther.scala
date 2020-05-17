package typingsSlinky.iobroker.anon

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
import typingsSlinky.iobroker.mod.global.ioBroker.ObjectACL
import typingsSlinky.iobroker.mod.global.ioBroker.ObjectField
import typingsSlinky.iobroker.mod.global.ioBroker.OtherCommon
import typingsSlinky.iobroker.mod.global.ioBroker.SettableObject
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined iobroker.iobroker.<global>.ioBroker.SettableObjectWorker<iobroker.iobroker.<global>.ioBroker.OtherObject> */
@js.native
trait SettableObjectWorkerOther extends SettableObject {
  var _id: js.UndefOr[String] = js.native
  var acl: js.UndefOr[ObjectACL] = js.native
  var common: OtherCommon = js.native
  var encryptedNative: js.UndefOr[js.Array[String]] = js.native
  var enums: js.UndefOr[Record[String, String]] = js.native
  var from: js.UndefOr[String] = js.native
  var native: Record[String, ObjectField] = js.native
  var protectedNative: js.UndefOr[js.Array[String]] = js.native
  var ts: js.UndefOr[Double] = js.native
  var `type`: adapter | config | enum | group | host | info | instance | meta | script | user = js.native
}

object SettableObjectWorkerOther {
  @scala.inline
  def apply(
    common: OtherCommon,
    native: Record[String, ObjectField],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user
  ): SettableObjectWorkerOther = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObjectWorkerOther]
  }
  @scala.inline
  implicit class SettableObjectWorkerOtherOps[Self <: SettableObjectWorkerOther] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommon(value: OtherCommon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative(value: Record[String, ObjectField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: adapter | config | enum | group | host | info | instance | meta | script | user): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAcl(value: ObjectACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptedNative(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedNative")(js.undefined)
        ret
    }
    @scala.inline
    def withEnums(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enums")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectedNative(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedNative")(js.undefined)
        ret
    }
    @scala.inline
    def withTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(js.undefined)
        ret
    }
  }
  
}

