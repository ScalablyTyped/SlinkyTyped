package typingsSlinky.pulumiAws.logDestinationPolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogDestinationPolicyState extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * A name for the subscription filter
    */
  val destinationName: js.UndefOr[Input[String]] = js.native
}

object LogDestinationPolicyState {
  @scala.inline
  def apply(): LogDestinationPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDestinationPolicyState]
  }
  @scala.inline
  implicit class LogDestinationPolicyStateOps[Self <: LogDestinationPolicyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(js.undefined)
        ret
    }
  }
  
}

