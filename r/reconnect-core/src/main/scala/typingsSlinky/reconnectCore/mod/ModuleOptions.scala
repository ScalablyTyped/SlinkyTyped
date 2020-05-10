package typingsSlinky.reconnectCore.mod

import typingsSlinky.backoff.mod.Backoff
import typingsSlinky.backoff.mod.ExponentialOptions
import typingsSlinky.reconnectCore.reconnectCoreStrings.exponential
import typingsSlinky.reconnectCore.reconnectCoreStrings.fibonacci
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleOptions[ConnectionType] extends ExponentialOptions {
  var failAfter: js.UndefOr[Double] = js.native
  var immediate: js.UndefOr[Boolean] = js.native
  var onConnect: js.UndefOr[js.Function1[/* con */ ConnectionType, Unit]] = js.native
  var strategy: js.UndefOr[fibonacci | exponential | Backoff] = js.native
}

object ModuleOptions {
  @scala.inline
  def apply[ConnectionType](): ModuleOptions[ConnectionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions[ConnectionType]]
  }
  @scala.inline
  implicit class ModuleOptionsOps[Self[connectiontype] <: ModuleOptions[connectiontype], ConnectionType] (val x: Self[ConnectionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ConnectionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ConnectionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ConnectionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ConnectionType] with Other]
    @scala.inline
    def withFailAfter(value: Double): Self[ConnectionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailAfter: Self[ConnectionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediate(value: Boolean): Self[ConnectionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self[ConnectionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(value: /* con */ ConnectionType => Unit): Self[ConnectionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self[ConnectionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: fibonacci | exponential | Backoff): Self[ConnectionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self[ConnectionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
  }
  
}

