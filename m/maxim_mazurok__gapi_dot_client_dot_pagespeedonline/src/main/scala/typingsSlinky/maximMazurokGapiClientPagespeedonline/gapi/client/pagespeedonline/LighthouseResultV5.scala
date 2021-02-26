package typingsSlinky.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LighthouseResultV5 extends StObject {
  
  /** Map of audits in the LHR. */
  var audits: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.LighthouseAuditResultV5}
    */ typingsSlinky.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.LighthouseResultV5 with TopLevel[js.Any]
  ] = js.native
  
  /** Map of categories in the LHR. */
  var categories: js.UndefOr[Categories] = js.native
  
  /** Map of category groups in the LHR. */
  var categoryGroups: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.CategoryGroupV5}
    */ typingsSlinky.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.LighthouseResultV5 with TopLevel[js.Any]
  ] = js.native
  
  /** The configuration settings for this LHR. */
  var configSettings: js.UndefOr[ConfigSettings] = js.native
  
  /** Environment settings that were used when making this LHR. */
  var environment: js.UndefOr[Environment] = js.native
  
  /** The time that this run was fetched. */
  var fetchTime: js.UndefOr[String] = js.native
  
  /** The final resolved url that was audited. */
  var finalUrl: js.UndefOr[String] = js.native
  
  /** The internationalization strings that are required to render the LHR. */
  var i18n: js.UndefOr[I18n] = js.native
  
  /** The lighthouse version that was used to generate this LHR. */
  var lighthouseVersion: js.UndefOr[String] = js.native
  
  /** The original requested url. */
  var requestedUrl: js.UndefOr[String] = js.native
  
  /** List of all run warnings in the LHR. Will always output to at least `[]`. */
  var runWarnings: js.UndefOr[js.Array[_]] = js.native
  
  /** A top-level error message that, if present, indicates a serious enough problem that this Lighthouse result may need to be discarded. */
  var runtimeError: js.UndefOr[RuntimeError] = js.native
  
  /** The Stack Pack advice strings. */
  var stackPacks: js.UndefOr[js.Array[StackPack]] = js.native
  
  /** Timing information for this LHR. */
  var timing: js.UndefOr[Timing] = js.native
  
  /** The user agent that was used to run this LHR. */
  var userAgent: js.UndefOr[String] = js.native
}
object LighthouseResultV5 {
  
  @scala.inline
  def apply(): LighthouseResultV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighthouseResultV5]
  }
  
  @scala.inline
  implicit class LighthouseResultV5MutableBuilder[Self <: LighthouseResultV5] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudits(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.LighthouseAuditResultV5}
      */ typingsSlinky.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.LighthouseResultV5 with TopLevel[js.Any]
    ): Self = StObject.set(x, "audits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditsUndefined: Self = StObject.set(x, "audits", js.undefined)
    
    @scala.inline
    def setCategories(value: Categories): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoryGroups(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.pagespeedonline.gapi.client.pagespeedonline.CategoryGroupV5}
      */ typingsSlinky.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.LighthouseResultV5 with TopLevel[js.Any]
    ): Self = StObject.set(x, "categoryGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryGroupsUndefined: Self = StObject.set(x, "categoryGroups", js.undefined)
    
    @scala.inline
    def setConfigSettings(value: ConfigSettings): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigSettingsUndefined: Self = StObject.set(x, "configSettings", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setFetchTime(value: String): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
    
    @scala.inline
    def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUrlUndefined: Self = StObject.set(x, "finalUrl", js.undefined)
    
    @scala.inline
    def setI18n(value: I18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setLighthouseVersion(value: String): Self = StObject.set(x, "lighthouseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighthouseVersionUndefined: Self = StObject.set(x, "lighthouseVersion", js.undefined)
    
    @scala.inline
    def setRequestedUrl(value: String): Self = StObject.set(x, "requestedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUrlUndefined: Self = StObject.set(x, "requestedUrl", js.undefined)
    
    @scala.inline
    def setRunWarnings(value: js.Array[_]): Self = StObject.set(x, "runWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunWarningsUndefined: Self = StObject.set(x, "runWarnings", js.undefined)
    
    @scala.inline
    def setRunWarningsVarargs(value: js.Any*): Self = StObject.set(x, "runWarnings", js.Array(value :_*))
    
    @scala.inline
    def setRuntimeError(value: RuntimeError): Self = StObject.set(x, "runtimeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeErrorUndefined: Self = StObject.set(x, "runtimeError", js.undefined)
    
    @scala.inline
    def setStackPacks(value: js.Array[StackPack]): Self = StObject.set(x, "stackPacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPacksUndefined: Self = StObject.set(x, "stackPacks", js.undefined)
    
    @scala.inline
    def setStackPacksVarargs(value: StackPack*): Self = StObject.set(x, "stackPacks", js.Array(value :_*))
    
    @scala.inline
    def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
