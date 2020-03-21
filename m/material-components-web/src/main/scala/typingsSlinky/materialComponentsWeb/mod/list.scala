package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialList.adapterMod.MDCListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "list")
@js.native
object list extends js.Object {
  @js.native
  class MDCList protected ()
    extends typingsSlinky.materialList.mod.MDCList {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCListFoundation protected ()
    extends typingsSlinky.materialList.mod.MDCListFoundation {
    def this(adapter: MDCListAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCList extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialList.mod.MDCList = js.native
  }
  
  /* static members */
  @js.native
  object MDCListFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialList.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCListAdapter = js.native
    val strings: typingsSlinky.materialList.constantsMod.strings = js.native
  }
  
}

