package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Booleans.`true`
import typingsSlinky.antvG2.antvG2Strings.default
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  var containerTpl: js.UndefOr[String] = js.native
  var enterable: js.UndefOr[Boolean] = js.native
  var `g2-tooltip`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-list`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-list-item`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-marker`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-title`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-value`: js.UndefOr[Record[String, _]] = js.native
  var htmlContent: js.UndefOr[js.Function2[/* title */ String, /* items */ js.Array[TooltipItem], String]] = js.native
  var itemTpl: js.UndefOr[String] = js.native
  @JSName("type")
  var type_HtmlTooltipConfig: js.UndefOr[default] = js.native
  @JSName("useHtml")
  var useHtml_HtmlTooltipConfig: js.UndefOr[`true`] = js.native
}

object HtmlTooltipConfig {
  @scala.inline
  def apply(): HtmlTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlTooltipConfig]
  }
  @scala.inline
  implicit class HtmlTooltipConfigOps[Self <: HtmlTooltipConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterable")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip`(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-list`(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-list`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-list")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-list-item`(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-list-item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-list-item`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-list-item")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-marker`(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-title`(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-title`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-title")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-value`(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-value`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-value")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlContent(value: (/* title */ String, /* items */ js.Array[TooltipItem]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHtmlContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlContent")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHtml(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtml")(js.undefined)
        ret
    }
  }
  
}

