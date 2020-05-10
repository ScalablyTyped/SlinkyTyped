package typingsSlinky.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.awsLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionElicitSlot
  extends LexDialogActionBase
     with LexDialogAction {
  var intentName: String = js.native
  var slotToElicit: String = js.native
  var slots: StringDictionary[String | Null] = js.native
  @JSName("type")
  var type_LexDialogActionElicitSlot: ElicitSlot = js.native
}

object LexDialogActionElicitSlot {
  @scala.inline
  def apply(
    intentName: String,
    slotToElicit: String,
    slots: StringDictionary[String | Null],
    `type`: ElicitSlot
  ): LexDialogActionElicitSlot = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionElicitSlot]
  }
  @scala.inline
  implicit class LexDialogActionElicitSlotOps[Self <: LexDialogActionElicitSlot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotToElicit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotToElicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlots(value: StringDictionary[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ElicitSlot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

