package typingsSlinky.materialToolbar

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialToolbar.adapterMod.MDCToolbarAdapter
import typingsSlinky.materialToolbar.anon.CHANGEEVENT
import typingsSlinky.materialToolbar.anon.FIXED
import typingsSlinky.materialToolbar.anon.MAXTITLESIZE
import typingsSlinky.materialToolbar.anon.PartialMDCToolbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/toolbar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCToolbarFoundation () extends MDCFoundation[MDCToolbarAdapter] {
    def this(adapter: PartialMDCToolbarAdapter) = this()
    
    def updateAdjustElementStyles(): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCToolbarFoundation extends js.Object {
    
    val cssClasses: FIXED = js.native
    
    val defaultAdapter: MDCToolbarAdapter = js.native
    
    val numbers: MAXTITLESIZE = js.native
    
    val strings: CHANGEEVENT = js.native
  }
  
  @js.native
  class default () extends MDCToolbarFoundation {
    def this(adapter: PartialMDCToolbarAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    val cssClasses: FIXED = js.native
    
    val defaultAdapter: MDCToolbarAdapter = js.native
    
    val numbers: MAXTITLESIZE = js.native
    
    val strings: CHANGEEVENT = js.native
  }
}
