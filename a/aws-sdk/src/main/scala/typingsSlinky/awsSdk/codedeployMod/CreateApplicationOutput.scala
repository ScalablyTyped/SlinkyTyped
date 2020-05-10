package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationOutput extends js.Object {
  /**
    * A unique application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.native
}

object CreateApplicationOutput {
  @scala.inline
  def apply(): CreateApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationOutput]
  }
  @scala.inline
  implicit class CreateApplicationOutputOps[Self <: CreateApplicationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: ApplicationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
  }
  
}

