package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeConfiguration extends js.Object {
  /**
    * The maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
    */
  var GameSessionActivationTimeoutSeconds: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionActivationTimeoutSeconds] = js.native
  /**
    * The maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting limits the amount of instance resources that can be used for new game activations at any one time.
    */
  var MaxConcurrentGameSessionActivations: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.MaxConcurrentGameSessionActivations] = js.native
  /**
    * A collection of server process configurations that describe which server processes to run on each instance in a fleet.
    */
  var ServerProcesses: js.UndefOr[ServerProcessList] = js.native
}

object RuntimeConfiguration {
  @scala.inline
  def apply(): RuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeConfiguration]
  }
  @scala.inline
  implicit class RuntimeConfigurationOps[Self <: RuntimeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGameSessionActivationTimeoutSeconds(value: GameSessionActivationTimeoutSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionActivationTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionActivationTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionActivationTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentGameSessionActivations(value: MaxConcurrentGameSessionActivations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentGameSessionActivations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentGameSessionActivations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentGameSessionActivations")(js.undefined)
        ret
    }
    @scala.inline
    def withServerProcesses(value: ServerProcessList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerProcesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerProcesses")(js.undefined)
        ret
    }
  }
  
}

