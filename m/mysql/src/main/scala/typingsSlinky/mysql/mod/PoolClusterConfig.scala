package typingsSlinky.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolClusterConfig extends js.Object {
  /**
    * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
    */
  var canRetry: js.UndefOr[Boolean] = js.native
  /**
    * The default selector. (Default: RR)
    * RR: Select one alternately. (Round-Robin)
    * RANDOM: Select the node by random function.
    * ORDER: Select the first node available unconditionally.
    */
  var defaultSelector: js.UndefOr[String] = js.native
  /**
    * If connection fails, node's errorCount increases. When errorCount is greater than removeNodeErrorCount,
    * remove a node in the PoolCluster. (Default: 5)
    */
  var removeNodeErrorCount: js.UndefOr[Double] = js.native
  /**
    * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
    * If set to 0, then node will be removed instead and never re-used. (Default: 0)
    */
  var restoreNodeTimeout: js.UndefOr[Double] = js.native
}

object PoolClusterConfig {
  @scala.inline
  def apply(): PoolClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolClusterConfig]
  }
  @scala.inline
  implicit class PoolClusterConfigOps[Self <: PoolClusterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanRetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveNodeErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNodeErrorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveNodeErrorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNodeErrorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreNodeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreNodeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreNodeTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreNodeTimeout")(js.undefined)
        ret
    }
  }
  
}

