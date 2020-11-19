package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Kanban")
@js.native
class Kanban protected ()
  extends typingsSlinky.ejWebAll.ej.Kanban {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Kanban.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Kanban.Model) = this()
}
/* static members */
@JSGlobal("ej.Kanban")
@js.native
object Kanban extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.Kanban = js.native
  
  @js.native
  object EditMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Kanban.EditMode with Double] = js.native
    
    /* 0 */ val Dialog: typingsSlinky.ejWebAll.ej.Kanban.EditMode.Dialog with Double = js.native
    
    /* 1 */ val DialogTemplate: typingsSlinky.ejWebAll.ej.Kanban.EditMode.DialogTemplate with Double = js.native
    
    /* 2 */ val ExternalForm: typingsSlinky.ejWebAll.ej.Kanban.EditMode.ExternalForm with Double = js.native
    
    /* 3 */ val ExternalFormTemplate: typingsSlinky.ejWebAll.ej.Kanban.EditMode.ExternalFormTemplate with Double = js.native
  }
  
  @js.native
  object EditingType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Kanban.EditingType with Double] = js.native
    
    /* 3 */ val DatePicker: typingsSlinky.ejWebAll.ej.Kanban.EditingType.DatePicker with Double = js.native
    
    /* 4 */ val DateTimePicker: typingsSlinky.ejWebAll.ej.Kanban.EditingType.DateTimePicker with Double = js.native
    
    /* 2 */ val Dropdown: typingsSlinky.ejWebAll.ej.Kanban.EditingType.Dropdown with Double = js.native
    
    /* 1 */ val Numeric: typingsSlinky.ejWebAll.ej.Kanban.EditingType.Numeric with Double = js.native
    
    /* 6 */ val RTE: typingsSlinky.ejWebAll.ej.Kanban.EditingType.RTE with Double = js.native
    
    /* 0 */ val String: typingsSlinky.ejWebAll.ej.Kanban.EditingType.String with Double = js.native
    
    /* 5 */ val TextArea: typingsSlinky.ejWebAll.ej.Kanban.EditingType.TextArea with Double = js.native
  }
  
  @js.native
  object FormPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Kanban.FormPosition with Double] = js.native
    
    /* 0 */ val Bottom: typingsSlinky.ejWebAll.ej.Kanban.FormPosition.Bottom with Double = js.native
    
    /* 1 */ val Right: typingsSlinky.ejWebAll.ej.Kanban.FormPosition.Right with Double = js.native
  }
  
  @js.native
  object SelectionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Kanban.SelectionType with Double] = js.native
    
    /* 1 */ val Multiple: typingsSlinky.ejWebAll.ej.Kanban.SelectionType.Multiple with Double = js.native
    
    /* 0 */ val Single: typingsSlinky.ejWebAll.ej.Kanban.SelectionType.Single with Double = js.native
  }
  
  @js.native
  object Target extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Kanban.Target with Double] = js.native
    
    /* 3 */ val All: typingsSlinky.ejWebAll.ej.Kanban.Target.All with Double = js.native
    
    /* 2 */ val Card: typingsSlinky.ejWebAll.ej.Kanban.Target.Card with Double = js.native
    
    /* 1 */ val Content: typingsSlinky.ejWebAll.ej.Kanban.Target.Content with Double = js.native
    
    /* 0 */ val Header: typingsSlinky.ejWebAll.ej.Kanban.Target.Header with Double = js.native
  }
}
