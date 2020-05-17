package typingsSlinky.qiniuJs.anon

import typingsSlinky.qiniuJs.mod.Region_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.Config> */
@js.native
trait PartialConfig extends js.Object {
  var checkByMD5: js.UndefOr[Boolean] = js.native
  var concurrentRequestLimit: js.UndefOr[Double] = js.native
  var disableStatisticsReport: js.UndefOr[Boolean] = js.native
  var forceDirect: js.UndefOr[Boolean] = js.native
  var region: js.UndefOr[Region_ | String] = js.native
  var retryCount: js.UndefOr[Double] = js.native
  var uphost: js.UndefOr[String] = js.native
  var useCdnDomain: js.UndefOr[Boolean] = js.native
}

object PartialConfig {
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckByMD5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkByMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckByMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkByMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrentRequestLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentRequestLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrentRequestLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentRequestLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStatisticsReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStatisticsReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStatisticsReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStatisticsReport")(js.undefined)
        ret
    }
    @scala.inline
    def withForceDirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDirect")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region_ | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
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
    def withUphost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uphost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUphost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uphost")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCdnDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCdnDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCdnDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCdnDomain")(js.undefined)
        ret
    }
  }
  
}

