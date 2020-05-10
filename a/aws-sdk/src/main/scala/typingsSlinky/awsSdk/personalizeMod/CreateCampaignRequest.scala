package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCampaignRequest extends js.Object {
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: TransactionsPerSecond = js.native
  /**
    * A name for the new campaign. The campaign name must be unique within your account.
    */
  var name: Name = js.native
  /**
    * The Amazon Resource Name (ARN) of the solution version to deploy.
    */
  var solutionVersionArn: Arn = js.native
}

object CreateCampaignRequest {
  @scala.inline
  def apply(minProvisionedTPS: TransactionsPerSecond, name: Name, solutionVersionArn: Arn): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(minProvisionedTPS = minProvisionedTPS.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignRequest]
  }
  @scala.inline
  implicit class CreateCampaignRequestOps[Self <: CreateCampaignRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinProvisionedTPS(value: TransactionsPerSecond): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProvisionedTPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolutionVersionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

