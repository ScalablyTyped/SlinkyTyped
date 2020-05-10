package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFactory
  extends DOMFactory[SVGAttributes[org.scalajs.dom.raw.Element], org.scalajs.dom.raw.Element] {
  def apply(): RaxSVGElement = js.native
  def apply(children: RaxNode*): RaxSVGElement = js.native
  def apply(
    props: ClassAttributes[org.scalajs.dom.raw.Element] with SVGAttributes[org.scalajs.dom.raw.Element],
    children: RaxNode*
  ): RaxSVGElement = js.native
}

