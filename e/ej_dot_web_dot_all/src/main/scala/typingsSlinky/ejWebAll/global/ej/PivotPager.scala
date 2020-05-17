package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager protected ()
  extends typingsSlinky.ejWebAll.ej.PivotPager {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.PivotPager.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.PivotPager.Model) = this()
}

/* static members */
@JSGlobal("ej.PivotPager")
@js.native
object PivotPager extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.PivotPager = js.native
  @js.native
  object Mode extends js.Object {
    /* 0 */ val Both: typingsSlinky.ejWebAll.ej.PivotPager.Mode.Both with Double = js.native
    /* 1 */ val Categorical: typingsSlinky.ejWebAll.ej.PivotPager.Mode.Categorical with Double = js.native
    /* 2 */ val Series: typingsSlinky.ejWebAll.ej.PivotPager.Mode.Series with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotPager.Mode with Double] = js.native
  }
  
}

