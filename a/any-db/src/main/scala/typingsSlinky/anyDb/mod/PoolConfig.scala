package typingsSlinky.anyDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolConfig extends js.Object {
  /**
    * (default 30000) The maximum amount of time a connection can sit idle in the pool before being reaped
    */
  var idleTimeout: js.UndefOr[Double] = js.native
  /**
    * max (default 10) The maximum number of connections to keep open in the pool.
    * When this limit is reached further requests for connections will queue waiting
    * for an existing connection to be released back into the pool.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * min (default 0) The minimum number of connections to keep open in the pool.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Called immediately after a connection is first established. Use this to do one-time setup of new connections.
    * The supplied Connection will not be added to the pool until you pass it to the done continuation.
    */
  var onConnect: js.UndefOr[
    js.Function2[
      /* connection */ Connection, 
      /* ready */ js.Function2[/* error */ js.Error, /* result */ Connection, Unit], 
      Unit
    ]
  ] = js.native
  /**
    *  (default 1000) How frequently the pool should check for connections that are old enough to be reaped.
    */
  var reapInterval: js.UndefOr[Double] = js.native
  /**
    * (default true) When this is true, the pool will reap connections that
    * have been idle for more than idleTimeout milliseconds.
    */
  var refreshIdle: js.UndefOr[Boolean] = js.native
  /**
    * Called each time a connection is returned to the pool. Use this to restore a connection to
    * it's original state (e.g. rollback transactions, set the database session vars). If reset
    * fails to call the done continuation the connection will be lost in limbo.
    */
  var reset: js.UndefOr[
    js.Function2[
      /* connection */ Connection, 
      /* done */ js.Function1[/* error */ js.Error, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * (default function (err) { return true }) - Called when an error is encountered
    * by pool.query or emitted by an idle connection. If shouldDestroyConnection(error)
    * is truthy the connection will be destroyed, otherwise it will be reset.
    */
  var shouldDestroyConnection: js.UndefOr[js.Function1[/* error */ js.Error, Boolean]] = js.native
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
    @scala.inline
    def withOnConnect(
      value: (/* connection */ Connection, /* ready */ js.Function2[/* error */ js.Error, /* result */ Connection, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withReapInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReapInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reapInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: (/* connection */ Connection, /* done */ js.Function1[/* error */ js.Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldDestroyConnection(value: /* error */ js.Error => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDestroyConnection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldDestroyConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDestroyConnection")(js.undefined)
        ret
    }
  }
  
}

