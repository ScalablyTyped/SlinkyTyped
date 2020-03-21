package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialRadio.adapterMod.MDCRadioAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "radio")
@js.native
object radio extends js.Object {
  @js.native
  class MDCRadio ()
    extends typingsSlinky.materialRadio.mod.MDCRadio
  
  @js.native
  class MDCRadioFoundation ()
    extends typingsSlinky.materialRadio.mod.MDCRadioFoundation
  
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialRadio.mod.MDCRadio = js.native
  }
  
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialRadio.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRadioAdapter = js.native
    val strings: typingsSlinky.materialRadio.constantsMod.strings = js.native
  }
  
}

