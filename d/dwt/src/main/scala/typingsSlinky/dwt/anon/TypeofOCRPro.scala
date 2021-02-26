package typingsSlinky.dwt.anon

import typingsSlinky.dwt.addonOCRProMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOCRPro extends StObject {
  
  def NewSettings(): Settings = js.native
}
object TypeofOCRPro {
  
  @scala.inline
  def apply(NewSettings: () => Settings): TypeofOCRPro = {
    val __obj = js.Dynamic.literal(NewSettings = js.Any.fromFunction0(NewSettings))
    __obj.asInstanceOf[TypeofOCRPro]
  }
  
  @scala.inline
  implicit class TypeofOCRProMutableBuilder[Self <: TypeofOCRPro] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewSettings(value: () => Settings): Self = StObject.set(x, "NewSettings", js.Any.fromFunction0(value))
  }
}
