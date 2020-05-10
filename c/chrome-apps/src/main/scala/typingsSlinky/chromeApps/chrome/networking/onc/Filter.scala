package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes which networks to return. */
@js.native
trait Filter extends js.Object {
  /**
    * If true, only include configured (saved) networks.
    * @default false
    */
  var configured: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of networks to return.
    * Use 0 for no limit
    * @default 1000 if unspecified.
    * */
  var limit: js.UndefOr[integer] = js.native
  /** The type of networks to return. */
  var networkType: NetworkType = js.native
  /**
    * If true, only include visible (physically connected or in-range) networks.
    * @default false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Filter {
  @scala.inline
  def apply(networkType: NetworkType): Filter = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkType(value: NetworkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configured")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

