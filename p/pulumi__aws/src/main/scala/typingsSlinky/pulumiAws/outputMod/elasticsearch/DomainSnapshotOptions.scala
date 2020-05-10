package typingsSlinky.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainSnapshotOptions extends js.Object {
  /**
    * Hour during which the service takes an automated daily
    * snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Double = js.native
}

object DomainSnapshotOptions {
  @scala.inline
  def apply(automatedSnapshotStartHour: Double): DomainSnapshotOptions = {
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
    def withAutomatedSnapshotStartHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedSnapshotStartHour")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

