package typingsSlinky.reactNavigationCore.anon

import typingsSlinky.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `9`[EventName /* <: Extract[/* keyof {} */ String, String] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any = js.native
}
object `9` {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof {} */ String, String] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ): `9`[EventName] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`[EventName]]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`[_], EventName /* <: Extract[/* keyof {} */ String, String] */] (val x: Self with `9`[EventName]) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
