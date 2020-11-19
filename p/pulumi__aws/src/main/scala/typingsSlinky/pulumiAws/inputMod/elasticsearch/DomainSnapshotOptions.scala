package typingsSlinky.pulumiAws.inputMod.elasticsearch

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainSnapshotOptions extends js.Object {
  
  /**
    * Hour during which the service takes an automated daily
    * snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Input[Double] = js.native
}
object DomainSnapshotOptions {
  
  @scala.inline
  def apply(automatedSnapshotStartHour: Input[Double]): DomainSnapshotOptions = {
    val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSnapshotOptions]
  }
  
  @scala.inline
  implicit class DomainSnapshotOptionsOps[Self <: DomainSnapshotOptions] (val x: Self) extends AnyVal {
    
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
    def setAutomatedSnapshotStartHour(value: Input[Double]): Self = this.set("automatedSnapshotStartHour", value.asInstanceOf[js.Any])
  }
}
