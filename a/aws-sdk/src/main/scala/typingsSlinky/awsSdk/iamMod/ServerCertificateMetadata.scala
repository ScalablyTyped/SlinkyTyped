package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificateMetadata extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  /**
    * The date on which the certificate is set to expire.
    */
  var Expiration: js.UndefOr[js.Date] = js.native
  /**
    *  The path to the server certificate. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  /**
    *  The stable and unique string identifying the server certificate. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var ServerCertificateId: idType = js.native
  /**
    * The name that identifies the server certificate.
    */
  var ServerCertificateName: serverCertificateNameType = js.native
  /**
    * The date when the server certificate was uploaded.
    */
  var UploadDate: js.UndefOr[js.Date] = js.native
}

object ServerCertificateMetadata {
  @scala.inline
  def apply(
    Arn: arnType,
    Path: pathType,
    ServerCertificateId: idType,
    ServerCertificateName: serverCertificateNameType
  ): ServerCertificateMetadata = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ServerCertificateId = ServerCertificateId.asInstanceOf[js.Any], ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateMetadata]
  }
  @scala.inline
  implicit class ServerCertificateMetadataOps[Self <: ServerCertificateMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: pathType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCertificateId(value: idType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCertificateName(value: serverCertificateNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiration(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadDate")(js.undefined)
        ret
    }
  }
  
}

