package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFactory
  extends DOMFactory[SVGAttributes[org.scalajs.dom.raw.Element], org.scalajs.dom.raw.Element] {
  
  def apply(
    props: ClassAttributes[org.scalajs.dom.raw.Element] with SVGAttributes[org.scalajs.dom.raw.Element],
    children: RaxNode*
  ): RaxSVGElement = js.native
  def apply(props: js.UndefOr[scala.Nothing], children: RaxNode*): RaxSVGElement = js.native
  def apply(props: Null, children: RaxNode*): RaxSVGElement = js.native
}
