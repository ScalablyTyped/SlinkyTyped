package typingsSlinky.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOutpostOutput extends js.Object {
  
  var Outpost: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.Outpost] = js.native
}
object GetOutpostOutput {
  
  @scala.inline
  def apply(): GetOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutpostOutput]
  }
  
  @scala.inline
  implicit class GetOutpostOutputOps[Self <: GetOutpostOutput] (val x: Self) extends AnyVal {
    
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
    def setOutpost(value: Outpost): Self = this.set("Outpost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpost: Self = this.set("Outpost", js.undefined)
  }
}
