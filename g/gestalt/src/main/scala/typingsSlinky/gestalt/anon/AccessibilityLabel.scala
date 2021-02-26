package typingsSlinky.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityLabel extends StObject {
  
  var accessibilityLabel: String = js.native
  
  def onDismiss(): Unit = js.native
}
object AccessibilityLabel {
  
  @scala.inline
  def apply(accessibilityLabel: String, onDismiss: () => Unit): AccessibilityLabel = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[AccessibilityLabel]
  }
  
  @scala.inline
  implicit class AccessibilityLabelMutableBuilder[Self <: AccessibilityLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
  }
}
