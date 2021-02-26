package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.FileExplorer")
@js.native
class FileExplorer protected ()
  extends typingsSlinky.ejWebAll.ej.FileExplorer {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object FileExplorer {
  
  @JSGlobal("ej.FileExplorer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.FileExplorer.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.FileExplorer.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.FileExplorer = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.FileExplorer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.FileExplorer.layoutType")
  @js.native
  object layoutType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.FileExplorer.layoutType with Double] = js.native
    
    /* 1 */ val Grid: typingsSlinky.ejWebAll.ej.FileExplorer.layoutType.Grid with Double = js.native
    
    /* 2 */ val LargeIcons: typingsSlinky.ejWebAll.ej.FileExplorer.layoutType.LargeIcons with Double = js.native
    
    /* 0 */ val Tile: typingsSlinky.ejWebAll.ej.FileExplorer.layoutType.Tile with Double = js.native
  }
}
