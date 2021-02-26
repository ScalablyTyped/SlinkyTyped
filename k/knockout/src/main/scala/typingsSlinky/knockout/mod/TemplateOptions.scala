package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateOptions[T] extends StObject {
  
  var afterRender: js.UndefOr[js.Function2[/* elements */ js.Array[Node], /* dataItem */ T, Unit]] = js.native
  
  var templateEngine: js.UndefOr[typingsSlinky.knockout.mod.templateEngine] = js.native
}
object TemplateOptions {
  
  @scala.inline
  def apply[T](): TemplateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions[T]]
  }
  
  @scala.inline
  implicit class TemplateOptionsMutableBuilder[Self <: TemplateOptions[_], T] (val x: Self with TemplateOptions[T]) extends AnyVal {
    
    @scala.inline
    def setAfterRender(value: (/* elements */ js.Array[Node], /* dataItem */ T) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    @scala.inline
    def setTemplateEngine(value: templateEngine): Self = StObject.set(x, "templateEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateEngineUndefined: Self = StObject.set(x, "templateEngine", js.undefined)
  }
}
