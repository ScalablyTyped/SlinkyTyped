package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBasePathMappingRequest extends js.Object {
  /**
    * [Required] The base path name of the BasePathMapping resource to delete. To specify an empty base path, set this parameter to '(none)'.
    */
  var basePath: String = js.native
  /**
    * [Required] The domain name of the BasePathMapping resource to delete.
    */
  var domainName: String = js.native
}

object DeleteBasePathMappingRequest {
  @scala.inline
  def apply(basePath: String, domainName: String): DeleteBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBasePathMappingRequest]
  }
  @scala.inline
  implicit class DeleteBasePathMappingRequestOps[Self <: DeleteBasePathMappingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

