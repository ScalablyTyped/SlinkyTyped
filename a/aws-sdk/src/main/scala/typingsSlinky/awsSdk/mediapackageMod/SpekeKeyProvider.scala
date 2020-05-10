package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpekeKeyProvider extends js.Object {
  /**
    * An Amazon Resource Name (ARN) of a Certificate Manager certificate
  that MediaPackage will use for enforcing secure end-to-end data
  transfer with the key provider service.
    */
  var CertificateArn: js.UndefOr[string] = js.native
  /**
    * The resource ID to include in key requests.
    */
  var ResourceId: string = js.native
  /**
    * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
  MediaPackage will assume when accessing the key provider service.
    */
  var RoleArn: string = js.native
  /**
    * The system IDs to include in key requests.
    */
  var SystemIds: listOfString = js.native
  /**
    * The URL of the external key provider service.
    */
  var Url: string = js.native
}

object SpekeKeyProvider {
  @scala.inline
  def apply(ResourceId: string, RoleArn: string, SystemIds: listOfString, Url: string): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SystemIds = SystemIds.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpekeKeyProvider]
  }
  @scala.inline
  implicit class SpekeKeyProviderOps[Self <: SpekeKeyProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemIds(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SystemIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
  }
  
}

