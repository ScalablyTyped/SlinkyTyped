package typingsSlinky.materialTopAppBar

import typingsSlinky.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar/foundation", JSImport.Namespace)
@js.native
object materialTopAppBarMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.materialBase.foundationMod.default[MDCTopAppBarAdapter]
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsSlinky.materialTopAppBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typingsSlinky.materialTopAppBar.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialTopAppBar.constantsMod.strings = js.native
  }
  
  type MDCTopAppBarBaseFoundation = typingsSlinky.materialBase.foundationMod.default[MDCTopAppBarAdapter]
}

