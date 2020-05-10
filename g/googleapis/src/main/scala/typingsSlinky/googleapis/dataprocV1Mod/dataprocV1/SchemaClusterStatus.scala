package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a cluster and its instances.
  */
@js.native
trait SchemaClusterStatus extends js.Object {
  /**
    * Output only. Optional details of cluster&#39;s state.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * Output only. The cluster&#39;s state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Time when this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.native
  /**
    * Output only. Additional state information that includes status reported
    * by the agent.
    */
  var substate: js.UndefOr[String] = js.native
}

object SchemaClusterStatus {
  @scala.inline
  def apply(): SchemaClusterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterStatus]
  }
  @scala.inline
  implicit class SchemaClusterStatusOps[Self <: SchemaClusterStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substate")(js.undefined)
        ret
    }
  }
  
}

