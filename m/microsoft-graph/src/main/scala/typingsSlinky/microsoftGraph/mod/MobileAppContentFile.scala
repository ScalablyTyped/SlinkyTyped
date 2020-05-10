package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppContentFile extends Entity {
  // The Azure Storage URI.
  var azureStorageUri: js.UndefOr[String] = js.native
  // The time the Azure storage Uri expires.
  var azureStorageUriExpirationDateTime: js.UndefOr[String] = js.native
  // The time the file was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // A value indicating whether the file is committed.
  var isCommitted: js.UndefOr[Boolean] = js.native
  // The manifest information.
  var manifest: js.UndefOr[Double] = js.native
  // the file name.
  var name: js.UndefOr[String] = js.native
  // The size of the file prior to encryption.
  var size: js.UndefOr[Double] = js.native
  // The size of the file after encryption.
  var sizeEncrypted: js.UndefOr[Double] = js.native
  /**
    * The state of the current upload request. Possible values are: success, transientError, error, unknown,
    * azureStorageUriRequestSuccess, azureStorageUriRequestPending, azureStorageUriRequestFailed,
    * azureStorageUriRequestTimedOut, azureStorageUriRenewalSuccess, azureStorageUriRenewalPending,
    * azureStorageUriRenewalFailed, azureStorageUriRenewalTimedOut, commitFileSuccess, commitFilePending, commitFileFailed,
    * commitFileTimedOut.
    */
  var uploadState: js.UndefOr[MobileAppContentFileUploadState] = js.native
}

object MobileAppContentFile {
  @scala.inline
  def apply(): MobileAppContentFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppContentFile]
  }
  @scala.inline
  implicit class MobileAppContentFileOps[Self <: MobileAppContentFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAzureStorageUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureStorageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureStorageUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureStorageUri")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureStorageUriExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureStorageUriExpirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureStorageUriExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureStorageUriExpirationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCommitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCommitted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommitted")(js.undefined)
        ret
    }
    @scala.inline
    def withManifest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(js.undefined)
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
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeEncrypted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadState(value: MobileAppContentFileUploadState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadState")(js.undefined)
        ret
    }
  }
  
}

