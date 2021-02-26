package typingsSlinky.oracleOraclejet.ojgaugeMod

import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.Source
import typingsSlinky.oracleOraclejet.anon.`11`
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`1`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.meet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojRatingGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  
  var changed: Boolean = js.native
  
  var changedState: Source = js.native
  
  var hoverState: Source = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var orientation: vertical | horizontal = js.native
  
  var preserveAspectRatio: none | meet = js.native
  
  var readonly: Boolean = js.native
  
  var selectedState: Source = js.native
  
  var step: `0.5` | `1` = js.native
  
  var thresholds: js.Array[Threshold] = js.native
  
  var tooltip: `11` = js.native
  
  val transientValue: Double | Null = js.native
  
  var unselectedState: Source = js.native
  
  var value: Double | Null = js.native
  
  var visualEffects: none | auto = js.native
}
object ojRatingGaugeSettableProperties {
  
  @scala.inline
  def apply(
    changed: Boolean,
    changedState: Source,
    hoverState: Source,
    max: Double,
    min: Double,
    orientation: vertical | horizontal,
    preserveAspectRatio: none | meet,
    readonly: Boolean,
    selectedState: Source,
    step: `0.5` | `1`,
    thresholds: js.Array[Threshold],
    tooltip: `11`,
    trackResize: on | off,
    translations: LabelAndValue,
    unselectedState: Source,
    visualEffects: none | auto
  ): ojRatingGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], changedState = changedState.asInstanceOf[js.Any], hoverState = hoverState.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], selectedState = selectedState.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], unselectedState = unselectedState.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
  
  @scala.inline
  implicit class ojRatingGaugeSettablePropertiesMutableBuilder[Self <: ojRatingGaugeSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedState(value: Source): Self = StObject.set(x, "changedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverState(value: Source): Self = StObject.set(x, "hoverState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatio(value: none | meet): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedState(value: Source): Self = StObject.set(x, "selectedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: `0.5` | `1`): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
    
    @scala.inline
    def setTooltip(value: `11`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValueNull: Self = StObject.set(x, "transientValue", null)
    
    @scala.inline
    def setUnselectedState(value: Source): Self = StObject.set(x, "unselectedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
  }
}
