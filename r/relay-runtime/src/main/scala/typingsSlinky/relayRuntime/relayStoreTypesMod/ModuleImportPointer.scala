package typingsSlinky.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleImportPointer extends StObject {
  
  @JSName("$fragmentRefs")
  val $fragmentRefs: js.Any = js.native
  
  val __fragmentPropName: js.UndefOr[String | Null] = js.native
  
  val __module_component: js.Any = js.native
}
object ModuleImportPointer {
  
  @scala.inline
  def apply($fragmentRefs: js.Any, __module_component: js.Any): ModuleImportPointer = {
    val __obj = js.Dynamic.literal($fragmentRefs = $fragmentRefs.asInstanceOf[js.Any], __module_component = __module_component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportPointer]
  }
  
  @scala.inline
  implicit class ModuleImportPointerMutableBuilder[Self <: ModuleImportPointer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fragmentRefs(value: js.Any): Self = StObject.set(x, "$fragmentRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__fragmentPropName(value: String): Self = StObject.set(x, "__fragmentPropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__fragmentPropNameNull: Self = StObject.set(x, "__fragmentPropName", null)
    
    @scala.inline
    def set__fragmentPropNameUndefined: Self = StObject.set(x, "__fragmentPropName", js.undefined)
    
    @scala.inline
    def set__module_component(value: js.Any): Self = StObject.set(x, "__module_component", value.asInstanceOf[js.Any])
  }
}
