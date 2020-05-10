package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRecommenderConfigurationRequest extends js.Object {
  var CreateRecommenderConfiguration: typingsSlinky.awsSdk.pinpointMod.CreateRecommenderConfiguration = js.native
}

object CreateRecommenderConfigurationRequest {
  @scala.inline
  def apply(CreateRecommenderConfiguration: CreateRecommenderConfiguration): CreateRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(CreateRecommenderConfiguration = CreateRecommenderConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderConfigurationRequest]
  }
  @scala.inline
  implicit class CreateRecommenderConfigurationRequestOps[Self <: CreateRecommenderConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateRecommenderConfiguration(value: CreateRecommenderConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateRecommenderConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

