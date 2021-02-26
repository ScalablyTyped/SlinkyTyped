package typingsSlinky.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedDiff extends StObject {
  
  var hunks: js.Array[Hunk] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var newFileName: js.UndefOr[String] = js.native
  
  var newHeader: js.UndefOr[String] = js.native
  
  var oldFileName: js.UndefOr[String] = js.native
  
  var oldHeader: js.UndefOr[String] = js.native
}
object ParsedDiff {
  
  @scala.inline
  def apply(hunks: js.Array[Hunk]): ParsedDiff = {
    val __obj = js.Dynamic.literal(hunks = hunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDiff]
  }
  
  @scala.inline
  implicit class ParsedDiffMutableBuilder[Self <: ParsedDiff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHunks(value: js.Array[Hunk]): Self = StObject.set(x, "hunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHunksVarargs(value: Hunk*): Self = StObject.set(x, "hunks", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNewFileName(value: String): Self = StObject.set(x, "newFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewFileNameUndefined: Self = StObject.set(x, "newFileName", js.undefined)
    
    @scala.inline
    def setNewHeader(value: String): Self = StObject.set(x, "newHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewHeaderUndefined: Self = StObject.set(x, "newHeader", js.undefined)
    
    @scala.inline
    def setOldFileName(value: String): Self = StObject.set(x, "oldFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldFileNameUndefined: Self = StObject.set(x, "oldFileName", js.undefined)
    
    @scala.inline
    def setOldHeader(value: String): Self = StObject.set(x, "oldHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHeaderUndefined: Self = StObject.set(x, "oldHeader", js.undefined)
  }
}
