package typingsSlinky.jestRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<@jest/transform.@jest/transform.CallerTransformOptions> */
@js.native
trait InternalModuleOptions extends js.Object {
  
  var isInternalModule: Boolean = js.native
  
  var supportsDynamicImport: Boolean = js.native
  
  var supportsExportNamespaceFrom: Boolean = js.native
  
  var supportsStaticESM: Boolean = js.native
  
  var supportsTopLevelAwait: Boolean = js.native
}
object InternalModuleOptions {
  
  @scala.inline
  def apply(
    isInternalModule: Boolean,
    supportsDynamicImport: Boolean,
    supportsExportNamespaceFrom: Boolean,
    supportsStaticESM: Boolean,
    supportsTopLevelAwait: Boolean
  ): InternalModuleOptions = {
    val __obj = js.Dynamic.literal(isInternalModule = isInternalModule.asInstanceOf[js.Any], supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsExportNamespaceFrom = supportsExportNamespaceFrom.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], supportsTopLevelAwait = supportsTopLevelAwait.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalModuleOptions]
  }
  
  @scala.inline
  implicit class InternalModuleOptionsOps[Self <: InternalModuleOptions] (val x: Self) extends AnyVal {
    
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
    def setIsInternalModule(value: Boolean): Self = this.set("isInternalModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDynamicImport(value: Boolean): Self = this.set("supportsDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsExportNamespaceFrom(value: Boolean): Self = this.set("supportsExportNamespaceFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStaticESM(value: Boolean): Self = this.set("supportsStaticESM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTopLevelAwait(value: Boolean): Self = this.set("supportsTopLevelAwait", value.asInstanceOf[js.Any])
  }
}
