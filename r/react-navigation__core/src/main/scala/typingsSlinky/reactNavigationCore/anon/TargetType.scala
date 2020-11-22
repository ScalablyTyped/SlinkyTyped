package typingsSlinky.reactNavigationCore.anon

import typingsSlinky.reactNavigationCore.typesMod.EventMapBase
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetType[EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */] extends js.Object {
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: EventName = js.native
}
object TargetType {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */](`type`: EventName): TargetType[EventName, EventMap] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetType[EventName, EventMap]]
  }
  
  @scala.inline
  implicit class TargetTypeOps[Self <: TargetType[_, _], EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */] (val x: Self with (TargetType[EventName, EventMap])) extends AnyVal {
    
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
    def setType(value: EventName): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
