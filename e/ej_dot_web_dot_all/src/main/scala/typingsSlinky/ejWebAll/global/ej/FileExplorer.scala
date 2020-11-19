package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.FileExplorer")
@js.native
class FileExplorer protected ()
  extends typingsSlinky.ejWebAll.ej.FileExplorer {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.FileExplorer.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.FileExplorer.Model) = this()
}
/* static members */
@JSGlobal("ej.FileExplorer")
@js.native
object FileExplorer extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.FileExplorer = js.native
  
  @js.native
  object layoutType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.FileExplorer.layoutType with Double] = js.native
    
    /* 1 */ val Grid: typingsSlinky.ejWebAll.ej.FileExplorer.layoutType.Grid with Double = js.native
    
    /* 2 */ val LargeIcons: typingsSlinky.ejWebAll.ej.FileExplorer.layoutType.LargeIcons with Double = js.native
    
    /* 0 */ val Tile: typingsSlinky.ejWebAll.ej.FileExplorer.layoutType.Tile with Double = js.native
  }
}
