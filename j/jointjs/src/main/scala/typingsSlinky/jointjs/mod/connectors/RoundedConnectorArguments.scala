package typingsSlinky.jointjs.mod.connectors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoundedConnectorArguments extends js.Object {
  
  var radius: js.UndefOr[Double] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
}
object RoundedConnectorArguments {
  
  @scala.inline
  def apply(): RoundedConnectorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundedConnectorArguments]
  }
  
  @scala.inline
  implicit class RoundedConnectorArgumentsOps[Self <: RoundedConnectorArguments] (val x: Self) extends AnyVal {
    
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
