package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTableOutput extends js.Object {
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
}

object DeleteTableOutput {
  @scala.inline
  def apply(): DeleteTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableOutput]
  }
  @scala.inline
  implicit class DeleteTableOutputOps[Self <: DeleteTableOutput] (val x: Self) extends AnyVal {
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

