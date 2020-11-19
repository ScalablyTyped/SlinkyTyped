package typingsSlinky.jointjs.mod.connectionPoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeConnectionPointArguments extends DefaultConnectionPointArguments {
  
  var stroke: js.UndefOr[Boolean] = js.native
}
object StrokeConnectionPointArguments {
  
  @scala.inline
  def apply(): StrokeConnectionPointArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeConnectionPointArguments]
  }
  
  @scala.inline
  implicit class StrokeConnectionPointArgumentsOps[Self <: StrokeConnectionPointArguments] (val x: Self) extends AnyVal {
    
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
    def setStroke(value: Boolean): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
