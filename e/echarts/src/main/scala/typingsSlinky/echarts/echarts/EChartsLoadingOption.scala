package typingsSlinky.echarts.echarts

import typingsSlinky.echarts.echartsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsLoadingOption extends js.Object {
  /**
    * Loading circle color.
    * @default '#c23531'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Mask background color.
    * @default 'rgba(255, 255, 255, 0.8)'
    */
  var maskColor: js.UndefOr[String] = js.native
  /**
    * Loading text.
    * @default 'loading'
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Loading text color.
    * @default '#000'
    */
  var textColor: js.UndefOr[String] = js.native
  /**
    * Zlevel of loading. If not 0, it creates a new canvas for loading.
    * @default 0
    */
  var zlevel: js.UndefOr[`0`] = js.native
}

object EChartsLoadingOption {
  @scala.inline
  def apply(): EChartsLoadingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsLoadingOption]
  }
  @scala.inline
  implicit class EChartsLoadingOptionOps[Self <: EChartsLoadingOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColor")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withZlevel(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(js.undefined)
        ret
    }
  }
  
}

