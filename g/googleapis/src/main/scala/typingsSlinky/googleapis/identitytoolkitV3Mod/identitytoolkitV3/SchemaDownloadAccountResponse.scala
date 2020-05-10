package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of downloading accounts in batch.
  */
@js.native
trait SchemaDownloadAccountResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#DownloadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The next page token. To be used in a subsequent request to return the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The user accounts data.
    */
  var users: js.UndefOr[js.Array[SchemaUserInfo]] = js.native
}

object SchemaDownloadAccountResponse {
  @scala.inline
  def apply(): SchemaDownloadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadAccountResponse]
  }
  @scala.inline
  implicit class SchemaDownloadAccountResponseOps[Self <: SchemaDownloadAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUsers(value: js.Array[SchemaUserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

