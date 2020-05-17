package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Ribbon")
@js.native
class Ribbon protected ()
  extends typingsSlinky.ejWebAll.ej.Ribbon {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Ribbon.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Ribbon.Model) = this()
}

/* static members */
@JSGlobal("ej.Ribbon")
@js.native
object Ribbon extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.Ribbon = js.native
  @js.native
  object AlignType extends js.Object {
    /* 1 */ val Columns: typingsSlinky.ejWebAll.ej.Ribbon.AlignType.Columns with Double = js.native
    /* 0 */ val Rows: typingsSlinky.ejWebAll.ej.Ribbon.AlignType.Rows with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.AlignType with Double] = js.native
  }
  
  @js.native
  object ApplicationTabType extends js.Object {
    /* 1 */ val Backstage: typingsSlinky.ejWebAll.ej.Ribbon.ApplicationTabType.Backstage with Double = js.native
    /* 0 */ val Menu: typingsSlinky.ejWebAll.ej.Ribbon.ApplicationTabType.Menu with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.ApplicationTabType with Double] = js.native
  }
  
  @js.native
  object CustomItemType extends js.Object {
    /* 0 */ val Button: typingsSlinky.ejWebAll.ej.Ribbon.CustomItemType.Button with Double = js.native
    /* 1 */ val Menu: typingsSlinky.ejWebAll.ej.Ribbon.CustomItemType.Menu with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.CustomItemType with Double] = js.native
  }
  
  @js.native
  object ItemType extends js.Object {
    /* 0 */ val Button: typingsSlinky.ejWebAll.ej.Ribbon.ItemType.Button with Double = js.native
    /* 1 */ val Tab: typingsSlinky.ejWebAll.ej.Ribbon.ItemType.Tab with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.ItemType with Double] = js.native
  }
  
  @js.native
  object QuickAccessMode extends js.Object {
    /* 2 */ val Menu: typingsSlinky.ejWebAll.ej.Ribbon.QuickAccessMode.Menu with Double = js.native
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.Ribbon.QuickAccessMode.None with Double = js.native
    /* 1 */ val ToolBar: typingsSlinky.ejWebAll.ej.Ribbon.QuickAccessMode.ToolBar with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.QuickAccessMode with Double] = js.native
  }
  
  @js.native
  object Type extends js.Object {
    /* 0 */ val Button: typingsSlinky.ejWebAll.ej.Ribbon.Type.Button with Double = js.native
    /* 3 */ val Custom: typingsSlinky.ejWebAll.ej.Ribbon.Type.Custom with Double = js.native
    /* 2 */ val DropDownList: typingsSlinky.ejWebAll.ej.Ribbon.Type.DropDownList with Double = js.native
    /* 5 */ val Gallery: typingsSlinky.ejWebAll.ej.Ribbon.Type.Gallery with Double = js.native
    /* 1 */ val SplitButton: typingsSlinky.ejWebAll.ej.Ribbon.Type.SplitButton with Double = js.native
    /* 4 */ val ToggleButton: typingsSlinky.ejWebAll.ej.Ribbon.Type.ToggleButton with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.Type with Double] = js.native
  }
  
}

