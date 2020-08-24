package typingsSlinky.materialGridList

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.mod.MDCComponent
import typingsSlinky.materialGridList.adapterMod.MDCGridListAdapter
import typingsSlinky.materialGridList.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/grid-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCGridList () extends MDCComponent[MDCGridListAdapter]
  
  @js.native
  class MDCGridListFoundation () extends default
  
  /* static members */
  @js.native
  object MDCGridList extends js.Object {
    def attachTo(root: Element): MDCGridList = js.native
  }
  
  /* static members */
  @js.native
  object MDCGridListFoundation extends js.Object {
    val defaultAdapter: MDCGridListAdapter = js.native
    val strings: typingsSlinky.materialGridList.constantsMod.strings = js.native
  }
  
}

