package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gRPC call credentials to access the SDS server.
  */
@js.native
trait SchemaCallCredentials extends js.Object {
  /**
    * The access token that is used as call credential for the SDS server. This
    * field is used only if callCredentialType is ACCESS_TOKEN.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * The type of call credentials to use for GRPC requests to the SDS server.
    * This field can be set to one of the following: ACCESS_TOKEN: An access
    * token is used as call credentials for the SDS server. GCE_VM: The local
    * GCE VM service account credentials are used to access the SDS server.
    * JWT_SERVICE_TOKEN: The user provisioned service account credentials are
    * used to access the SDS server. FROM_PLUGIN: Custom authenticator
    * credentials are used to access the SDS server.
    */
  var callCredentialType: js.UndefOr[String] = js.native
  /**
    * Custom authenticator credentials.
    */
  var fromPlugin: js.UndefOr[SchemaMetadataCredentialsFromPlugin] = js.native
  /**
    * This service account credentials are used as call credentials for the SDS
    * server. This field is used only if callCredentialType is
    * JWT_SERVICE_ACCOUNT.
    */
  var jwtServiceAccount: js.UndefOr[SchemaServiceAccountJwtAccessCredentials] = js.native
}

object SchemaCallCredentials {
  @scala.inline
  def apply(): SchemaCallCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallCredentials]
  }
  @scala.inline
  implicit class SchemaCallCredentialsOps[Self <: SchemaCallCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCallCredentialType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callCredentialType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallCredentialType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callCredentialType")(js.undefined)
        ret
    }
    @scala.inline
    def withFromPlugin(value: SchemaMetadataCredentialsFromPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPlugin")(js.undefined)
        ret
    }
    @scala.inline
    def withJwtServiceAccount(value: SchemaServiceAccountJwtAccessCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwtServiceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwtServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwtServiceAccount")(js.undefined)
        ret
    }
  }
  
}

