package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
class PivotSchemaDesigner protected ()
  extends typingsSlinky.ejWebAll.ej.PivotSchemaDesigner {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Model) = this()
}

/* static members */
@JSGlobal("ej.PivotSchemaDesigner")
@js.native
object PivotSchemaDesigner extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner = js.native
  @js.native
  object Layouts extends js.Object {
    /* 0 */ val Excel: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Layouts.Excel with Double = js.native
    /* 1 */ val Normal: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Layouts.Normal with Double = js.native
    /* 2 */ val OneByOne: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Layouts.OneByOne with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Layouts with Double] = js.native
  }
  
}

