package typingsSlinky.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slice extends StObject {
  
  var slice: js.UndefOr[typingsSlinky.flexmonster.mod.Slice] = js.native
}
object Slice {
  
  @scala.inline
  def apply(): Slice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slice]
  }
  
  @scala.inline
  implicit class SliceMutableBuilder[Self <: Slice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlice(value: typingsSlinky.flexmonster.mod.Slice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
  }
}
