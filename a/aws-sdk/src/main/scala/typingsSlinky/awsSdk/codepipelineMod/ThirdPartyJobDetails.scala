package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyJobDetails extends js.Object {
  /**
    * The data to be returned by the third party job worker.
    */
  var data: js.UndefOr[ThirdPartyJobData] = js.native
  /**
    * The identifier used to identify the job details in AWS CodePipeline.
    */
  var id: js.UndefOr[ThirdPartyJobId] = js.native
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Use this number in an AcknowledgeThirdPartyJob request.
    */
  var nonce: js.UndefOr[Nonce] = js.native
}

object ThirdPartyJobDetails {
  @scala.inline
  def apply(): ThirdPartyJobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyJobDetails]
  }
  @scala.inline
  implicit class ThirdPartyJobDetailsOps[Self <: ThirdPartyJobDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ThirdPartyJobData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ThirdPartyJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: Nonce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
  }
  
}

