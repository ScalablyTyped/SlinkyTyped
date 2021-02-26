package typingsSlinky.aureliaTemplating.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.aureliaDependencyInjection.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhanceInstruction extends StObject {
  
  /**
    * A binding context for the enhancement.
    */
  var bindingContext: js.UndefOr[js.Object] = js.native
  
  /**
    * The DI container to use as the root for UI enhancement.
    */
  var container: js.UndefOr[Container] = js.native
  
  /**
    * The element to enhance.
    */
  var element: Element = js.native
  
  /**
    * A secondary binding context that can override the standard context.
    */
  var overrideContext: js.UndefOr[js.Any] = js.native
  
  /**
    * The resources available for enhancement.
    */
  var resources: js.UndefOr[ViewResources_] = js.native
}
object EnhanceInstruction {
  
  @scala.inline
  def apply(element: Element): EnhanceInstruction = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhanceInstruction]
  }
  
  @scala.inline
  implicit class EnhanceInstructionMutableBuilder[Self <: EnhanceInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingContext(value: js.Object): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
    
    @scala.inline
    def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideContext(value: js.Any): Self = StObject.set(x, "overrideContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideContextUndefined: Self = StObject.set(x, "overrideContext", js.undefined)
    
    @scala.inline
    def setResources(value: ViewResources_): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
