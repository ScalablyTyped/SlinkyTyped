package typingsSlinky.pollyjsCore.mod

import typingsSlinky.pollyjsCore.AnonBody
import typingsSlinky.pollyjsCore.AnonDictkey
import typingsSlinky.pollyjsCore.AnonFs
import typingsSlinky.pollyjsCore.TypeofPersister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollyConfig extends js.Object {
  var adapterOptions: js.UndefOr[AnonDictkey] = js.native
  var adapters: js.UndefOr[
    js.Array[
      String | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Adapter */ _)
    ]
  ] = js.native
  var expiresIn: js.UndefOr[String | Null] = js.native
  var expiryStrategy: js.UndefOr[EXPIRY_STRATEGY] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var matchRequestsBy: js.UndefOr[AnonBody] = js.native
  var mode: js.UndefOr[MODE] = js.native
  var persister: js.UndefOr[String | TypeofPersister] = js.native
  var persisterOptions: js.UndefOr[AnonFs] = js.native
  var recordFailedRequests: js.UndefOr[Boolean] = js.native
  var recordIfMissing: js.UndefOr[Boolean] = js.native
  var timing: js.UndefOr[
    (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]
  ] = js.native
}

object PollyConfig {
  @scala.inline
  def apply(): PollyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollyConfig]
  }
  @scala.inline
  implicit class PollyConfigOps[Self <: PollyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapterOptions(value: AnonDictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAdapters(
      value: js.Array[
          String | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Adapter */ _)
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapters")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresInNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(null)
        ret
    }
    @scala.inline
    def withExpiryStrategy(value: EXPIRY_STRATEGY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchRequestsBy(value: AnonBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchRequestsBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchRequestsBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchRequestsBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withPersister(value: String | TypeofPersister): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persister")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persister")(js.undefined)
        ret
    }
    @scala.inline
    def withPersisterOptions(value: AnonFs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersisterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordFailedRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFailedRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordFailedRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFailedRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordIfMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordIfMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordIfMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordIfMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingFunction1(value: /* ms */ Double => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimingFunction0(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTiming(value: (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
  }
  
}

