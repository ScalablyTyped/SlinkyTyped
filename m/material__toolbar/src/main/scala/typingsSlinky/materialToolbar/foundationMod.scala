package typingsSlinky.materialToolbar

import typingsSlinky.materialToolbar.adapterMod.MDCToolbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/toolbar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  trait MDCToolbarFoundation
    extends typingsSlinky.materialBase.foundationMod.default[MDCToolbarAdapter] {
    
    def updateAdjustElementStyles(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCToolbarFoundation
  /* static members */
  @js.native
  object default extends js.Object {
    
    val cssClasses: typingsSlinky.materialToolbar.constantsMod.cssClasses = js.native
    
    val defaultAdapter: MDCToolbarAdapter = js.native
    
    val numbers: typingsSlinky.materialToolbar.constantsMod.numbers = js.native
    
    val strings: typingsSlinky.materialToolbar.constantsMod.strings = js.native
  }
}
