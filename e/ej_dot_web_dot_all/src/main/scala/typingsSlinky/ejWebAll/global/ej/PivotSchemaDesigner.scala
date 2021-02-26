package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
class PivotSchemaDesigner protected ()
  extends typingsSlinky.ejWebAll.ej.PivotSchemaDesigner {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object PivotSchemaDesigner {
  
  @JSGlobal("ej.PivotSchemaDesigner")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotSchemaDesigner.Layouts")
  @js.native
  object Layouts extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Layouts with Double] = js.native
    
    /* 0 */ val Excel: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Layouts.Excel with Double = js.native
    
    /* 1 */ val Normal: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Layouts.Normal with Double = js.native
    
    /* 2 */ val OneByOne: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner.Layouts.OneByOne with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotSchemaDesigner.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotSchemaDesigner.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.PivotSchemaDesigner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
