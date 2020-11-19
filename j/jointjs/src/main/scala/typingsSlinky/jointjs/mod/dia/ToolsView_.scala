package typingsSlinky.jointjs.mod.dia

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.mod.dia.ToolsView.Options
import typingsSlinky.jointjs.mod.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.ToolsView")
@js.native
class ToolsView_ ()
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
  var options_ToolsView_ : Options = js.native
  
  def show(): this.type = js.native
  
  /* protected */ def simulateRelatedView(el: SVGElement): Unit = js.native
}
