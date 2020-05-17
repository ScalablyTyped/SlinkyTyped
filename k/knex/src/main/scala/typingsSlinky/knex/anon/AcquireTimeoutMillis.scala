package typingsSlinky.knex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcquireTimeoutMillis extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.native
  var acquireTimeoutMillis: js.UndefOr[Double] = js.native
  var autostart: js.UndefOr[Boolean] = js.native
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.native
  var fifo: js.UndefOr[Boolean] = js.native
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var maxWaitingClients: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var numTestsPerRun: js.UndefOr[Double] = js.native
  var priorityRange: js.UndefOr[Double] = js.native
  var softIdleTimeoutMillis: js.UndefOr[Double] = js.native
  var testOnBorrow: js.UndefOr[Boolean] = js.native
}

object AcquireTimeoutMillis {
  @scala.inline
  def apply(): AcquireTimeoutMillis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquireTimeoutMillis]
  }
  @scala.inline
  implicit class AcquireTimeoutMillisOps[Self <: AcquireTimeoutMillis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(js.undefined)
        ret
    }
    @scala.inline
    def withAcquireTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquireTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withAutostart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutostart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(js.undefined)
        ret
    }
    @scala.inline
    def withEvictionRunIntervalMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evictionRunIntervalMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvictionRunIntervalMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evictionRunIntervalMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withFifo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fifo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFifo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fifo")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWaitingClients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWaitingClients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWaitingClients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWaitingClients")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTestsPerRun(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTestsPerRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTestsPerRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTestsPerRun")(js.undefined)
        ret
    }
    @scala.inline
    def withPriorityRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriorityRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftIdleTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softIdleTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftIdleTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softIdleTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withTestOnBorrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOnBorrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestOnBorrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOnBorrow")(js.undefined)
        ret
    }
  }
  
}

