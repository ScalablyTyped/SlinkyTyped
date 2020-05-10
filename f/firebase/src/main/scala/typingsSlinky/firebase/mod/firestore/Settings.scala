package typingsSlinky.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * An approximate cache size threshold for the on-disk data. If the cache grows beyond this
    * size, Firestore will start removing data that hasn't been recently used. The size is not a
    * guarantee that the cache will stay below that size, only that if the cache exceeds the given
    * size, cleanup will be attempted.
    *
    * The default value is 40 MB. The threshold must be set to at least 1 MB, and can be set to
    * CACHE_SIZE_UNLIMITED to disable garbage collection.
    */
  var cacheSizeBytes: js.UndefOr[Double] = js.native
  /**
    * Forces the SDK’s underlying network transport (WebChannel) to use
    * long-polling. Each response from the backend will be closed immediately
    * after the backend sends data (by default responses are kept open in
    * case the backend has more data to send). This avoids incompatibility
    * issues with certain proxies, antivirus software, etc. that incorrectly
    * buffer traffic indefinitely. Use of this option will cause some
    * performance degradation though.
    *
    * This setting may be removed in a future release. If you find yourself
    * using it to work around a specific network reliability issue, please
    * tell us about it in
    * https://github.com/firebase/firebase-js-sdk/issues/1674.
    *
    * @webonly
    */
  var experimentalForceLongPolling: js.UndefOr[Boolean] = js.native
  /** The hostname to connect to. */
  var host: js.UndefOr[String] = js.native
  /** Whether to use SSL when connecting. */
  var ssl: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether to use `Timestamp` objects for timestamp fields in
    * `DocumentSnapshot`s. This is enabled by default and should not be
    * disabled.
    *
    * Previously, Firestore returned timestamp fields as `Date` but `Date`
    * only supports millisecond precision, which leads to truncation and
    * causes unexpected behavior when using a timestamp from a snapshot as a
    * part of a subsequent query.
    *
    * So now Firestore returns `Timestamp` values instead of `Date`, avoiding
    * this kind of problem.
    *
    * To opt into the old behavior of returning `Date` objects, you can
    * temporarily set `timestampsInSnapshots` to false.
    *
    * @deprecated This setting will be removed in a future release. You should
    * update your code to expect `Timestamp` objects and stop using the
    * `timestampsInSnapshots` setting.
    */
  var timestampsInSnapshots: js.UndefOr[Boolean] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheSizeBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalForceLongPolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalForceLongPolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalForceLongPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalForceLongPolling")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampsInSnapshots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampsInSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampsInSnapshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampsInSnapshots")(js.undefined)
        ret
    }
  }
  
}

