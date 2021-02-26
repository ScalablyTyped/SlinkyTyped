package typingsSlinky.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Services extends StObject {
  
  var backendConnector: js.Any = js.native
  
  var i18nFormat: js.Any = js.native
  
  var interpolator: Interpolator = js.native
  
  var languageDetector: js.Any = js.native
  
  var languageUtils: js.Any = js.native
  
  var logger: js.Any = js.native
  
  var pluralResolver: js.Any = js.native
  
  var resourceStore: ResourceStore = js.native
}
object Services {
  
  @scala.inline
  def apply(
    backendConnector: js.Any,
    i18nFormat: js.Any,
    interpolator: Interpolator,
    languageDetector: js.Any,
    languageUtils: js.Any,
    logger: js.Any,
    pluralResolver: js.Any,
    resourceStore: ResourceStore
  ): Services = {
    val __obj = js.Dynamic.literal(backendConnector = backendConnector.asInstanceOf[js.Any], i18nFormat = i18nFormat.asInstanceOf[js.Any], interpolator = interpolator.asInstanceOf[js.Any], languageDetector = languageDetector.asInstanceOf[js.Any], languageUtils = languageUtils.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pluralResolver = pluralResolver.asInstanceOf[js.Any], resourceStore = resourceStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  
  @scala.inline
  implicit class ServicesMutableBuilder[Self <: Services] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendConnector(value: js.Any): Self = StObject.set(x, "backendConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nFormat(value: js.Any): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolator(value: Interpolator): Self = StObject.set(x, "interpolator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDetector(value: js.Any): Self = StObject.set(x, "languageDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUtils(value: js.Any): Self = StObject.set(x, "languageUtils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralResolver(value: js.Any): Self = StObject.set(x, "pluralResolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStore(value: ResourceStore): Self = StObject.set(x, "resourceStore", value.asInstanceOf[js.Any])
  }
}
