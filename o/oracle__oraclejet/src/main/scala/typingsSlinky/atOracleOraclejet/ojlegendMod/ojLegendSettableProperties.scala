package typingsSlinky.atOracleOraclejet.ojlegendMod

import typingsSlinky.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asNeeded
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.center
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dim
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.end
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.middle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.start
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.top
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.ojkeysetMod.KeySet
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
  var translations_ojLegendSettableProperties: Anon_ComponentNameLabelAndValue
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
    translations: Anon_ComponentNameLabelAndValue,
    valign: middle | bottom | top,
    data: DataProvider[K, D] = null,
    expanded: KeySet[K] = null,
    textStyle: js.Object = null
  ): ojLegendSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendSettableProperties[K, D]]
  }
}

