package typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCryptoKeyVersionsResponse extends js.Object {
  /** The list of CryptoKeyVersions. */
  var cryptoKeyVersions: js.UndefOr[js.Array[CryptoKeyVersion]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeyVersionsRequest.page_token to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of CryptoKeyVersions that matched the
    * query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object ListCryptoKeyVersionsResponse {
  @scala.inline
  def apply(): ListCryptoKeyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCryptoKeyVersionsResponse]
  }
  @scala.inline
  implicit class ListCryptoKeyVersionsResponseOps[Self <: ListCryptoKeyVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCryptoKeyVersions(value: js.Array[CryptoKeyVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeyVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoKeyVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeyVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(js.undefined)
        ret
    }
  }
  
}

