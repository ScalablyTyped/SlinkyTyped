package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service account that can be used to authenticate as the enterprise to API
  * calls that require such authentication.
  */
@js.native
trait SchemaEnterpriseAccount extends js.Object {
  /**
    * The email address of the service account.
    */
  var accountEmail: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterpriseAccount&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEnterpriseAccount {
  @scala.inline
  def apply(): SchemaEnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterpriseAccount]
  }
  @scala.inline
  implicit class SchemaEnterpriseAccountOps[Self <: SchemaEnterpriseAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEmail")(js.undefined)
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

