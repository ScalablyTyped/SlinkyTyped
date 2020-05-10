package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matching enterprise resources.
  */
@js.native
trait SchemaEnterprisesListResponse extends js.Object {
  /**
    * An enterprise.
    */
  var enterprise: js.UndefOr[js.Array[SchemaEnterprise]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterprisesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEnterprisesListResponse {
  @scala.inline
  def apply(): SchemaEnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprisesListResponse]
  }
  @scala.inline
  implicit class SchemaEnterprisesListResponseOps[Self <: SchemaEnterprisesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterprise(value: js.Array[SchemaEnterprise]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterprise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise")(js.undefined)
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

