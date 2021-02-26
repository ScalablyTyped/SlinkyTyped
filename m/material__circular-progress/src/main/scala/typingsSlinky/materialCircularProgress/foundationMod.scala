package typingsSlinky.materialCircularProgress

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialCircularProgress.adapterMod.MDCCircularProgressAdapter
import typingsSlinky.materialCircularProgress.anon.PartialMDCCircularProgres
import typingsSlinky.materialProgressIndicator.foundationMod.MDCProgressIndicatorFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/circular-progress/foundation", JSImport.Default)
  @js.native
  class default () extends MDCCircularProgressFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
  }
  
  @JSImport("@material/circular-progress/foundation", "MDCCircularProgressFoundation")
  @js.native
  class MDCCircularProgressFoundation ()
    extends MDCFoundation[MDCCircularProgressAdapter]
       with MDCProgressIndicatorFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
    
    def getProgress(): Double = js.native
    
    /**
      * @return Returns whether the progress indicator is hidden.
      */
    def isClosed(): Boolean = js.native
    
    def isDeterminate(): Boolean = js.native
  }
}
