package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISignaturePromptInfoSelectable extends StObject {
  
  def Clone(): ISignaturePromptInfoSelectable = js.native
  
  var PromptInfos: ISignaturePromptInfos = js.native
}
object ISignaturePromptInfoSelectable {
  
  @scala.inline
  def apply(Clone: () => ISignaturePromptInfoSelectable, PromptInfos: ISignaturePromptInfos): ISignaturePromptInfoSelectable = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PromptInfos = PromptInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfoSelectable]
  }
  
  @scala.inline
  implicit class ISignaturePromptInfoSelectableMutableBuilder[Self <: ISignaturePromptInfoSelectable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ISignaturePromptInfoSelectable): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPromptInfos(value: ISignaturePromptInfos): Self = StObject.set(x, "PromptInfos", value.asInstanceOf[js.Any])
  }
}
