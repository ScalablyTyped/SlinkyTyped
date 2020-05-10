package typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BinauthzManagementService.ListAttestors.
  */
@js.native
trait SchemaListAttestorsResponse extends js.Object {
  /**
    * The list of attestors.
    */
  var attestors: js.UndefOr[js.Array[SchemaAttestor]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListAttestorsRequest.page_token field in the subsequent call to the
    * `ListAttestors` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAttestorsResponse {
  @scala.inline
  def apply(): SchemaListAttestorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAttestorsResponse]
  }
  @scala.inline
  implicit class SchemaListAttestorsResponseOps[Self <: SchemaListAttestorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttestors(value: js.Array[SchemaAttestor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttestors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestors")(js.undefined)
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

