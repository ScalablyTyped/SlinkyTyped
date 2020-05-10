package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1DatastoreKey extends js.Object {
  /** Datastore entity key. */
  var entityKey: js.UndefOr[GooglePrivacyDlpV2beta1Key] = js.native
}

object GooglePrivacyDlpV2beta1DatastoreKey {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1DatastoreKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DatastoreKey]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1DatastoreKeyOps[Self <: GooglePrivacyDlpV2beta1DatastoreKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityKey(value: GooglePrivacyDlpV2beta1Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityKey")(js.undefined)
        ret
    }
  }
  
}

