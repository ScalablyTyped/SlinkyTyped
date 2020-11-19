package typingsSlinky.katex.autoRenderMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("katex/dist/contrib/auto-render", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Auto-render TeX expressions in HTML element
    * @param elem HTML element to auto-render
    * @param options Render options
    */
  def apply(elem: HTMLElement): Unit = js.native
  def apply(elem: HTMLElement, options: RenderMathInElementOptions): Unit = js.native
}
