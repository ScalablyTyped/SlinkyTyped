package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialRadio.adapterMod.MDCRadioAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "radio")
@js.native
object radio extends js.Object {
  @js.native
  class MDCRadio ()
    extends typingsSlinky.atMaterialRadio.atMaterialRadioMod.MDCRadio
  
  @js.native
  class MDCRadioFoundation ()
    extends typingsSlinky.atMaterialRadio.atMaterialRadioMod.MDCRadioFoundation
  
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialRadio.atMaterialRadioMod.MDCRadio = js.native
  }
  
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialRadio.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRadioAdapter = js.native
    val strings: typingsSlinky.atMaterialRadio.constantsMod.strings = js.native
  }
  
}

