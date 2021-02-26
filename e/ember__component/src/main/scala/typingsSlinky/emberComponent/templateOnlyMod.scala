package typingsSlinky.emberComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateOnlyMod {
  
  @JSImport("@ember/component/template-only", JSImport.Default)
  @js.native
  def default(): TemplateOnlyComponent = js.native
  @JSImport("@ember/component/template-only", JSImport.Default)
  @js.native
  def default(moduleName: String): TemplateOnlyComponent = js.native
  
  type TemplateOnlyComponent = _TemplateOnlyComponent
  
  @js.native
  trait _TemplateOnlyComponent extends StObject {
    
    // Type brand to simulate a nominal type.
    var brand: typingsSlinky.emberComponent.emberComponentStrings.TemplateOnlyComponent = js.native
  }
  object _TemplateOnlyComponent {
    
    @scala.inline
    def apply(brand: typingsSlinky.emberComponent.emberComponentStrings.TemplateOnlyComponent): _TemplateOnlyComponent = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[_TemplateOnlyComponent]
    }
    
    @scala.inline
    implicit class _TemplateOnlyComponentMutableBuilder[Self <: _TemplateOnlyComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrand(value: typingsSlinky.emberComponent.emberComponentStrings.TemplateOnlyComponent): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    }
  }
}
