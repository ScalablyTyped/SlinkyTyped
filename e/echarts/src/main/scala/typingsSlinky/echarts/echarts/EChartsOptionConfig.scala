package typingsSlinky.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsOptionConfig extends js.Object {
  var lazyUpdate: js.UndefOr[Boolean] = js.native
  var notMerge: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
}

object EChartsOptionConfig {
  @scala.inline
  def apply(): EChartsOptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsOptionConfig]
  }
  @scala.inline
  implicit class EChartsOptionConfigOps[Self <: EChartsOptionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLazyUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withNotMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
  }
  
}

