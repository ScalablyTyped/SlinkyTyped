package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridProjectResult extends js.Object {
  /**
    * ARN of the Selenium testing project that was created.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.native
}

object CreateTestGridProjectResult {
  @scala.inline
  def apply(): CreateTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTestGridProjectResult]
  }
  @scala.inline
  implicit class CreateTestGridProjectResultOps[Self <: CreateTestGridProjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestGridProject(value: TestGridProject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testGridProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestGridProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testGridProject")(js.undefined)
        ret
    }
  }
  
}

