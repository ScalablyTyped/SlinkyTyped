package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootData extends js.Object {
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
  implicit class RootDataOps[Self <: RootData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorHandler(value: ErrorHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInjector(value: Injector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgModule(value: NgModuleRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectableNodes(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectableNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: Renderer2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendererFactory(value: RendererFactory2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSanitizer(value: Sanitizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectorOrNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorOrNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

