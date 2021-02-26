package typingsSlinky.antdMobile.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderBodyComponent extends StObject {
  
  def renderBodyComponent(): ReactElement = js.native
  
  var renderFooter: js.Any = js.native
  
  var renderHeader: js.Any = js.native
  
  var renderSectionHeader: js.Any = js.native
}
object RenderBodyComponent {
  
  @scala.inline
  def apply(
    renderBodyComponent: () => ReactElement,
    renderFooter: js.Any,
    renderHeader: js.Any,
    renderSectionHeader: js.Any
  ): RenderBodyComponent = {
    val __obj = js.Dynamic.literal(renderBodyComponent = js.Any.fromFunction0(renderBodyComponent), renderFooter = renderFooter.asInstanceOf[js.Any], renderHeader = renderHeader.asInstanceOf[js.Any], renderSectionHeader = renderSectionHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderBodyComponent]
  }
  
  @scala.inline
  implicit class RenderBodyComponentMutableBuilder[Self <: RenderBodyComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderBodyComponent(value: () => ReactElement): Self = StObject.set(x, "renderBodyComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderFooter(value: js.Any): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderHeader(value: js.Any): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderSectionHeader(value: js.Any): Self = StObject.set(x, "renderSectionHeader", value.asInstanceOf[js.Any])
  }
}
