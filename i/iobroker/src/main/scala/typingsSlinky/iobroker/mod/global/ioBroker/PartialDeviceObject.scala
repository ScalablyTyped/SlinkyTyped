package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.anon.PartialDeviceCommon
import typingsSlinky.iobroker.iobrokerStrings.device
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Omit<iobroker.iobroker.<global>.ioBroker.DeviceObject, 'common'>> */
@js.native
trait PartialDeviceObject extends PartialObject {
  var _id: js.UndefOr[String] = js.native
  var acl: js.UndefOr[ObjectACL] = js.native
  var common: js.UndefOr[PartialDeviceCommon] = js.native
  var encryptedNative: js.UndefOr[js.Array[String]] = js.native
  var enums: js.UndefOr[Record[String, String]] = js.native
  var from: js.UndefOr[String] = js.native
  var native: js.UndefOr[Record[String, ObjectField]] = js.native
  var protectedNative: js.UndefOr[js.Array[String]] = js.native
  var ts: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[device] = js.native
}

object PartialDeviceObject {
  @scala.inline
  def apply(): PartialDeviceObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDeviceObject]
  }
  @scala.inline
  implicit class PartialDeviceObjectOps[Self <: PartialDeviceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCommon(value: PartialDeviceCommon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(js.undefined)
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
    def withNative(value: Record[String, ObjectField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(js.undefined)
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
    @scala.inline
    def withType(value: device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

