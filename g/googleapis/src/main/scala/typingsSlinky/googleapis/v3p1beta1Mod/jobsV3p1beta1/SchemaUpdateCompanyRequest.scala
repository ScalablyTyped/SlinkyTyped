package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Request for updating a specified company.
  */
@js.native
trait SchemaUpdateCompanyRequest extends js.Object {
  /**
    * Required.  The company resource to replace the current resource in the
    * system.
    */
  var company: js.UndefOr[SchemaCompany] = js.native
  /**
    * Optional but strongly recommended for the best service experience.  If
    * update_mask is provided, only the specified fields in company are
    * updated. Otherwise all the fields are updated.  A field mask to specify
    * the company fields to be updated. Only top level fields of Company are
    * supported.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateCompanyRequest {
  @scala.inline
  def apply(): SchemaUpdateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateCompanyRequest]
  }
  @scala.inline
  implicit class SchemaUpdateCompanyRequestOps[Self <: SchemaUpdateCompanyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany(value: SchemaCompany): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
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

