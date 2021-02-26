package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.modal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overlay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.push
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoDismiss extends StObject {
  
  var autoDismiss: js.UndefOr[focusLoss | none] = js.native
  
  var content: String = js.native
  
  var displayMode: js.UndefOr[push | overlay] = js.native
  
  var edge: js.UndefOr[start | end | top | bottom] = js.native
  
  var modality: js.UndefOr[modal | modeless] = js.native
  
  var selector: String = js.native
  
  var size: js.UndefOr[String] = js.native
}
object AutoDismiss {
  
  @scala.inline
  def apply(content: String, selector: String): AutoDismiss = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDismiss]
  }
  
  @scala.inline
  implicit class AutoDismissMutableBuilder[Self <: AutoDismiss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDismiss(value: focusLoss | none): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMode(value: push | overlay): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    @scala.inline
    def setEdge(value: start | end | top | bottom): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    @scala.inline
    def setModality(value: modal | modeless): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
