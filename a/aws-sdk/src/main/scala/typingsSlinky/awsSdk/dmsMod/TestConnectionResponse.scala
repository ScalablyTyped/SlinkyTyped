package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestConnectionResponse extends js.Object {
  /**
    * The connection tested.
    */
  var Connection: js.UndefOr[typingsSlinky.awsSdk.dmsMod.Connection] = js.native
}

object TestConnectionResponse {
  @scala.inline
  def apply(): TestConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestConnectionResponse]
  }
  @scala.inline
  implicit class TestConnectionResponseOps[Self <: TestConnectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connection")(js.undefined)
        ret
    }
  }
  
}

