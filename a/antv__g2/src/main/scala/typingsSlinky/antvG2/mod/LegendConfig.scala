package typingsSlinky.antvG2.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.antvG2.anon.Fill
import typingsSlinky.antvG2.anon.Marker
import typingsSlinky.antvG2.antvG2Strings.`bottom-center`
import typingsSlinky.antvG2.antvG2Strings.`bottom-left`
import typingsSlinky.antvG2.antvG2Strings.`bottom-right`
import typingsSlinky.antvG2.antvG2Strings.`left-bottom`
import typingsSlinky.antvG2.antvG2Strings.`left-center`
import typingsSlinky.antvG2.antvG2Strings.`left-top`
import typingsSlinky.antvG2.antvG2Strings.`right-bottom`
import typingsSlinky.antvG2.antvG2Strings.`right-center`
import typingsSlinky.antvG2.antvG2Strings.`right-top`
import typingsSlinky.antvG2.antvG2Strings.`top-bottom`
import typingsSlinky.antvG2.antvG2Strings.`top-center`
import typingsSlinky.antvG2.antvG2Strings.`top-left`
import typingsSlinky.antvG2.antvG2Strings.bottom
import typingsSlinky.antvG2.antvG2Strings.horizontal
import typingsSlinky.antvG2.antvG2Strings.left
import typingsSlinky.antvG2.antvG2Strings.multiple
import typingsSlinky.antvG2.antvG2Strings.right
import typingsSlinky.antvG2.antvG2Strings.single
import typingsSlinky.antvG2.antvG2Strings.top
import typingsSlinky.antvG2.antvG2Strings.vertica
import typingsSlinky.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendConfig extends js.Object {
  var allowAllCanceled: js.UndefOr[Double] = js.native
  var background: js.UndefOr[Fill] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
  var containerTpl: js.UndefOr[String] = js.native
  var custom: js.UndefOr[Double] = js.native
  var defaultClickHandlerEnabled: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var itemFormatter: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  var itemGap: js.UndefOr[Double] = js.native
  var itemMarginBottom: js.UndefOr[Double] = js.native
  var itemTpl: js.UndefOr[String] = js.native
  var itemWidth: js.UndefOr[Double] = js.native
  var items: js.UndefOr[js.Array[Marker]] = js.native
  var layout: js.UndefOr[vertica | horizontal] = js.native
  var marker: js.UndefOr[String | js.Function] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onHover: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var position: js.UndefOr[
    top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-bottom` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.native
  var selectedMode: js.UndefOr[single | multiple] = js.native
  var slidable: js.UndefOr[Boolean] = js.native
  var textStyle: js.UndefOr[text] = js.native
  var title: js.UndefOr[text] = js.native
  var unCheckColor: js.UndefOr[String] = js.native
  var useHtml: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object LegendConfig {
  @scala.inline
  def apply(): LegendConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendConfig]
  }
  @scala.inline
  implicit class LegendConfigOps[Self <: LegendConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAllCanceled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAllCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAllCanceled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAllCanceled")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: Fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
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
    def withCustom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultClickHandlerEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickHandlerEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClickHandlerEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickHandlerEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(js.undefined)
        ret
    }
    @scala.inline
    def withItemFormatter(value: /* value */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withItemGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGap")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMarginBottom")(js.undefined)
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
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Marker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: vertica | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHover(value: /* e */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(
      value: top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-bottom` | `bottom-left` | `bottom-center` | `bottom-right`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedMode(value: single | multiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidable")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUnCheckColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unCheckColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnCheckColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unCheckColor")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHtml(value: Boolean): Self = {
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

