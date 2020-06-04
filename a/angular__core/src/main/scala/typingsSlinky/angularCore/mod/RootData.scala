package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootData extends js.Object {
  var errorHandler: ErrorHandler
  var injector: Injector
  var ngModule: NgModuleRef[_]
  var projectableNodes: js.Array[js.Array[_]]
  var renderer: Renderer2
  var rendererFactory: RendererFactory2
  var sanitizer: Sanitizer
  var selectorOrNode: js.Any
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
  implicit class RootDataOps[Self <: RootData] (val x: Self) extends AnyVal {
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
    def setErrorHandler(value: ErrorHandler): Self = this.set("errorHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setInjector(value: Injector): Self = this.set("injector", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgModule(value: NgModuleRef[_]): Self = this.set("ngModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectableNodes(value: js.Array[js.Array[_]]): Self = this.set("projectableNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: Renderer2): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendererFactory(value: RendererFactory2): Self = this.set("rendererFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setSanitizer(value: Sanitizer): Self = this.set("sanitizer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorOrNode(value: js.Any): Self = this.set("selectorOrNode", value.asInstanceOf[js.Any])
  }
  
}

