package typingsSlinky.reactTable.anon

import typingsSlinky.reactTable.mod.CellValue
import typingsSlinky.reactTable.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[D /* <: js.Object */] extends StObject {
  
  var accessor: js.UndefOr[typingsSlinky.reactTable.mod.Accessor[D] | IdType[D]] = js.native
}
object `1` {
  
  @scala.inline
  def apply[D /* <: js.Object */](): `1`[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[D]]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`[_], D /* <: js.Object */] (val x: Self with `1`[D]) extends AnyVal {
    
    @scala.inline
    def setAccessor(value: typingsSlinky.reactTable.mod.Accessor[D] | IdType[D]): Self = StObject.set(x, "accessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessorFunction3(value: (D, /* index */ Double, /* sub */ Data[D]) => CellValue[js.Any]): Self = StObject.set(x, "accessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
  }
}
