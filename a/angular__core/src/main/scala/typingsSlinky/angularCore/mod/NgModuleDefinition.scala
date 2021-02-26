package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCore.angularCoreStrings.platform
import typingsSlinky.angularCore.angularCoreStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModuleDefinition extends Definition[NgModuleDefinitionFactory] {
  
  var modules: js.Array[_] = js.native
  
  var providers: js.Array[NgModuleProviderDef] = js.native
  
  var providersByKey: StringDictionary[NgModuleProviderDef] = js.native
  
  var scope: root | platform | Null = js.native
}
object NgModuleDefinition {
  
  @scala.inline
  def apply(
    modules: js.Array[_],
    providers: js.Array[NgModuleProviderDef],
    providersByKey: StringDictionary[NgModuleProviderDef]
  ): NgModuleDefinition = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], providersByKey = providersByKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleDefinition]
  }
  
  @scala.inline
  implicit class NgModuleDefinitionMutableBuilder[Self <: NgModuleDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModules(value: js.Array[_]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesVarargs(value: js.Any*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[NgModuleProviderDef]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersByKey(value: StringDictionary[NgModuleProviderDef]): Self = StObject.set(x, "providersByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: NgModuleProviderDef*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: root | platform): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeNull: Self = StObject.set(x, "scope", null)
  }
}
