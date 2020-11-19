package typingsSlinky.babelPluginReactHtmlAttrs.mod

import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ReactSVG for ReactSVGElement
@js.native
trait ReactSVGElement extends DOMElement[SVGAttributes[SVGElement], SVGElement]
object ReactSVGElement {
  
  @scala.inline
  def apply(props: SVGAttributes[SVGElement], `type`: String): ReactSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSVGElement]
  }
}
