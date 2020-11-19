package typingsSlinky.playcanvas.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "createStyle")
@js.native
object createStyle extends js.Object {
  
  /**
    * Creates a &lt;style&gt; DOM element from a string that contains CSS.
    * @example
    * var css = 'body {height: 100;}';
    * var style = pc.createStyle(css);
    * document.head.appendChild(style);
    * @param cssString - A string that contains valid CSS.
    * @returns The style DOM element.
    */
  def apply(cssString: String): Element = js.native
}
