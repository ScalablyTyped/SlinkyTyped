package typingsSlinky.googleMapReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nw extends js.Object {
  
  var nw: typingsSlinky.googleMapReact.mod.Coords = js.native
  
  var se: typingsSlinky.googleMapReact.mod.Coords = js.native
}
object Nw {
  
  @scala.inline
  def apply(nw: typingsSlinky.googleMapReact.mod.Coords, se: typingsSlinky.googleMapReact.mod.Coords): Nw = {
    val __obj = js.Dynamic.literal(nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nw]
  }
  
  @scala.inline
  implicit class NwOps[Self <: Nw] (val x: Self) extends AnyVal {
    
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
    def setNw(value: typingsSlinky.googleMapReact.mod.Coords): Self = this.set("nw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSe(value: typingsSlinky.googleMapReact.mod.Coords): Self = this.set("se", value.asInstanceOf[js.Any])
  }
}
