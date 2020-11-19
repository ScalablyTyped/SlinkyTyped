package typingsSlinky.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromPoint extends js.Object {
  
  var fromPoint: js.UndefOr[Boolean] = js.native
}
object FromPoint {
  
  @scala.inline
  def apply(): FromPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromPoint]
  }
  
  @scala.inline
  implicit class FromPointOps[Self <: FromPoint] (val x: Self) extends AnyVal {
    
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
    def setFromPoint(value: Boolean): Self = this.set("fromPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPoint: Self = this.set("fromPoint", js.undefined)
  }
}
