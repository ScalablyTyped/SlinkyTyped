package typingsSlinky.pulumiAws.outputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTargetKinesisTarget extends js.Object {
  
  /**
    * The JSON path to be extracted from the event and used as the partition key.
    */
  var partitionKeyPath: js.UndefOr[String] = js.native
}
object EventTargetKinesisTarget {
  
  @scala.inline
  def apply(): EventTargetKinesisTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTargetKinesisTarget]
  }
  
  @scala.inline
  implicit class EventTargetKinesisTargetOps[Self <: EventTargetKinesisTarget] (val x: Self) extends AnyVal {
    
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
    def setPartitionKeyPath(value: String): Self = this.set("partitionKeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionKeyPath: Self = this.set("partitionKeyPath", js.undefined)
  }
}
