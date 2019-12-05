package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialList.adapterMod.MDCListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "list")
@js.native
object list extends js.Object {
  @js.native
  class MDCList protected ()
    extends typingsSlinky.atMaterialList.atMaterialListMod.MDCList {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCListFoundation protected ()
    extends typingsSlinky.atMaterialList.atMaterialListMod.MDCListFoundation {
    def this(adapter: MDCListAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCList extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialList.atMaterialListMod.MDCList = js.native
  }
  
  /* static members */
  @js.native
  object MDCListFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialList.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCListAdapter = js.native
    val strings: typingsSlinky.atMaterialList.constantsMod.strings = js.native
  }
  
}

