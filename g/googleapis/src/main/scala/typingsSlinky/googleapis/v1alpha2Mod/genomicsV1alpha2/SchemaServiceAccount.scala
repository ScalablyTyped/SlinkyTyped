package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Cloud Service Account.
  */
@js.native
trait SchemaServiceAccount extends js.Object {
  /**
    * Email address of the service account. Defaults to `default`, which uses
    * the compute service account associated with the project.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * List of scopes to be enabled for this service account on the VM. The
    * following scopes are automatically included:  *
    * https://www.googleapis.com/auth/compute *
    * https://www.googleapis.com/auth/devstorage.full_control *
    * https://www.googleapis.com/auth/genomics *
    * https://www.googleapis.com/auth/logging.write *
    * https://www.googleapis.com/auth/monitoring.write
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaServiceAccount {
  @scala.inline
  def apply(): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccount]
  }
  @scala.inline
  implicit class SchemaServiceAccountOps[Self <: SchemaServiceAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

