package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PauseStateScheduleActionSettings extends js.Object {
  var Pipelines: js.UndefOr[listOfPipelinePauseStateSettings] = js.native
}

object PauseStateScheduleActionSettings {
  @scala.inline
  def apply(): PauseStateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseStateScheduleActionSettings]
  }
  @scala.inline
  implicit class PauseStateScheduleActionSettingsOps[Self <: PauseStateScheduleActionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelines(value: listOfPipelinePauseStateSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pipelines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pipelines")(js.undefined)
        ret
    }
  }
  
}

