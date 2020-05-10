package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartLifecyclePolicyPreviewResponse extends js.Object {
  /**
    * The JSON repository policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.native
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  /**
    * The status of the lifecycle policy preview request.
    */
  var status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.native
}

object StartLifecyclePolicyPreviewResponse {
  @scala.inline
  def apply(): StartLifecyclePolicyPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLifecyclePolicyPreviewResponse]
  }
  @scala.inline
  implicit class StartLifecyclePolicyPreviewResponseOps[Self <: StartLifecyclePolicyPreviewResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLifecyclePolicyText(value: LifecyclePolicyText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecyclePolicyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecyclePolicyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecyclePolicyText")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryId(value: RegistryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: LifecyclePolicyPreviewStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

