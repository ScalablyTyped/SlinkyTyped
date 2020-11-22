package typingsSlinky.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainSnapshotOption extends js.Object {
  
  /**
    * Hour during which the service takes an automated daily snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Double = js.native
}
object GetDomainSnapshotOption {
  
  @scala.inline
  def apply(automatedSnapshotStartHour: Double): GetDomainSnapshotOption = {
    val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainSnapshotOption]
  }
  
  @scala.inline
  implicit class GetDomainSnapshotOptionOps[Self <: GetDomainSnapshotOption] (val x: Self) extends AnyVal {
    
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
    def setAutomatedSnapshotStartHour(value: Double): Self = this.set("automatedSnapshotStartHour", value.asInstanceOf[js.Any])
  }
}
