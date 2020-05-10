package typingsSlinky.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKey extends js.Object {
  var createTime: AsObject = js.native
  var labels: StringDictionary[String] = js.native
  var name: String = js.native
  var nextRotationTime: js.UndefOr[AsObject] = js.native
  var primary: CryptoKeyVersion = js.native
  var purpose: CryptoKeyPurpose = js.native
  var versionTemplate: CryptoKeyVersionTemplate = js.native
}

object CryptoKey {
  @scala.inline
  def apply(
    createTime: AsObject,
    labels: StringDictionary[String],
    name: String,
    primary: CryptoKeyVersion,
    purpose: CryptoKeyPurpose,
    versionTemplate: CryptoKeyVersionTemplate
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], versionTemplate = versionTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  @scala.inline
  implicit class CryptoKeyOps[Self <: CryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: CryptoKeyVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurpose(value: CryptoKeyPurpose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionTemplate(value: CryptoKeyVersionTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextRotationTime(value: AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRotationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextRotationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRotationTime")(js.undefined)
        ret
    }
  }
  
}

