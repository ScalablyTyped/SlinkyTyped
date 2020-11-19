package typingsSlinky.iso31662.mod.CountryInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Partial extends js.Object {
  
  var name: String = js.native
  
  var sub: typingsSlinky.iso31662.mod.SubdivisionInfo.Map = js.native
}
object Partial {
  
  @scala.inline
  def apply(name: String, sub: typingsSlinky.iso31662.mod.SubdivisionInfo.Map): Partial = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partial]
  }
  
  @scala.inline
  implicit class PartialOps[Self <: Partial] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub(value: typingsSlinky.iso31662.mod.SubdivisionInfo.Map): Self = this.set("sub", value.asInstanceOf[js.Any])
  }
}
