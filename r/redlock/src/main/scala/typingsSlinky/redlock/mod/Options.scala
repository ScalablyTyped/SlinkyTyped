package typingsSlinky.redlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The expected clock drift; for more details
    * see http://redis.io/topics/distlock
    *
    * Default is 0.01
    */
  var driftFactor: js.UndefOr[Double] = js.native
  /**
    * LUA script to run on the Redis server to extend a lock's ttl.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var extendScript: js.UndefOr[ExtendScriptFunction | String] = js.native
  /**
    * LUA script to run on the Redis server to lock a resource.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var lockScript: js.UndefOr[LockScriptFunction | String] = js.native
  /**
    * The max number of times Redlock will attempt
    * to lock a resource before erroring.
    *
    * Default is 10
    */
  var retryCount: js.UndefOr[Double] = js.native
  /**
    * The time in milliseconds between attempts.
    *
    * Default is 200
    */
  var retryDelay: js.UndefOr[Double] = js.native
  /**
    * The max time in ms randomly added to retries
    * to improve performance under high contention
    * see https://www.awsarchitectureblog.com/2015/03/backoff.html
    *
    * Default is 100
    */
  var retryJitter: js.UndefOr[Double] = js.native
  /**
    * LUA script to run on the Redis server to unlock a resource.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var unlockScript: js.UndefOr[UnlockScriptFunction | String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriftFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driftFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriftFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driftFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendScriptFunction1(value: /* origScript */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendScript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtendScript(value: ExtendScriptFunction | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendScript")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScriptFunction1(value: /* origScript */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLockScript(value: LockScriptFunction | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScript")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryJitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryJitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryJitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryJitter")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlockScriptFunction1(value: /* origScript */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockScript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlockScript(value: UnlockScriptFunction | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlockScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockScript")(js.undefined)
        ret
    }
  }
  
}

