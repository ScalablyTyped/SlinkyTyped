package typingsSlinky.reactNavigationCore.anon

import typingsSlinky.reactNavigationCore.typesMod.EventMapBase
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4`[EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */] extends js.Object {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any = js.native
}
object `4` {
  
  @scala.inline
  def apply[EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ): `4`[EventMap, EventName] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`[EventMap, EventName]]
  }
  
  @scala.inline
  implicit class `4Ops`[Self <: `4`[_, _], EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */] (val x: Self with (`4`[EventMap, EventName])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
