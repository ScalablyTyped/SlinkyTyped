package typingsSlinky.extjs.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPollingProvider extends IJsonProvider {
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.native
  /** [Config Option] (String/Function) */
  var url: js.UndefOr[js.Any] = js.native
}

object IPollingProvider {
  @scala.inline
  def apply(): IPollingProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPollingProvider]
  }
  @scala.inline
  implicit class IPollingProviderOps[Self <: IPollingProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseParams")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

