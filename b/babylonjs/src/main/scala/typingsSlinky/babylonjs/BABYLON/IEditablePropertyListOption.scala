package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditablePropertyListOption extends StObject {
  
  /** label of the option */
  var label: String = js.native
  
  /** value of the option */
  var value: Double = js.native
}
object IEditablePropertyListOption {
  
  @scala.inline
  def apply(label: String, value: Double): IEditablePropertyListOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditablePropertyListOption]
  }
  
  @scala.inline
  implicit class IEditablePropertyListOptionMutableBuilder[Self <: IEditablePropertyListOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
