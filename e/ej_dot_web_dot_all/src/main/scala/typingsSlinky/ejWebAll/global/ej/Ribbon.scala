package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Ribbon")
@js.native
class Ribbon protected ()
  extends typingsSlinky.ejWebAll.ej.Ribbon {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Ribbon {
  
  @JSGlobal("ej.Ribbon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Ribbon.AlignType")
  @js.native
  object AlignType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.AlignType with Double] = js.native
    
    /* 1 */ val Columns: typingsSlinky.ejWebAll.ej.Ribbon.AlignType.Columns with Double = js.native
    
    /* 0 */ val Rows: typingsSlinky.ejWebAll.ej.Ribbon.AlignType.Rows with Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.ApplicationTabType")
  @js.native
  object ApplicationTabType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.ApplicationTabType with Double] = js.native
    
    /* 1 */ val Backstage: typingsSlinky.ejWebAll.ej.Ribbon.ApplicationTabType.Backstage with Double = js.native
    
    /* 0 */ val Menu: typingsSlinky.ejWebAll.ej.Ribbon.ApplicationTabType.Menu with Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.CustomItemType")
  @js.native
  object CustomItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.CustomItemType with Double] = js.native
    
    /* 0 */ val Button: typingsSlinky.ejWebAll.ej.Ribbon.CustomItemType.Button with Double = js.native
    
    /* 1 */ val Menu: typingsSlinky.ejWebAll.ej.Ribbon.CustomItemType.Menu with Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.ItemType")
  @js.native
  object ItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.ItemType with Double] = js.native
    
    /* 0 */ val Button: typingsSlinky.ejWebAll.ej.Ribbon.ItemType.Button with Double = js.native
    
    /* 1 */ val Tab: typingsSlinky.ejWebAll.ej.Ribbon.ItemType.Tab with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Ribbon.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Ribbon.QuickAccessMode")
  @js.native
  object QuickAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.QuickAccessMode with Double] = js.native
    
    /* 2 */ val Menu: typingsSlinky.ejWebAll.ej.Ribbon.QuickAccessMode.Menu with Double = js.native
    
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.Ribbon.QuickAccessMode.None with Double = js.native
    
    /* 1 */ val ToolBar: typingsSlinky.ejWebAll.ej.Ribbon.QuickAccessMode.ToolBar with Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Ribbon.Type with Double] = js.native
    
    /* 0 */ val Button: typingsSlinky.ejWebAll.ej.Ribbon.Type.Button with Double = js.native
    
    /* 3 */ val Custom: typingsSlinky.ejWebAll.ej.Ribbon.Type.Custom with Double = js.native
    
    /* 2 */ val DropDownList: typingsSlinky.ejWebAll.ej.Ribbon.Type.DropDownList with Double = js.native
    
    /* 5 */ val Gallery: typingsSlinky.ejWebAll.ej.Ribbon.Type.Gallery with Double = js.native
    
    /* 1 */ val SplitButton: typingsSlinky.ejWebAll.ej.Ribbon.Type.SplitButton with Double = js.native
    
    /* 4 */ val ToggleButton: typingsSlinky.ejWebAll.ej.Ribbon.Type.ToggleButton with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Ribbon.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Ribbon = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Ribbon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
