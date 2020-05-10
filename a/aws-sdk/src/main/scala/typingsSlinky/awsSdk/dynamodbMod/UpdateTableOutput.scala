package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableOutput extends js.Object {
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableDescription] = js.native
}

object UpdateTableOutput {
  @scala.inline
  def apply(): UpdateTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableOutput]
  }
  @scala.inline
  implicit class UpdateTableOutputOps[Self <: UpdateTableOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableDescription(value: TableDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableDescription")(js.undefined)
        ret
    }
  }
  
}

