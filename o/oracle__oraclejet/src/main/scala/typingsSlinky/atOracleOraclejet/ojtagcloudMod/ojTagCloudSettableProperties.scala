package typingsSlinky.atOracleOraclejet.ojtagcloudMod

import typingsSlinky.atOracleOraclejet.Anon_AnimationDurationHoverBehaviorDelay
import typingsSlinky.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typingsSlinky.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.any
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cloud
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dim
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rectangular
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.single
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTagCloudSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var as: String
  var data: (DataProvider[K, D]) | Null
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var layout: cloud | rectangular
  var selection: js.Array[K]
  var selectionMode: single | multiple | none
  var styleDefaults: Anon_AnimationDurationHoverBehaviorDelay
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojTagCloudSettableProperties: Anon_ComponentNameLabelAndValue
}

object ojTagCloudSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    layout: cloud | rectangular,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    styleDefaults: Anon_AnimationDurationHoverBehaviorDelay,
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue,
    data: DataProvider[K, D] = null
  ): ojTagCloudSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTagCloudSettableProperties[K, D]]
  }
}

