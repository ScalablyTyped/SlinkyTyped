package typingsSlinky.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTrackingHeapObjectsParameterType extends js.Object {
  
  var trackAllocations: js.UndefOr[Boolean] = js.native
}
object StartTrackingHeapObjectsParameterType {
  
  @scala.inline
  def apply(): StartTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTrackingHeapObjectsParameterType]
  }
  
  @scala.inline
  implicit class StartTrackingHeapObjectsParameterTypeOps[Self <: StartTrackingHeapObjectsParameterType] (val x: Self) extends AnyVal {
    
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
    def setTrackAllocations(value: Boolean): Self = this.set("trackAllocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackAllocations: Self = this.set("trackAllocations", js.undefined)
  }
}
