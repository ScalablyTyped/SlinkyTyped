package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// RaxSVG for RaxSVGElement
@js.native
trait RaxSVGElement
  extends DOMElement[SVGAttributes[org.scalajs.dom.raw.Element], org.scalajs.dom.raw.Element]
object RaxSVGElement {
  
  @scala.inline
  def apply(props: SVGAttributes[org.scalajs.dom.raw.Element], `type`: String): RaxSVGElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxSVGElement]
  }
}
