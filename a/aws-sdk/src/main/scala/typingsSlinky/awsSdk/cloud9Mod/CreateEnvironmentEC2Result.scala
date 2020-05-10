package typingsSlinky.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEnvironmentEC2Result extends js.Object {
  /**
    * The ID of the environment that was created.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.native
}

object CreateEnvironmentEC2Result {
  @scala.inline
  def apply(): CreateEnvironmentEC2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentEC2Result]
  }
  @scala.inline
  implicit class CreateEnvironmentEC2ResultOps[Self <: CreateEnvironmentEC2Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentId(value: EnvironmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(js.undefined)
        ret
    }
  }
  
}

