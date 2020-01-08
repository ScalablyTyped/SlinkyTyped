package typingsSlinky.atMaterialSnackbar

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialBase.atMaterialBaseMod.MDCComponent
import typingsSlinky.atMaterialSnackbar.adapterMod.MDCSnackbarAdapter
import typingsSlinky.atMaterialSnackbar.foundationMod.MDCSnackbarData
import typingsSlinky.atMaterialSnackbar.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/snackbar", JSImport.Namespace)
@js.native
object atMaterialSnackbarMod extends js.Object {
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
    val cssClasses: typingsSlinky.atMaterialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typingsSlinky.atMaterialSnackbar.constantsMod.strings = js.native
  }
  
}

