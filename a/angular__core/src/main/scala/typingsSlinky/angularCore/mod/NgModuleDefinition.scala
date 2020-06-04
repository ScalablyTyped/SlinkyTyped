package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleDefinition extends Definition[NgModuleDefinitionFactory] {
  var isRoot: Boolean
  var modules: js.Array[_]
  var providers: js.Array[NgModuleProviderDef]
  var providersByKey: StringDictionary[NgModuleProviderDef]
}

object NgModuleDefinition {
  @scala.inline
  def apply(
    isRoot: Boolean,
    modules: js.Array[_],
    providers: js.Array[NgModuleProviderDef],
    providersByKey: StringDictionary[NgModuleProviderDef]
  ): NgModuleDefinition = {
    val __obj = js.Dynamic.literal(isRoot = isRoot.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], providersByKey = providersByKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleDefinition]
  }
  @scala.inline
  implicit class NgModuleDefinitionOps[Self <: NgModuleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsRoot(value: Boolean): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setModules(value: js.Array[_]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviders(value: js.Array[NgModuleProviderDef]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersByKey(value: StringDictionary[NgModuleProviderDef]): Self = this.set("providersByKey", value.asInstanceOf[js.Any])
  }
  
}

