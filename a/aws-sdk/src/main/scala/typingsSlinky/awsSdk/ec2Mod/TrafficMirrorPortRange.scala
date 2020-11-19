package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficMirrorPortRange extends js.Object {
  
  /**
    * The start of the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  
  /**
    * The end of the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}
object TrafficMirrorPortRange {
  
  @scala.inline
  def apply(): TrafficMirrorPortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorPortRange]
  }
  
  @scala.inline
  implicit class TrafficMirrorPortRangeOps[Self <: TrafficMirrorPortRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromPort(value: Integer): Self = this.set("FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPort: Self = this.set("FromPort", js.undefined)
    
    @scala.inline
    def setToPort(value: Integer): Self = this.set("ToPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPort: Self = this.set("ToPort", js.undefined)
  }
}
