package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  The Request of the CreateCompany method.
  */
@js.native
trait SchemaCreateCompanyRequest extends js.Object {
  /**
    * Required.  The company to be created.
    */
  var company: js.UndefOr[SchemaCompany] = js.native
}

object SchemaCreateCompanyRequest {
  @scala.inline
  def apply(): SchemaCreateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCompanyRequest]
  }
  @scala.inline
  implicit class SchemaCreateCompanyRequestOps[Self <: SchemaCreateCompanyRequest] (val x: Self) extends AnyVal {
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
  }
  
}

