package typingsSlinky.fortawesomeFontawesomeSvgCore.mod

import org.scalajs.dom.raw.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fortawesomeFontawesomeSvgCore.mod.Icon_
  - typingsSlinky.fortawesomeFontawesomeSvgCore.mod.Text_
*/
trait IconOrText extends js.Object
object IconOrText {
  
  @scala.inline
  def Text_(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: typingsSlinky.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.text
  ): IconOrText = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOrText]
  }
}
