package typingsSlinky.domtagger.mod

import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.domtagger.domtaggerStrings.svg
import typingsSlinky.std.ChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGOptions extends Options {
  @JSName("type")
  var type_SVGOptions: svg = js.native
}

object SVGOptions {
  @scala.inline
  def apply(
    any: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit],
    attribute: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit],
    text: Node => js.Function1[/* textContent */ js.Any, Unit],
    `type`: svg
  ): SVGOptions = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), attribute = js.Any.fromFunction3(attribute), text = js.Any.fromFunction1(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGOptions]
  }
  @scala.inline
  implicit class SVGOptionsOps[Self <: SVGOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: svg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

