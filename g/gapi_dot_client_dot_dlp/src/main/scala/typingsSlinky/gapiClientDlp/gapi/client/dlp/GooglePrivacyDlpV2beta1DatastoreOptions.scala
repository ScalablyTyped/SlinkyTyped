package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1DatastoreOptions extends js.Object {
  /** The kind to process. */
  var kind: js.UndefOr[GooglePrivacyDlpV2beta1KindExpression] = js.native
  /**
    * A partition ID identifies a grouping of entities. The grouping is always
    * by project and namespace, however the namespace ID may be empty.
    */
  var partitionId: js.UndefOr[GooglePrivacyDlpV2beta1PartitionId] = js.native
  /**
    * Properties to scan. If none are specified, all properties will be scanned
    * by default.
    */
  var projection: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Projection]] = js.native
}

object GooglePrivacyDlpV2beta1DatastoreOptions {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1DatastoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DatastoreOptions]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1DatastoreOptionsOps[Self <: GooglePrivacyDlpV2beta1DatastoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: GooglePrivacyDlpV2beta1KindExpression): Self = {
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
    @scala.inline
    def withPartitionId(value: GooglePrivacyDlpV2beta1PartitionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: js.Array[GooglePrivacyDlpV2beta1Projection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
  }
  
}

