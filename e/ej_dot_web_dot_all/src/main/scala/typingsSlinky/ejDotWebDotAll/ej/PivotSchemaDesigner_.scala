package typingsSlinky.ejDotWebDotAll.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejDotWebDotAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
class PivotSchemaDesigner_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejDotWebDotAll.ej.PivotSchemaDesigner.Model) = this()
  def this(element: Element, options: typingsSlinky.ejDotWebDotAll.ej.PivotSchemaDesigner.Model) = this()
  var defaults: typingsSlinky.ejDotWebDotAll.ej.PivotSchemaDesigner.Model = js.native
  @JSName("model")
  var model_PivotSchemaDesigner_ : typingsSlinky.ejDotWebDotAll.ej.PivotSchemaDesigner.Model = js.native
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  /** Re-renders the control with the data source bound to the pivot control at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
}

