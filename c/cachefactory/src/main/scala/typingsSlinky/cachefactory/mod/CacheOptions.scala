package typingsSlinky.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOptions extends js.Object {
  var cacheFlushInterval: js.UndefOr[Double] = js.native
  var capacity: js.UndefOr[Double] = js.native
  var deleteOnExpire: js.UndefOr[DeleteOnExpire] = js.native
  var enable: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var onExpire: js.UndefOr[OnExpireCallback] = js.native
  var recycleFreq: js.UndefOr[Double] = js.native
  var storageImpl: js.UndefOr[StorageImpl] = js.native
  var storageMode: js.UndefOr[StorageMode] = js.native
  var storagePrefix: js.UndefOr[String] = js.native
  var storeOnReject: js.UndefOr[Boolean] = js.native
  var storeOnResolve: js.UndefOr[Boolean] = js.native
}

object CacheOptions {
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheFlushInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFlushInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheFlushInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFlushInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteOnExpire(value: DeleteOnExpire): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnExpire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOnExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnExpire")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpire(value: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpire")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpire")(js.undefined)
        ret
    }
    @scala.inline
    def withRecycleFreq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycleFreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecycleFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycleFreq")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageImpl(value: StorageImpl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageImpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageImpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageImpl")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageMode(value: StorageMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStoragePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoragePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreOnReject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOnReject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreOnReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOnReject")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreOnResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOnResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreOnResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOnResolve")(js.undefined)
        ret
    }
  }
  
}

