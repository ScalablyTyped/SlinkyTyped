package typingsSlinky.fortawesomeFontawesomeSvgCore.mod

import typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import typingsSlinky.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.nest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config_ extends StObject {
  
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
  implicit class Config_MutableBuilder[Self <: Config_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoA11y(value: Boolean): Self = StObject.set(x, "autoA11y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAddCss(value: Boolean): Self = StObject.set(x, "autoAddCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReplaceSvg(value: Boolean | nest): Self = StObject.set(x, "autoReplaceSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyPrefix(value: IconPrefix): Self = StObject.set(x, "familyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepOriginalSource(value: Boolean): Self = StObject.set(x, "keepOriginalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurePerformance(value: Boolean): Self = StObject.set(x, "measurePerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveMutations(value: Boolean): Self = StObject.set(x, "observeMutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementClass(value: String): Self = StObject.set(x, "replacementClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPseudoElements(value: Boolean): Self = StObject.set(x, "searchPseudoElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMissingIcons(value: Boolean): Self = StObject.set(x, "showMissingIcons", value.asInstanceOf[js.Any])
  }
}
