package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensEdit extends StObject {
  
  val data: js.UndefOr[js.typedarray.Uint32Array] = js.native
  
  val deleteCount: Double = js.native
  
  val start: Double = js.native
}
object SemanticTokensEdit {
  
  @scala.inline
  def apply(deleteCount: Double, start: Double): SemanticTokensEdit = {
    val __obj = js.Dynamic.literal(deleteCount = deleteCount.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdit]
  }
  
  @scala.inline
  implicit class SemanticTokensEditMutableBuilder[Self <: SemanticTokensEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.typedarray.Uint32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDeleteCount(value: Double): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
