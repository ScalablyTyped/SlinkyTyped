package typingsSlinky.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRawQuery extends StObject {
  
  def ModifyWhere(): IRawQueryModify = js.native
  
  /** Change Where clause */
  def ReplaceWhere(): IFieldExpression = js.native
}
object IRawQuery {
  
  @scala.inline
  def apply(ModifyWhere: () => IRawQueryModify, ReplaceWhere: () => IFieldExpression): IRawQuery = {
    val __obj = js.Dynamic.literal(ModifyWhere = js.Any.fromFunction0(ModifyWhere), ReplaceWhere = js.Any.fromFunction0(ReplaceWhere))
    __obj.asInstanceOf[IRawQuery]
  }
  
  @scala.inline
  implicit class IRawQueryMutableBuilder[Self <: IRawQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifyWhere(value: () => IRawQueryModify): Self = StObject.set(x, "ModifyWhere", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceWhere(value: () => IFieldExpression): Self = StObject.set(x, "ReplaceWhere", js.Any.fromFunction0(value))
  }
}
