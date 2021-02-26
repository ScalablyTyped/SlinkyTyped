package typingsSlinky.rcTable.interfaceMod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderedCell[RecordType] extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var props: js.UndefOr[CellType[RecordType]] = js.native
}
object RenderedCell {
  
  @scala.inline
  def apply[RecordType](): RenderedCell[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderedCell[RecordType]]
  }
  
  @scala.inline
  implicit class RenderedCellMutableBuilder[Self <: RenderedCell[_], RecordType] (val x: Self with RenderedCell[RecordType]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setProps(value: CellType[RecordType]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
