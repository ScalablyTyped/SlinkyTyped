package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Toolbar")
@js.native
class Toolbar protected ()
  extends typingsSlinky.ejWebAll.ej.Toolbar {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Toolbar.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Toolbar.Model) = this()
}

/* static members */
@JSGlobal("ej.Toolbar")
@js.native
object Toolbar extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.Toolbar = js.native
  @js.native
  object ResponsiveType extends js.Object {
    /* 1 */ val Inline: typingsSlinky.ejWebAll.ej.Toolbar.ResponsiveType.Inline with Double = js.native
    /* 0 */ val Popup: typingsSlinky.ejWebAll.ej.Toolbar.ResponsiveType.Popup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Toolbar.ResponsiveType with Double] = js.native
  }
  
}

