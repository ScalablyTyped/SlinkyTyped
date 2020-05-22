package typingsSlinky.oracleOraclejet.ojlegendMod

import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

trait ojLegendSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var as: String
  var data: (DataProvider[K, D]) | Null
  var drilling: on | off
  var expanded: KeySet[K] | Null
  var halign: center | end | start
  var hiddenCategories: js.Array[String]
  var hideAndShowBehavior: on | off
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverBehaviorDelay: Double
  var orientation: horizontal | vertical
  var scrolling: off | asNeeded
  var symbolHeight: Double
  var symbolWidth: Double
  var textStyle: js.UndefOr[js.Object] = js.undefined
  @JSName("translations")
  var translations_ojLegendSettableProperties: LabelAndValue
  var valign: middle | bottom | top
}

object ojLegendSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    drilling: on | off,
    halign: center | end | start,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: on | off,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    hoverBehaviorDelay: Double,
    orientation: horizontal | vertical,
    scrolling: off | asNeeded,
    symbolHeight: Double,
    symbolWidth: Double,
    trackResize: on | off,
    translations: LabelAndValue,
    valign: middle | bottom | top,
    data: DataProvider[K, D] = null,
    expanded: KeySet[K] = null,
    textStyle: js.Object = null
  ): ojLegendSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendSettableProperties[K, D]]
  }
}

