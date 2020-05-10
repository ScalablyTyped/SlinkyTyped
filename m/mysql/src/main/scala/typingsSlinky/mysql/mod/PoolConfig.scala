package typingsSlinky.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolConfig extends ConnectionConfig {
  /**
    * The milliseconds before a timeout occurs during the connection acquisition. This is slightly different from connectTimeout,
    * because acquiring a pool connection does not always involve making a connection. (Default: 10 seconds)
    */
  var acquireTimeout: js.UndefOr[Double] = js.native
  /**
    * The maximum number of connections to create at once. (Default: 10)
    */
  var connectionLimit: js.UndefOr[Double] = js.native
  /**
    * The maximum number of connection requests the pool will queue before returning an error from getConnection. If set to 0, there
    * is no limit to the number of queued connection requests. (Default: 0)
    */
  var queueLimit: js.UndefOr[Double] = js.native
  /**
    * Determines the pool's action when no connections are available and the limit has been reached. If true, the pool will queue
    * the connection request and call it when one becomes available. If false, the pool will immediately call back with an error.
    * (Default: true)
    */
  var waitForConnections: js.UndefOr[Boolean] = js.native
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
    def withAcquireTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquireTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForConnections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForConnections")(js.undefined)
        ret
    }
  }
  
}

