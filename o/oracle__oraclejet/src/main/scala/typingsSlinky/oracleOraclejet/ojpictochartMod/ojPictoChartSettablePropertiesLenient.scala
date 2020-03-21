package typingsSlinky.oracleOraclejet.ojpictochartMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.Anon14
import typingsSlinky.oracleOraclejet.AnonLabelAndValue
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.alphaFade
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottomEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottomStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.popIn
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.topEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.topStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojpictochart.ojPictoChartSettableProperties<K, D>> */
trait ojPictoChartSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | popIn | alphaFade | zoom | none] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var columnCount: js.UndefOr[Double] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var drilling: js.UndefOr[on | off] = js.undefined
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
  var layoutOrigin: js.UndefOr[topEnd | bottomStart | bottomEnd | topStart] = js.undefined
  var rowCount: js.UndefOr[Double] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var selection: js.UndefOr[js.Array[K]] = js.undefined
  var selectionMode: js.UndefOr[single | multiple | none] = js.undefined
  var tooltip: js.UndefOr[Anon14[K]] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
}

object ojPictoChartSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animationDuration: Int | Double = null,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | popIn | alphaFade | zoom | none = null,
    as: String = null,
    columnCount: Int | Double = null,
    columnWidth: Int | Double = null,
    data: DataProvider[K, D] = null,
    drilling: on | off = null,
    hiddenCategories: js.Array[String] = null,
    highlightMatch: any | all = null,
    highlightedCategories: js.Array[String] = null,
    hoverBehavior: dim | none = null,
    hoverBehaviorDelay: Int | Double = null,
    layout: vertical | horizontal = null,
    layoutOrigin: topEnd | bottomStart | bottomEnd | topStart = null,
    rowCount: Int | Double = null,
    rowHeight: Int | Double = null,
    selection: js.Array[K] = null,
    selectionMode: single | multiple | none = null,
    tooltip: Anon14[K] = null,
    trackResize: on | off = null,
    translations: AnonLabelAndValue = null
  ): ojPictoChartSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (hiddenCategories != null) __obj.updateDynamic("hiddenCategories")(hiddenCategories.asInstanceOf[js.Any])
    if (highlightMatch != null) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (highlightedCategories != null) __obj.updateDynamic("highlightedCategories")(highlightedCategories.asInstanceOf[js.Any])
    if (hoverBehavior != null) __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    if (hoverBehaviorDelay != null) __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutOrigin != null) __obj.updateDynamic("layoutOrigin")(layoutOrigin.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPictoChartSettablePropertiesLenient[K, D]]
  }
}

