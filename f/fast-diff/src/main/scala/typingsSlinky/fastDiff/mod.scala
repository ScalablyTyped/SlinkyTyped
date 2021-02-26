package typingsSlinky.fastDiff

import typingsSlinky.fastDiff.anon.Index
import typingsSlinky.fastDiff.fastDiffNumbers.`-1`
import typingsSlinky.fastDiff.fastDiffNumbers.`0`
import typingsSlinky.fastDiff.fastDiffNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-diff", JSImport.Namespace)
  @js.native
  def apply(text1: String, text2: String): js.Array[Diff] = js.native
  @JSImport("fast-diff", JSImport.Namespace)
  @js.native
  def apply(text1: String, text2: String, cursorPos: Double): js.Array[Diff] = js.native
  @JSImport("fast-diff", JSImport.Namespace)
  @js.native
  def apply(text1: String, text2: String, cursorPos: CursorInfo): js.Array[Diff] = js.native
  
  @JSImport("fast-diff", "DELETE")
  @js.native
  val DELETE: `-1` = js.native
  
  @JSImport("fast-diff", "EQUAL")
  @js.native
  val EQUAL: `0` = js.native
  
  @JSImport("fast-diff", "INSERT")
  @js.native
  val INSERT: `1` = js.native
  
  @js.native
  trait CursorInfo extends StObject {
    
    var newRange: Index = js.native
    
    var oldRange: Index = js.native
  }
  object CursorInfo {
    
    @scala.inline
    def apply(newRange: Index, oldRange: Index): CursorInfo = {
      val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorInfo]
    }
    
    @scala.inline
    implicit class CursorInfoMutableBuilder[Self <: CursorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewRange(value: Index): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldRange(value: Index): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    }
  }
  
  type Diff = js.Tuple2[`-1` | `0` | `1`, String]
}
