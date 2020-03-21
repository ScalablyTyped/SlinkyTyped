package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.beanStubMod.BeanStub
import typingsSlinky.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/hoverFeature", JSImport.Namespace)
@js.native
object hoverFeatureMod extends js.Object {
  @js.native
  class HoverFeature protected () extends BeanStub {
    def this(columns: js.Array[Column], element: HTMLElement) = this()
    var columnHoverService: js.Any = js.native
    var columns: js.Any = js.native
    /* private */ def addMouseHoverListeners(element: js.Any): js.Any = js.native
    /* private */ def onMouseOut(): js.Any = js.native
    /* private */ def onMouseOver(): js.Any = js.native
  }
  
}

