package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  /**
    * A ResourceChange structure that describes the resource and action that AWS CloudFormation will perform.
    */
  var ResourceChange: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceChange] = js.native
  /**
    * The type of entity that AWS CloudFormation changes. Currently, the only entity type is Resource.
    */
  var Type: js.UndefOr[ChangeType] = js.native
}

object Change {
  @scala.inline
  def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceChange(value: ResourceChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceChange")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

