package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpekeKeyProvider extends js.Object {
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
  def apply(RoleArn: string, SystemIds: listOfString, Url: string): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SystemIds = SystemIds.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpekeKeyProvider]
  }
  @scala.inline
  implicit class SpekeKeyProviderOps[Self <: SpekeKeyProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

