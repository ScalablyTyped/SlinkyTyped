package typingsSlinky.reactPopper.anon

import typingsSlinky.reactPopper.mod.StrictModifierNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[Name /* <: StrictModifierNames */] extends js.Object {
  
  var name: js.UndefOr[Name] = js.native
}
object `0` {
  
  @scala.inline
  def apply[Name /* <: StrictModifierNames */](): `0`[Name] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[Name]]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], Name /* <: StrictModifierNames */] (val x: Self with `0`[Name]) extends AnyVal {
    
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
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
