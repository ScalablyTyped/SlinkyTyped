package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure to describe the error encountered during batch operation on one
  * resource. This is used both for sample errors in operation response, and
  * for format of errors in error reports.
  */
@js.native
trait SchemaErrorDetail extends js.Object {
  /**
    * The status of the error.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * The identifier of the resource.
    */
  var resource: js.UndefOr[String] = js.native
}

object SchemaErrorDetail {
  @scala.inline
  def apply(): SchemaErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorDetail]
  }
  @scala.inline
  implicit class SchemaErrorDetailOps[Self <: SchemaErrorDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

