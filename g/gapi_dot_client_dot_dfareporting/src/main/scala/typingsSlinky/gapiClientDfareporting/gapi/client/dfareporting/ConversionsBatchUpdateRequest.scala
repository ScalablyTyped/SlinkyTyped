package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionsBatchUpdateRequest extends js.Object {
  /** The set of conversions to update. */
  var conversions: js.UndefOr[js.Array[Conversion]] = js.native
  /** Describes how encryptedUserId is encrypted. This is a required field if encryptedUserId is used. */
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchUpdateRequest". */
  var kind: js.UndefOr[String] = js.native
}

object ConversionsBatchUpdateRequest {
  @scala.inline
  def apply(): ConversionsBatchUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionsBatchUpdateRequest]
  }
  @scala.inline
  implicit class ConversionsBatchUpdateRequestOps[Self <: ConversionsBatchUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversions(value: js.Array[Conversion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversions")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionInfo(value: EncryptionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

