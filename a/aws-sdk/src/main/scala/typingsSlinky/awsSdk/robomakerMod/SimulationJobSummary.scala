package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationJobSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The names of the data sources.
    */
  var dataSourceNames: js.UndefOr[DataSourceNames] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the simulation job.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * A list of simulation job robot application names.
    */
  var robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.native
  /**
    * A list of simulation job simulation application names.
    */
  var simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.native
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.native
}

object SimulationJobSummary {
  @scala.inline
  def apply(): SimulationJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationJobSummary]
  }
  @scala.inline
  implicit class SimulationJobSummaryOps[Self <: SimulationJobSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceNames(value: DataSourceNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceNames")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRobotApplicationNames(value: RobotApplicationNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotApplicationNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobotApplicationNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotApplicationNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulationApplicationNames(value: SimulationApplicationNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationApplicationNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulationApplicationNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationApplicationNames")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SimulationJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

