package typingsSlinky.atMaterialToolbar

import typingsSlinky.atMaterialToolbar.adapterMod.MDCToolbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCToolbarFoundation
    extends typingsSlinky.atMaterialBase.foundationMod.default[MDCToolbarAdapter] {
    def updateAdjustElementStyles(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCToolbarFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsSlinky.atMaterialToolbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    val numbers: typingsSlinky.atMaterialToolbar.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialToolbar.constantsMod.strings = js.native
  }
  
}

