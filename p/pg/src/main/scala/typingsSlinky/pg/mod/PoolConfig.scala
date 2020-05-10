package typingsSlinky.pg.mod

import typingsSlinky.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolConfig extends ClientConfig {
  var Promise: js.UndefOr[PromiseConstructorLike] = js.native
  var application_name: js.UndefOr[String] = js.native
  var connectionTimeoutMillis: js.UndefOr[Double] = js.native
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  // properties from module 'node-pool'
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
}

object PoolConfig {
  @scala.inline
  def apply(): PoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolConfig]
  }
  @scala.inline
  implicit class PoolConfigOps[Self <: PoolConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: PromiseConstructorLike): Self = {
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
    def withApplication_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_name")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeoutMillis")(js.undefined)
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
    def withLog(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
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
  }
  
}

