package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The description for the deployment resource.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * The name of the Stage resource for the Deployment resource to create.
    */
  var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.native
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(ApiId: string): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  @scala.inline
  implicit class CreateDeploymentRequestOps[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: StringWithLengthBetween0And1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: StringWithLengthBetween1And128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageName")(js.undefined)
        ret
    }
  }
  
}

