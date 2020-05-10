package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgModuleDefinition extends Definition[NgModuleDefinitionFactory] {
  var isRoot: Boolean = js.native
  var modules: js.Array[_] = js.native
  var providers: js.Array[NgModuleProviderDef] = js.native
  var providersByKey: StringDictionary[NgModuleProviderDef] = js.native
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
    def withIsRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[NgModuleProviderDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvidersByKey(value: StringDictionary[NgModuleProviderDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providersByKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

