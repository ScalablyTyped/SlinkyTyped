package typingsSlinky.googleCloudKms.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudKms.mod.v1.CryptoKeyVersion
import typingsSlinky.googleCloudKms.mod.v1.CryptoKeyVersionTemplate
import typingsSlinky.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/kms.@google-cloud/kms.v1.Omit<@google-cloud/kms.@google-cloud/kms.v1.CryptoKey, 'purpose'>> & {  purpose  :keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any} */
@js.native
trait PartialOmitCryptoKeypurpo extends js.Object {
  var createTime: js.UndefOr[AsObject] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var nextRotationTime: js.UndefOr[AsObject] = js.native
  var primary: js.UndefOr[CryptoKeyVersion] = js.native
  var purpose: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any */ String = js.native
  var versionTemplate: js.UndefOr[CryptoKeyVersionTemplate] = js.native
}

object PartialOmitCryptoKeypurpo {
  @scala.inline
  def apply(
    purpose: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any */ String
  ): PartialOmitCryptoKeypurpo = {
    val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOmitCryptoKeypurpo]
  }
  @scala.inline
  implicit class PartialOmitCryptoKeypurpoOps[Self <: PartialOmitCryptoKeypurpo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPurpose(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any */ String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    @scala.inline
    def withPrimary(value: CryptoKeyVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionTemplate(value: CryptoKeyVersionTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTemplate")(js.undefined)
        ret
    }
  }
  
}

