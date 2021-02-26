package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorList extends StObject {
  
  var errorList: ReactElement = js.native
  
  var extra: ReactElement | Null = js.native
  
  var input: ReactElement = js.native
}
object ErrorList {
  
  @scala.inline
  def apply(errorList: ReactElement, input: ReactElement): ErrorList = {
    val __obj = js.Dynamic.literal(errorList = errorList.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorList]
  }
  
  @scala.inline
  implicit class ErrorListMutableBuilder[Self <: ErrorList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorList(value: ReactElement): Self = StObject.set(x, "errorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraNull: Self = StObject.set(x, "extra", null)
    
    @scala.inline
    def setInput(value: ReactElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
