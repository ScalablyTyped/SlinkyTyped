package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.TileLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTileLayout extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TileLayout = js.native
  
  /* static member */
  var fn: TileLayout = js.native
}
object TypeofTileLayout {
  
  @scala.inline
  def apply(extend: js.Object => TileLayout, fn: TileLayout): TypeofTileLayout = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTileLayout]
  }
  
  @scala.inline
  implicit class TypeofTileLayoutMutableBuilder[Self <: TypeofTileLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => TileLayout): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: TileLayout): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
