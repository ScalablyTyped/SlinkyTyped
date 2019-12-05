package typingsSlinky.atMaterialTopDashAppDashBar

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typingsSlinky.atMaterialTopDashAppDashBar.adapterMod.MDCTopAppBarAdapter
import typingsSlinky.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarMod.MDCTopAppBar
import typingsSlinky.atMaterialTopDashAppDashBar.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar", JSImport.Namespace)
@js.native
object atMaterialTopDashAppDashBarMod extends js.Object {
  @js.native
  class MDCFixedTopAppBarFoundation () extends default
  
  @js.native
  class MDCShortTopAppBarFoundation () extends default
  
  @js.native
  class MDCTopAppBar ()
    extends typingsSlinky.atMaterialBase.componentMod.default[
          MDCTopAppBarAdapter, 
          typingsSlinky.atMaterialTopDashAppDashBar.standardFoundationMod.default
        ] {
    def initialize(): Unit = js.native
    def initialize(rippleFactory: js.Function1[/* el */ Element, MDCRipple]): Unit = js.native
  }
  
  @js.native
  class MDCTopAppBarBaseFoundation () extends default
  
  @js.native
  class MDCTopAppBarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): MDCTopAppBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTopAppBarBaseFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTopDashAppDashBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typingsSlinky.atMaterialTopDashAppDashBar.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialTopDashAppDashBar.constantsMod.strings = js.native
  }
  
}

