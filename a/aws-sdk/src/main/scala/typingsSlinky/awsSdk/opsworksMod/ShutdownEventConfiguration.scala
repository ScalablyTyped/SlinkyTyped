package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShutdownEventConfiguration extends js.Object {
  /**
    * Whether to enable Elastic Load Balancing connection draining. For more information, see Connection Draining 
    */
  var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.native
  /**
    * The time, in seconds, that AWS OpsWorks Stacks will wait after triggering a Shutdown event before shutting down an instance.
    */
  var ExecutionTimeout: js.UndefOr[Integer] = js.native
}

object ShutdownEventConfiguration {
  @scala.inline
  def apply(): ShutdownEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShutdownEventConfiguration]
  }
  @scala.inline
  implicit class ShutdownEventConfigurationOps[Self <: ShutdownEventConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayUntilElbConnectionsDrained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelayUntilElbConnectionsDrained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayUntilElbConnectionsDrained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelayUntilElbConnectionsDrained")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionTimeout(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTimeout")(js.undefined)
        ret
    }
  }
  
}

