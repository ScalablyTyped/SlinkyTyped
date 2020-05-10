package typingsSlinky.pulumiAws.outputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetRuntimeConfiguration extends js.Object {
  /**
    * Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
    */
  var gameSessionActivationTimeoutSeconds: js.UndefOr[Double] = js.native
  /**
    * Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
    */
  var maxConcurrentGameSessionActivations: js.UndefOr[Double] = js.native
  /**
    * Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
    */
  var serverProcesses: js.UndefOr[js.Array[FleetRuntimeConfigurationServerProcess]] = js.native
}

object FleetRuntimeConfiguration {
  @scala.inline
  def apply(): FleetRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetRuntimeConfiguration]
  }
  @scala.inline
  implicit class FleetRuntimeConfigurationOps[Self <: FleetRuntimeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGameSessionActivationTimeoutSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameSessionActivationTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionActivationTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameSessionActivationTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentGameSessionActivations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentGameSessionActivations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentGameSessionActivations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentGameSessionActivations")(js.undefined)
        ret
    }
    @scala.inline
    def withServerProcesses(value: js.Array[FleetRuntimeConfigurationServerProcess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverProcesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverProcesses")(js.undefined)
        ret
    }
  }
  
}

