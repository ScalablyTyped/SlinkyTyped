package typingsSlinky.oracleOraclejet.ojsunburstMod

import typingsSlinky.oracleOraclejet.anon.HoverColor
import typingsSlinky.oracleOraclejet.anon.LabelColor
import typingsSlinky.oracleOraclejet.anon.`16`
import typingsSlinky.oracleOraclejet.anon.`17`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSunburstSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double = js.native
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var animationUpdateColor: String = js.native
  var as: String = js.native
  var colorLabel: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var displayLevels: Double = js.native
  var drilling: on | off = js.native
  var expanded: KeySet[K] = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverBehaviorDelay: Double = js.native
  var nodeDefaults: HoverColor = js.native
  var rootNode: js.Any = js.native
  var rootNodeContent: `16`[K, D] = js.native
  var rotation: off | on = js.native
  var selection: js.Array[_] = js.native
  var selectionMode: none | single | multiple = js.native
  var sizeLabel: String = js.native
  var sorting: on | off = js.native
  var startAngle: Double = js.native
  var tooltip: `17`[K, D] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojSunburstSettableProperties: LabelColor = js.native
}

object ojSunburstSettableProperties {
  @scala.inline
  def apply[K, D](
    animationDuration: Double,
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    animationUpdateColor: String,
    as: String,
    colorLabel: String,
    displayLevels: Double,
    drilling: on | off,
    expanded: KeySet[K],
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    hoverBehaviorDelay: Double,
    nodeDefaults: HoverColor,
    rootNode: js.Any,
    rootNodeContent: `16`[K, D],
    rotation: off | on,
    selection: js.Array[_],
    selectionMode: none | single | multiple,
    sizeLabel: String,
    sorting: on | off,
    startAngle: Double,
    tooltip: `17`[K, D],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: LabelColor
  ): ojSunburstSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], animationUpdateColor = animationUpdateColor.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], colorLabel = colorLabel.asInstanceOf[js.Any], displayLevels = displayLevels.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], rootNodeContent = rootNodeContent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sizeLabel = sizeLabel.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSunburstSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojSunburstSettablePropertiesOps[Self[k, d] <: ojSunburstSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDataChange(value: auto | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationUpdateColor(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationUpdateColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorLabel(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayLevels(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrilling(value: on | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: KeySet[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightMatch(value: any | all): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehaviorDelay(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeDefaults(value: HoverColor): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNode(value: js.Any): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNodeContent(value: `16`[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNodeContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: off | on): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[_]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: none | single | multiple): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeLabel(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorting(value: on | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: `17`[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchResponse(value: touchStart | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: LabelColor): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
  }
  
}

