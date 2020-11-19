package typingsSlinky.awsSdk.iotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteThingShadowRequest extends js.Object {
  
  /**
    * The name of the shadow.
    */
  var shadowName: js.UndefOr[ShadowName] = js.native
  
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}
object DeleteThingShadowRequest {
  
  @scala.inline
  def apply(thingName: ThingName): DeleteThingShadowRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingShadowRequest]
  }
  
  @scala.inline
  implicit class DeleteThingShadowRequestOps[Self <: DeleteThingShadowRequest] (val x: Self) extends AnyVal {
    
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
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowName(value: ShadowName): Self = this.set("shadowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowName: Self = this.set("shadowName", js.undefined)
  }
}
