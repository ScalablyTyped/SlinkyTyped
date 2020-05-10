package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for AuthorizedCertificates.ListAuthorizedCertificates.
  */
@js.native
trait SchemaListAuthorizedCertificatesResponse extends js.Object {
  /**
    * The SSL certificates the user is authorized to administer.
    */
  var certificates: js.UndefOr[js.Array[SchemaAuthorizedCertificate]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAuthorizedCertificatesResponse {
  @scala.inline
  def apply(): SchemaListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuthorizedCertificatesResponse]
  }
  @scala.inline
  implicit class SchemaListAuthorizedCertificatesResponseOps[Self <: SchemaListAuthorizedCertificatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificates(value: js.Array[SchemaAuthorizedCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(js.undefined)
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
  }
  
}

