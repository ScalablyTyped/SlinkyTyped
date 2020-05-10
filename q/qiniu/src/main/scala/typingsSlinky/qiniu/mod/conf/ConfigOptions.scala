package typingsSlinky.qiniu.mod.conf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * @default true
    */
  var useCdnDomain: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var useHttpsDomain: js.UndefOr[Boolean] = js.native
  /**
    * @default null
    */
  var zone: js.UndefOr[Zone] = js.native
  /**
    * @default -1
    */
  var zoneExpire: js.UndefOr[Double] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withUseHttpsDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHttpsDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHttpsDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHttpsDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: Zone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneExpire(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneExpire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneExpire")(js.undefined)
        ret
    }
  }
  
}

