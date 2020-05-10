package typingsSlinky.fortawesomeFontawesomeSvgCore.mod

import typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import typingsSlinky.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.nest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config_ extends js.Object {
  var autoA11y: Boolean = js.native
  var autoAddCss: Boolean = js.native
  var autoReplaceSvg: Boolean | nest = js.native
  var familyPrefix: IconPrefix = js.native
  var keepOriginalSource: Boolean = js.native
  var measurePerformance: Boolean = js.native
  var observeMutations: Boolean = js.native
  var replacementClass: String = js.native
  var searchPseudoElements: Boolean = js.native
  var showMissingIcons: Boolean = js.native
}

object Config_ {
  @scala.inline
  def apply(
    autoA11y: Boolean,
    autoAddCss: Boolean,
    autoReplaceSvg: Boolean | nest,
    familyPrefix: IconPrefix,
    keepOriginalSource: Boolean,
    measurePerformance: Boolean,
    observeMutations: Boolean,
    replacementClass: String,
    searchPseudoElements: Boolean,
    showMissingIcons: Boolean
  ): Config_ = {
    val __obj = js.Dynamic.literal(autoA11y = autoA11y.asInstanceOf[js.Any], autoAddCss = autoAddCss.asInstanceOf[js.Any], autoReplaceSvg = autoReplaceSvg.asInstanceOf[js.Any], familyPrefix = familyPrefix.asInstanceOf[js.Any], keepOriginalSource = keepOriginalSource.asInstanceOf[js.Any], measurePerformance = measurePerformance.asInstanceOf[js.Any], observeMutations = observeMutations.asInstanceOf[js.Any], replacementClass = replacementClass.asInstanceOf[js.Any], searchPseudoElements = searchPseudoElements.asInstanceOf[js.Any], showMissingIcons = showMissingIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoA11y(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoA11y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAddCss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAddCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoReplaceSvg(value: Boolean | nest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReplaceSvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamilyPrefix(value: IconPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepOriginalSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOriginalSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasurePerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurePerformance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserveMutations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeMutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacementClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacementClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchPseudoElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPseudoElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMissingIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMissingIcons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

