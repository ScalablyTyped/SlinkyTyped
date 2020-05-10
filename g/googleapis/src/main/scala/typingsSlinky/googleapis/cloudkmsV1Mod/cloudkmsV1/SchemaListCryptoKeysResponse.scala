package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.ListCryptoKeys.
  */
@js.native
trait SchemaListCryptoKeysResponse extends js.Object {
  /**
    * The list of CryptoKeys.
    */
  var cryptoKeys: js.UndefOr[js.Array[SchemaCryptoKey]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeysRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of CryptoKeys that matched the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaListCryptoKeysResponse {
  @scala.inline
  def apply(): SchemaListCryptoKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCryptoKeysResponse]
  }
  @scala.inline
  implicit class SchemaListCryptoKeysResponseOps[Self <: SchemaListCryptoKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCryptoKeys(value: js.Array[SchemaCryptoKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeys")(js.undefined)
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

