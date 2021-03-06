package typingsSlinky.rcTree.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcTree.indentMod.IndentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Indent {
  
  @scala.inline
  def apply(isEnd: js.Array[Boolean], isStart: js.Array[Boolean], level: Double, prefixCls: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IndentProps]))
  }
  
  @JSImport("rc-tree/es/Indent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IndentProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
