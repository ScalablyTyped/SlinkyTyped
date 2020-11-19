package typingsSlinky.pulumiAws.queueMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.mediaconvert.QueueReservationPlanSettings
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueArgs extends js.Object {
  
  /**
    * A description of the queue
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique identifier describing the queue
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
    */
  val pricingPlan: js.UndefOr[Input[String]] = js.native
  
  /**
    * A detail pricing plan of the  reserved queue. See below.
    */
  val reservationPlanSettings: js.UndefOr[Input[QueueReservationPlanSettings]] = js.native
  
  /**
    * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object QueueArgs {
  
  @scala.inline
  def apply(): QueueArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueArgs]
  }
  
  @scala.inline
  implicit class QueueArgsOps[Self <: QueueArgs] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPricingPlan(value: Input[String]): Self = this.set("pricingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingPlan: Self = this.set("pricingPlan", js.undefined)
    
    @scala.inline
    def setReservationPlanSettings(value: Input[QueueReservationPlanSettings]): Self = this.set("reservationPlanSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationPlanSettings: Self = this.set("reservationPlanSettings", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
