package typingsSlinky.domtagger.mod

import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.std.ChildNode
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		 * Used to provide a custom algorithm for converting a template
  		 * to a valid HTML text.
  		 */
  var convert: js.UndefOr[js.Function1[/* template */ TemplateStringsArray, String]] = js.native
  /**
  		 * Used to postprocess the result of `convert`.
  		 *
  		 * @param transform The default transformation.
  		 */
  var transform: js.UndefOr[js.Function1[/* markup */ String, String]] = js.native
  /**
  		 * The type of content to create.
  		 *
  		 * When `'svg'`, the generated template function returns `SVGElement` instances.
  		 *
  		 * @default 'html'
  		 */
  var `type`: js.UndefOr[String] = js.native
  /**
  		 * Called when no other node type satisfies the parsed result.
  		 *
  		 * @param node The node
  		 * @param childNodes
  		 */
  def any(node: Node, childNodes: js.Array[ChildNode]): js.Function1[/* markup */ js.Any, Unit] = js.native
  /**
  		 * Called when the parsed result is an attribute node.
  		 *
  		 * @param element The element whose attribute to set.
  		 * @param name The raw attribute name.
  		 * @param attribute The attribute node.
  		 *
  		 * @example
  		 * ```ts
  		 * (node, name, attribute) => value => {
  		 * 	const type = typeof value;
  		 * 	if (type === 'boolean' || type === 'function') {
  		 * 		node[name] = value;
  		 * 	} else if (value == null) {
  		 * 		node.removeAttribute(name);
  		 * 	} else {
  		 * 		node.setAttribute(name, value);
  		 * 	}
  		 * }
  		 * ```
  		 */
  def attribute(element: Element, name: String, attribute: Attr): js.Function1[/* value */ js.Any, Unit] = js.native
  /**
  		 * How to handle cases where content can only be some text.
  		 *
  		 * The node is one that can only have text.
  		 *
  		 * @param node The node whose text content to set
  		 *
  		 * @example
  		 * ```ts
  		 * node => textContent => {
  		 * 	node.textContent = textContent;
  		 * }
  		 * ```
  		 */
  def text(node: Node): js.Function1[/* textContent */ js.Any, Unit] = js.native
}

object Options {
  @scala.inline
  def apply(
    any: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit],
    attribute: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit],
    text: Node => js.Function1[/* textContent */ js.Any, Unit]
  ): Options = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), attribute = js.Any.fromFunction3(attribute), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAny(value: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttribute(value: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withText(value: Node => js.Function1[/* textContent */ js.Any, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConvert(value: /* template */ TemplateStringsArray => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* markup */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

