package typingsSlinky.atMaterialGridDashList

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialBase.atMaterialBaseMod.MDCComponent
import typingsSlinky.atMaterialGridDashList.adapterMod.MDCGridListAdapter
import typingsSlinky.atMaterialGridDashList.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/grid-list", JSImport.Namespace)
@js.native
object atMaterialGridDashListMod extends js.Object {
  @js.native
  class MDCGridList () extends MDCComponent[MDCGridListAdapter, default]
  
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
    val strings: typingsSlinky.atMaterialGridDashList.constantsMod.strings = js.native
  }
  
}

