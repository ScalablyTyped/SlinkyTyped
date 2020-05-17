package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Autocomplete")
@js.native
class Autocomplete protected ()
  extends typingsSlinky.ejWebAll.ej.Autocomplete {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Autocomplete.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Autocomplete.Model) = this()
}

/* static members */
@JSGlobal("ej.Autocomplete")
@js.native
object Autocomplete extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.Autocomplete = js.native
  @js.native
  object Animation extends js.Object {
    /* 2 */ val Fade: typingsSlinky.ejWebAll.ej.Autocomplete.Animation.Fade with Double = js.native
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.Autocomplete.Animation.None with Double = js.native
    /* 1 */ val Slide: typingsSlinky.ejWebAll.ej.Autocomplete.Animation.Slide with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Autocomplete.Animation with Double] = js.native
  }
  
  @js.native
  object MultiSelectMode extends js.Object {
    /* 0 */ val Delimiter: typingsSlinky.ejWebAll.ej.Autocomplete.MultiSelectMode.Delimiter with Double = js.native
    /* 1 */ val VisualMode: typingsSlinky.ejWebAll.ej.Autocomplete.MultiSelectMode.VisualMode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Autocomplete.MultiSelectMode with Double] = js.native
  }
  
  @js.native
  object SortOrder extends js.Object {
    /* 0 */ val Ascending: typingsSlinky.ejWebAll.ej.Autocomplete.SortOrder.Ascending with Double = js.native
    /* 1 */ val Descending: typingsSlinky.ejWebAll.ej.Autocomplete.SortOrder.Descending with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Autocomplete.SortOrder with Double] = js.native
  }
  
}

