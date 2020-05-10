package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Details extends js.Object {
  var ImportAssetFromSignedUrlJobErrorDetails: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.ImportAssetFromSignedUrlJobErrorDetails] = js.native
  var ImportAssetsFromS3JobErrorDetails: js.UndefOr[ListOfAssetSourceEntry] = js.native
}

object Details {
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportAssetFromSignedUrlJobErrorDetails(value: ImportAssetFromSignedUrlJobErrorDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportAssetFromSignedUrlJobErrorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportAssetFromSignedUrlJobErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportAssetFromSignedUrlJobErrorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withImportAssetsFromS3JobErrorDetails(value: ListOfAssetSourceEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportAssetsFromS3JobErrorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportAssetsFromS3JobErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportAssetsFromS3JobErrorDetails")(js.undefined)
        ret
    }
  }
  
}

