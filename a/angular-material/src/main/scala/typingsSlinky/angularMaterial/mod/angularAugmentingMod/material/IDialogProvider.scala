package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import typingsSlinky.angularMaterial.anon.Methods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogProvider extends StObject {
  
  def addPreset(presetName: String, presetOptions: Methods): IDialogProvider = js.native
}
object IDialogProvider {
  
  @scala.inline
  def apply(addPreset: (String, Methods) => IDialogProvider): IDialogProvider = {
    val __obj = js.Dynamic.literal(addPreset = js.Any.fromFunction2(addPreset))
    __obj.asInstanceOf[IDialogProvider]
  }
  
  @scala.inline
  implicit class IDialogProviderMutableBuilder[Self <: IDialogProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddPreset(value: (String, Methods) => IDialogProvider): Self = StObject.set(x, "addPreset", js.Any.fromFunction2(value))
  }
}
