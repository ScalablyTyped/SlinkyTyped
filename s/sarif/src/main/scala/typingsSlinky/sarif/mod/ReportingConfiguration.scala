package typingsSlinky.sarif.mod

import typingsSlinky.sarif.mod.ReportingConfiguration.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingConfiguration extends StObject {
  
  /**
    * Specifies whether the report may be produced during the scan.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the failure level for the report.
    */
  var level: js.UndefOr[level] = js.native
  
  /**
    * Contains configuration information specific to a report.
    */
  var parameters: js.UndefOr[PropertyBag] = js.native
  
  /**
    * Key/value pairs that provide additional information about the reporting configuration.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * Specifies the relative priority of the report. Used for analysis output only.
    */
  var rank: js.UndefOr[Double] = js.native
}
object ReportingConfiguration {
  
  @scala.inline
  def apply(): ReportingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingConfiguration]
  }
  
  @scala.inline
  implicit class ReportingConfigurationMutableBuilder[Self <: ReportingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLevel(value: level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setParameters(value: PropertyBag): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sarif.sarifStrings.none
    - typingsSlinky.sarif.sarifStrings.note
    - typingsSlinky.sarif.sarifStrings.warning
    - typingsSlinky.sarif.sarifStrings.error
  */
  trait level extends StObject
  object level {
    
    @scala.inline
    def error: typingsSlinky.sarif.sarifStrings.error = "error".asInstanceOf[typingsSlinky.sarif.sarifStrings.error]
    
    @scala.inline
    def none: typingsSlinky.sarif.sarifStrings.none = "none".asInstanceOf[typingsSlinky.sarif.sarifStrings.none]
    
    @scala.inline
    def note: typingsSlinky.sarif.sarifStrings.note = "note".asInstanceOf[typingsSlinky.sarif.sarifStrings.note]
    
    @scala.inline
    def warning: typingsSlinky.sarif.sarifStrings.warning = "warning".asInstanceOf[typingsSlinky.sarif.sarifStrings.warning]
  }
}
