package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1RecordKey extends js.Object {
  var cloudStorageKey: js.UndefOr[GooglePrivacyDlpV2beta1CloudStorageKey] = js.native
  var datastoreKey: js.UndefOr[GooglePrivacyDlpV2beta1DatastoreKey] = js.native
}

object GooglePrivacyDlpV2beta1RecordKey {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1RecordKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RecordKey]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RecordKeyOps[Self <: GooglePrivacyDlpV2beta1RecordKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudStorageKey(value: GooglePrivacyDlpV2beta1CloudStorageKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudStorageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDatastoreKey(value: GooglePrivacyDlpV2beta1DatastoreKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastoreKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreKey")(js.undefined)
        ret
    }
  }
  
}

