package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import typingsSlinky.materialTopAppBar.materialTopAppBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "topAppBar")
@js.native
object topAppBar extends js.Object {
  @js.native
  class MDCFixedTopAppBarFoundation () extends default
  
  @js.native
  class MDCShortTopAppBarFoundation () extends default
  
  @js.native
  class MDCTopAppBar ()
    extends typingsSlinky.materialTopAppBar.mod.MDCTopAppBar
  
  @js.native
  class MDCTopAppBarBaseFoundation ()
    extends typingsSlinky.materialTopAppBar.mod.MDCTopAppBarBaseFoundation
  
  @js.native
  class MDCTopAppBarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialTopAppBar.mod.MDCTopAppBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTopAppBarBaseFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialTopAppBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typingsSlinky.materialTopAppBar.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialTopAppBar.constantsMod.strings = js.native
  }
  
}

