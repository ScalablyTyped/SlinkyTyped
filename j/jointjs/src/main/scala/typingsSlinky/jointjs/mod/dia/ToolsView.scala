package typingsSlinky.jointjs.mod.dia

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.mod.dia.ToolsView.Options
import typingsSlinky.jointjs.mod.mvc.View
import typingsSlinky.jointjs.mod.mvc.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.ToolsView")
@js.native
class ToolsView ()
  extends View[js.UndefOr[scala.Nothing]] {
  def this(opt: Options) = this()
  
  def blurTool(tool: ToolView): this.type = js.native
  
  def configure(): this.type = js.native
  def configure(opt: Options): this.type = js.native
  
  def focusTool(tool: ToolView): this.type = js.native
  
  def getName(): String | Null = js.native
  
  def hide(): this.type = js.native
  
  def mount(): this.type = js.native
  
  @JSName("options")
  var options_ToolsView: Options = js.native
  
  def show(): this.type = js.native
  
  /* protected */ def simulateRelatedView(el: SVGElement): Unit = js.native
}
object ToolsView {
  
  @js.native
  trait Options
    extends ViewOptions[js.UndefOr[scala.Nothing]] {
    
    var component: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String | Null] = js.native
    
    var relatedView: js.UndefOr[CellView] = js.native
    
    var tools: js.UndefOr[js.Array[ToolView]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: Boolean): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRelatedView(value: CellView): Self = StObject.set(x, "relatedView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedViewUndefined: Self = StObject.set(x, "relatedView", js.undefined)
      
      @scala.inline
      def setTools(value: js.Array[ToolView]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
      
      @scala.inline
      def setToolsVarargs(value: ToolView*): Self = StObject.set(x, "tools", js.Array(value :_*))
    }
  }
}
