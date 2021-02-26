package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisScheme extends StObject {
  
  var AnalysisOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.AnalysisOptions] = js.native
  
  var AnalysisSchemeLanguage: typingsSlinky.awsSdk.cloudsearchMod.AnalysisSchemeLanguage = js.native
  
  var AnalysisSchemeName: StandardName = js.native
}
object AnalysisScheme {
  
  @scala.inline
  def apply(AnalysisSchemeLanguage: AnalysisSchemeLanguage, AnalysisSchemeName: StandardName): AnalysisScheme = {
    val __obj = js.Dynamic.literal(AnalysisSchemeLanguage = AnalysisSchemeLanguage.asInstanceOf[js.Any], AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisScheme]
  }
  
  @scala.inline
  implicit class AnalysisSchemeMutableBuilder[Self <: AnalysisScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisOptions(value: AnalysisOptions): Self = StObject.set(x, "AnalysisOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisOptionsUndefined: Self = StObject.set(x, "AnalysisOptions", js.undefined)
    
    @scala.inline
    def setAnalysisSchemeLanguage(value: AnalysisSchemeLanguage): Self = StObject.set(x, "AnalysisSchemeLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisSchemeName(value: StandardName): Self = StObject.set(x, "AnalysisSchemeName", value.asInstanceOf[js.Any])
  }
}
