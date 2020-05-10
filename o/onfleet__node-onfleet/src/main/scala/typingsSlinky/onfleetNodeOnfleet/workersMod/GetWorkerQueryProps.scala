package typingsSlinky.onfleetNodeOnfleet.workersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @prop filter - Optional. A comma-separated list of fields to return, if all are not desired. For example, name, location
  * @prop phones - Optional. A comma-separated list of workers' phone numbers.
  * @prop states - Optional. A comma-separated list of worker states, where 0 is off-duty,
  * 1 is idle (on-duty, no active task) and 2 is active (on-duty, active task).
  * @prop teams - Optional. A comma-separated list of the team IDs that workers must be part of.
  */
@js.native
trait GetWorkerQueryProps extends js.Object {
  var filter: js.UndefOr[String] = js.native
  var phones: js.UndefOr[String] = js.native
  var states: js.UndefOr[String] = js.native
  var teams: js.UndefOr[String] = js.native
}

object GetWorkerQueryProps {
  @scala.inline
  def apply(): GetWorkerQueryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkerQueryProps]
  }
  @scala.inline
  implicit class GetWorkerQueryPropsOps[Self <: GetWorkerQueryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPhones(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
    @scala.inline
    def withTeams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(js.undefined)
        ret
    }
  }
  
}

