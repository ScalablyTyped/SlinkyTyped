package typingsSlinky.materialSnackbar

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.mod.MDCComponent
import typingsSlinky.materialSnackbar.adapterMod.MDCSnackbarAdapter
import typingsSlinky.materialSnackbar.foundationMod.MDCSnackbarData
import typingsSlinky.materialSnackbar.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/snackbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCSnackbar () extends MDCComponent[MDCSnackbarAdapter, default] {
    var dismissesOnAction: Boolean = js.native
    def show(data: MDCSnackbarData): Unit = js.native
  }
  
  @js.native
  class MDCSnackbarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCSnackbar extends js.Object {
    def attachTo(root: Element): MDCSnackbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typingsSlinky.materialSnackbar.constantsMod.strings = js.native
  }
  
}

