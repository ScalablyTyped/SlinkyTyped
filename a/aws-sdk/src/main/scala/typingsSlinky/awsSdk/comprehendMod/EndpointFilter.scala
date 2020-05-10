package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointFilter extends js.Object {
  /**
    * Specifies a date after which the returned endpoint or endpoints were created.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * Specifies a date before which the returned endpoint or endpoints were created.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.native
  /**
    * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting, Failed.
    */
  var Status: js.UndefOr[EndpointStatus] = js.native
}

object EndpointFilter {
  @scala.inline
  def apply(): EndpointFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointFilter]
  }
  @scala.inline
  implicit class EndpointFilterOps[Self <: EndpointFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withModelArn(value: ComprehendModelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EndpointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

