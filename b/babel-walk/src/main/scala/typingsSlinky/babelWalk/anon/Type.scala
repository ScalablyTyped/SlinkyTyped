package typingsSlinky.babelWalk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[`type` /* <: String */] extends js.Object {
  
  var `type`: `type` = js.native
}
object Type {
  
  @scala.inline
  def apply[`type` /* <: String */](`type`: `type`): Type[`type`] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[`type`]]
  }
  
  @scala.inline
  implicit class TypeOps[Self <: Type[_], `type` /* <: String */] (val x: Self with Type[`type`]) extends AnyVal {
    
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
    def setType(value: `type`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
