package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleEventConfiguration extends js.Object {
  /**
    * A ShutdownEventConfiguration object that specifies the Shutdown event configuration.
    */
  var Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.native
}

object LifecycleEventConfiguration {
  @scala.inline
  def apply(): LifecycleEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleEventConfiguration]
  }
  @scala.inline
  implicit class LifecycleEventConfigurationOps[Self <: LifecycleEventConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShutdown(value: ShutdownEventConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shutdown")(js.undefined)
        ret
    }
  }
  
}

