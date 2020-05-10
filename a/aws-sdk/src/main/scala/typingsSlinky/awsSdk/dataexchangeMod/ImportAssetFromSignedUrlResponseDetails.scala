package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportAssetFromSignedUrlResponseDetails extends js.Object {
  /**
    * The name for the asset associated with this import response.
    */
  var AssetName: typingsSlinky.awsSdk.dataexchangeMod.AssetName = js.native
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  /**
    * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
    */
  var Md5Hash: js.UndefOr[stringMin24Max24PatternAZaZ094AZaZ092AZaZ093] = js.native
  /**
    * The unique identifier for the revision associated with this import response.
    */
  var RevisionId: Id = js.native
  /**
    * The signed URL.
    */
  var SignedUrl: js.UndefOr[string] = js.native
  /**
    * The time and date at which the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[js.Date] = js.native
}

object ImportAssetFromSignedUrlResponseDetails {
  @scala.inline
  def apply(AssetName: AssetName, DataSetId: Id, RevisionId: Id): ImportAssetFromSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlResponseDetails]
  }
  @scala.inline
  implicit class ImportAssetFromSignedUrlResponseDetailsOps[Self <: ImportAssetFromSignedUrlResponseDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetName(value: AssetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSetId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5Hash(value: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Md5Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Md5Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedUrlExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedUrlExpiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedUrlExpiresAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedUrlExpiresAt")(js.undefined)
        ret
    }
  }
  
}

