package typingsSlinky.oracleOraclejet.ojlegendMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asNeeded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.middle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlegend.ojLegendSettableProperties<K, D>> */
@js.native
trait ojLegendSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var as: js.UndefOr[String] = js.native
  var data: js.UndefOr[DataProvider[K, D]] = js.native
  var drilling: js.UndefOr[on | off] = js.native
  var expanded: js.UndefOr[KeySet[K]] = js.native
  var halign: js.UndefOr[center | end | start] = js.native
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  var hideAndShowBehavior: js.UndefOr[on | off] = js.native
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  var hoverBehaviorDelay: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var scrolling: js.UndefOr[off | asNeeded] = js.native
  var symbolHeight: js.UndefOr[Double] = js.native
  var symbolWidth: js.UndefOr[Double] = js.native
  var textStyle: js.UndefOr[js.Object] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[LabelAndValue] = js.native
  var valign: js.UndefOr[middle | bottom | top] = js.native
}

object ojLegendSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojLegendSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLegendSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojLegendSettablePropertiesLenientOps[Self[k, d] <: ojLegendSettablePropertiesLenient[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAs(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilling(value: on | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilling: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilling")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: KeySet[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withHalign(value: center | end | start): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalign: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halign")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenCategories: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAndShowBehavior(value: on | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAndShowBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAndShowBehavior: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAndShowBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedCategories: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBehavior: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBehaviorDelay(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBehaviorDelay: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: off | asNeeded): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolling: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolHeight(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolHeight: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolWidth(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolWidth: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: js.Object): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: on | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: LabelAndValue): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withValign(value: middle | bottom | top): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValign: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valign")(js.undefined)
        ret
    }
  }
  
}

