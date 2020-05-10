package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNamedQueryOutput extends js.Object {
  /**
    * The unique ID of the query.
    */
  var NamedQueryId: js.UndefOr[typingsSlinky.awsSdk.athenaMod.NamedQueryId] = js.native
}

object CreateNamedQueryOutput {
  @scala.inline
  def apply(): CreateNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamedQueryOutput]
  }
  @scala.inline
  implicit class CreateNamedQueryOutputOps[Self <: CreateNamedQueryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedQueryId(value: NamedQueryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedQueryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueryId")(js.undefined)
        ret
    }
  }
  
}

