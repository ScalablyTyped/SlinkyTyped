package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialSelect.adapterMod.MDCSelectAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "select")
@js.native
object select extends js.Object {
  @js.native
  class MDCSelect ()
    extends typingsSlinky.atMaterialSelect.atMaterialSelectMod.MDCSelect
  
  @js.native
  class MDCSelectFoundation ()
    extends typingsSlinky.atMaterialSelect.atMaterialSelectMod.MDCSelectFoundation
  
  /* static members */
  @js.native
  object MDCSelect extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialSelect.atMaterialSelectMod.MDCSelect = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialSelect.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSelectAdapter = js.native
    val strings: typingsSlinky.atMaterialSelect.constantsMod.strings = js.native
  }
  
}

