package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Controls
@js.native
trait ICustomControlOption extends StObject {
  
  var label: String = js.native
  
  var value: String = js.native
}
object ICustomControlOption {
  
  @scala.inline
  def apply(label: String, value: String): ICustomControlOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomControlOption]
  }
  
  @scala.inline
  implicit class ICustomControlOptionMutableBuilder[Self <: ICustomControlOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
