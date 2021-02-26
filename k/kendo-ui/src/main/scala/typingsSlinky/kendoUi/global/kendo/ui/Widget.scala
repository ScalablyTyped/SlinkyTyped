package typingsSlinky.kendoUi.global.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Widget")
@js.native
class Widget protected ()
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(selector: String) = this()
  def this(element: Element, options: js.Object) = this()
  def this(element: JQuery, options: js.Object) = this()
  def this(selector: String, options: js.Object) = this()
}
object Widget {
  
  @JSGlobal("kendo.ui.Widget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Widget.extend")
  @js.native
  def extend(prototype: js.Object): typingsSlinky.kendoUi.kendo.ui.Widget = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Widget.fn")
  @js.native
  def fn: js.Any = js.native
  @scala.inline
  def fn_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
