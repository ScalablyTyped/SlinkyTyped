package typingsSlinky.ckeditorCkeditor5Engine.mod.view

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/uielement
@JSImport("@ckeditor/ckeditor5-engine", "view.UIElement")
@js.native
class UIElement protected () extends Element {
  protected def this(name: String) = this()
  protected def this(name: String, attrs: js.Object) = this()
  protected def this(name: String, attrs: js.Iterable[js.Tuple2[String, String]]) = this()
  protected def this(name: String, attrs: Map[String, String]) = this()
  protected def this(name: String, attrs: js.UndefOr[scala.Nothing], children: Node) = this()
  protected def this(name: String, attrs: js.UndefOr[scala.Nothing], children: js.Iterable[Node]) = this()
  protected def this(name: String, attrs: js.Object, children: Node) = this()
  protected def this(name: String, attrs: js.Object, children: js.Iterable[Node]) = this()
  protected def this(name: String, attrs: js.Iterable[js.Tuple2[String, String]], children: Node) = this()
  protected def this(name: String, attrs: js.Iterable[js.Tuple2[String, String]], children: js.Iterable[Node]) = this()
  protected def this(name: String, attrs: Map[String, String], children: Node) = this()
  protected def this(name: String, attrs: Map[String, String], children: js.Iterable[Node]) = this()
  def render(domDocument: /*TODO: globals.*/ Document): HTMLElement = js.native
  def toDomElement(domDocument: /*TODO: globals.*/ Document): HTMLElement = js.native
}

