package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The grouplicense resources for the enterprise.
  */
@js.native
trait SchemaGroupLicensesListResponse extends js.Object {
  /**
    * A group license for a product approved for use in the enterprise.
    */
  var groupLicense: js.UndefOr[js.Array[SchemaGroupLicense]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#groupLicensesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaGroupLicensesListResponse {
  @scala.inline
  def apply(): SchemaGroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLicensesListResponse]
  }
  @scala.inline
  implicit class SchemaGroupLicensesListResponseOps[Self <: SchemaGroupLicensesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupLicense(value: js.Array[SchemaGroupLicense]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLicense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLicense")(js.undefined)
        ret
    }
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
  }
  
}

