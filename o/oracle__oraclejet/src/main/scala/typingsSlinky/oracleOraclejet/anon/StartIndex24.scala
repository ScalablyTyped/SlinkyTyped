package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartIndex24[K] extends RowSelectionStart[K] {
  
  var startIndex: `24` = js.native
  
  var startKey: js.UndefOr[`25`[K]] = js.native
}
object StartIndex24 {
  
  @scala.inline
  def apply[K](startIndex: `24`): StartIndex24[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndex24[K]]
  }
  
  @scala.inline
  implicit class StartIndex24MutableBuilder[Self <: StartIndex24[_], K] (val x: Self with StartIndex24[K]) extends AnyVal {
    
    @scala.inline
    def setStartIndex(value: `24`): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartKey(value: `25`[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
  }
}
