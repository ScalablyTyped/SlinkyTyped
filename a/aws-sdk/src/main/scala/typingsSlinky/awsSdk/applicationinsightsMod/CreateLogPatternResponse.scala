package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogPatternResponse extends js.Object {
  /**
    * The successfully created log pattern.
    */
  var LogPattern: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.LogPattern] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}

object CreateLogPatternResponse {
  @scala.inline
  def apply(): CreateLogPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLogPatternResponse]
  }
  @scala.inline
  implicit class CreateLogPatternResponseOps[Self <: CreateLogPatternResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogPattern(value: LogPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceGroupName(value: ResourceGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(js.undefined)
        ret
    }
  }
  
}

