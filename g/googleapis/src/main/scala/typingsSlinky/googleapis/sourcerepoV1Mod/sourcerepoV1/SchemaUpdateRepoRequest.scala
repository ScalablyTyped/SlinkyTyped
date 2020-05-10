package typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for UpdateRepo.
  */
@js.native
trait SchemaUpdateRepoRequest extends js.Object {
  /**
    * The new configuration for the repository.
    */
  var repo: js.UndefOr[SchemaRepo] = js.native
  /**
    * A FieldMask specifying which fields of the repo to modify. Only the
    * fields in the mask will be modified. If no mask is provided, this request
    * is no-op.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateRepoRequest {
  @scala.inline
  def apply(): SchemaUpdateRepoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateRepoRequest]
  }
  @scala.inline
  implicit class SchemaUpdateRepoRequestOps[Self <: SchemaUpdateRepoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepo(value: SchemaRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

