package typingsSlinky.materialSelect

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialSelect.anon.PartialMDCSelectIconAdapt
import typingsSlinky.materialSelect.iconAdapterMod.MDCSelectIconAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconFoundationMod {
  
  @JSImport("@material/select/icon/foundation", JSImport.Default)
  @js.native
  class default () extends MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  @JSImport("@material/select/icon/foundation", "MDCSelectIconFoundation")
  @js.native
  class MDCSelectIconFoundation () extends MDCFoundation[MDCSelectIconAdapter] {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
    
    def handleInteraction(evt: KeyboardEvent): Unit = js.native
    def handleInteraction(evt: MouseEvent): Unit = js.native
    
    def setAriaLabel(label: String): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
