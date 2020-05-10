package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The credential used by Deployment Manager and TypeProvider. Only one of the
  * options is permitted.
  */
@js.native
trait SchemaCredential extends js.Object {
  /**
    * Basic Auth Credential, only used by TypeProvider.
    */
  var basicAuth: js.UndefOr[SchemaBasicAuth] = js.native
  /**
    * Service Account Credential, only used by Deployment.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
  /**
    * Specify to use the project default credential, only supported by
    * Deployment.
    */
  var useProjectDefault: js.UndefOr[Boolean] = js.native
}

object SchemaCredential {
  @scala.inline
  def apply(): SchemaCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCredential]
  }
  @scala.inline
  implicit class SchemaCredentialOps[Self <: SchemaCredential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasicAuth(value: SchemaBasicAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccount(value: SchemaServiceAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withUseProjectDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProjectDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseProjectDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProjectDefault")(js.undefined)
        ret
    }
  }
  
}

