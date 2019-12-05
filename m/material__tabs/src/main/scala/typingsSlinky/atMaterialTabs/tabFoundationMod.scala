package typingsSlinky.atMaterialTabs

import typingsSlinky.atMaterialTabs.tabAdapterMod.MDCTabAdapter
import typingsSlinky.atMaterialTabs.tabFoundationMod.MDCTabFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab/foundation", JSImport.Namespace)
@js.native
object tabFoundationMod extends js.Object {
  @js.native
  trait MDCTabFoundation
    extends typingsSlinky.atMaterialBase.foundationMod.default[MDCTabAdapter] {
    def getComputedLeft(): Double = js.native
    def getComputedWidth(): Double = js.native
    def isActive(): Boolean = js.native
    def measureSelf(): Unit = js.native
    def preventsDefaultOnClick(): Boolean = js.native
    def setActive(isActive: Boolean): Unit = js.native
    def setPreventDefaultOnClick(preventDefaultOnClick: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTabs.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsSlinky.atMaterialTabs.tabConstantsMod.strings = js.native
  }
  
}

