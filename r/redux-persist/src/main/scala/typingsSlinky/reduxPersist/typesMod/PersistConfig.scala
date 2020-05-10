package typingsSlinky.reduxPersist.typesMod

import typingsSlinky.reduxPersist.reduxPersistBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @desc
  * `HSS` means HydratedSubState
  * `ESS` means EndSubState
  * `S` means State
  * `RS` means RawState
  */
@js.native
trait PersistConfig[S, RS, HSS, ESS] extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * @desc Used for migrations.
    */
  var getStoredState: js.UndefOr[
    js.Function1[/* config */ PersistConfig[S, RS, HSS, ESS], js.Promise[PersistedState]]
  ] = js.native
  var key: String = js.native
  /**
    * @deprecated keyPrefix is going to be removed in v6.
    */
  var keyPrefix: js.UndefOr[String] = js.native
  var migrate: js.UndefOr[PersistMigrate] = js.native
  var serialize: js.UndefOr[Boolean] = js.native
  var stateReconciler: js.UndefOr[`false` | StateReconciler[S]] = js.native
  var storage: Storage = js.native
  var throttle: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var transforms: js.UndefOr[js.Array[Transform[HSS, ESS, S, RS]]] = js.native
  var version: js.UndefOr[Double] = js.native
  var whitelist: js.UndefOr[js.Array[String]] = js.native
  var writeFailHandler: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
}

object PersistConfig {
  @scala.inline
  def apply[S, RS, HSS, ESS](key: String, storage: Storage): PersistConfig[S, RS, HSS, ESS] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistConfig[S, RS, HSS, ESS]]
  }
  @scala.inline
  implicit class PersistConfigOps[Self[s, rs, hss, ess] <: PersistConfig[s, rs, hss, ess], S, RS, HSS, ESS] (val x: Self[S, RS, HSS, ESS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, RS, HSS, ESS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, RS, HSS, ESS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, RS, HSS, ESS]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, RS, HSS, ESS]) with Other]
    @scala.inline
    def withKey(value: String): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage(value: Storage): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklist(value: js.Array[String]): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStoredState(value: /* config */ PersistConfig[S, RS, HSS, ESS] => js.Promise[PersistedState]): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoredState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetStoredState: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoredState")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPrefix(value: String): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPrefix: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrate(value: (/* state */ PersistedState, /* currentVersion */ Double) => js.Promise[PersistedState]): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMigrate: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: Boolean): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialize: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReconcilerFunction4(
      value: (/* inboundState */ js.Any, S, S, /* config */ PersistConfig[S, js.Any, js.Any, js.Any]) => S
    ): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReconciler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withStateReconciler(value: `false` | StateReconciler[S]): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReconciler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReconciler: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReconciler")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[Transform[HSS, ESS, S, RS]]): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransforms: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: js.Array[String]): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteFailHandler(value: /* err */ js.Error => Unit): Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFailHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWriteFailHandler: Self[S, RS, HSS, ESS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFailHandler")(js.undefined)
        ret
    }
  }
  
}

