package typingsSlinky.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThenRet extends StObject {
  
  def `else`(y: js.Any): TernaryOperation = js.native
  
  var else_ : TernaryOperation = js.native
  
  def otherwise(y: js.Any): TernaryOperation = js.native
}
object ThenRet {
  
  @scala.inline
  def apply(
    `else`: js.Any => TernaryOperation,
    else_ : TernaryOperation,
    otherwise: js.Any => TernaryOperation
  ): ThenRet = {
    val __obj = js.Dynamic.literal(else_ = else_.asInstanceOf[js.Any], otherwise = js.Any.fromFunction1(otherwise))
    __obj.updateDynamic("else")(js.Any.fromFunction1(`else`))
    __obj.asInstanceOf[ThenRet]
  }
  
  @scala.inline
  implicit class ThenRetMutableBuilder[Self <: ThenRet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElse(value: js.Any => TernaryOperation): Self = StObject.set(x, "else", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElse_(value: TernaryOperation): Self = StObject.set(x, "else_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherwise(value: js.Any => TernaryOperation): Self = StObject.set(x, "otherwise", js.Any.fromFunction1(value))
  }
}
