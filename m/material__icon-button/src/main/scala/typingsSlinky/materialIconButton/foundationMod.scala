package typingsSlinky.materialIconButton

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialIconButton.adapterMod.MDCIconButtonToggleAdapter
import typingsSlinky.materialIconButton.anon.ARIAPRESSED
import typingsSlinky.materialIconButton.anon.ICONBUTTONON
import typingsSlinky.materialIconButton.anon.PartialMDCIconButtonToggl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-button/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCIconButtonToggleFoundation () extends MDCFoundation[MDCIconButtonToggleAdapter] {
    def this(adapter: PartialMDCIconButtonToggl) = this()
    def handleClick(): Unit = js.native
    def isOn(): Boolean = js.native
    def toggle(): Unit = js.native
    def toggle(isOn: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggleFoundation extends js.Object {
    val cssClasses: ICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: ARIAPRESSED = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: ICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: ARIAPRESSED = js.native
  }
  
}

