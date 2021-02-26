package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootData extends StObject {
  
  var errorHandler: ErrorHandler = js.native
  
  var injector: Injector = js.native
  
  var ngModule: NgModuleRef[_] = js.native
  
  var projectableNodes: js.Array[js.Array[_]] = js.native
  
  var renderer: Renderer2 = js.native
  
  var rendererFactory: RendererFactory2 = js.native
  
  var sanitizer: Sanitizer = js.native
  
  var selectorOrNode: js.Any = js.native
}
object RootData {
  
  @scala.inline
  def apply(
    errorHandler: ErrorHandler,
    injector: Injector,
    ngModule: NgModuleRef[_],
    projectableNodes: js.Array[js.Array[_]],
    renderer: Renderer2,
    rendererFactory: RendererFactory2,
    sanitizer: Sanitizer,
    selectorOrNode: js.Any
  ): RootData = {
    val __obj = js.Dynamic.literal(errorHandler = errorHandler.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], ngModule = ngModule.asInstanceOf[js.Any], projectableNodes = projectableNodes.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], rendererFactory = rendererFactory.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], selectorOrNode = selectorOrNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootData]
  }
  
  @scala.inline
  implicit class RootDataMutableBuilder[Self <: RootData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorHandler(value: ErrorHandler): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgModule(value: NgModuleRef[_]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectableNodes(value: js.Array[js.Array[_]]): Self = StObject.set(x, "projectableNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectableNodesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "projectableNodes", js.Array(value :_*))
    
    @scala.inline
    def setRenderer(value: Renderer2): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererFactory(value: RendererFactory2): Self = StObject.set(x, "rendererFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizer(value: Sanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorOrNode(value: js.Any): Self = StObject.set(x, "selectorOrNode", value.asInstanceOf[js.Any])
  }
}
