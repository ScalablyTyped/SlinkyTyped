package typingsSlinky.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolOptions extends js.Object {
  var autoCleanIdle: js.UndefOr[Boolean] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var idleTimeout: js.UndefOr[Double] = js.native
  var maxPoolSize: js.UndefOr[Double] = js.native
  var systemNaming: js.UndefOr[js.Any] = js.native
}

object PoolOptions {
  @scala.inline
  def apply(): PoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOptions]
  }
  @scala.inline
  implicit class PoolOptionsOps[Self <: PoolOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCleanIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCleanIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCleanIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCleanIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPoolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemNaming(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemNaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemNaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemNaming")(js.undefined)
        ret
    }
  }
  
}

