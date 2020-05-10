package typingsSlinky.asyncLock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncLockOptions extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.native
  var domainReentrant: js.UndefOr[Boolean] = js.native
  var maxPending: js.UndefOr[Double] = js.native
  var skipQueue: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object AsyncLockOptions {
  @scala.inline
  def apply(): AsyncLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncLockOptions]
  }
  @scala.inline
  implicit class AsyncLockOptionsOps[Self <: AsyncLockOptions] (val x: Self) extends AnyVal {
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
    def withDomainReentrant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainReentrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainReentrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainReentrant")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPending")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

