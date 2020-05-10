package typingsSlinky.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionOutput extends js.Object {
  /**
    * The connection details, such as status, owner, and provider type.
    */
  var Connection: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.Connection] = js.native
}

object GetConnectionOutput {
  @scala.inline
  def apply(): GetConnectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionOutput]
  }
  @scala.inline
  implicit class GetConnectionOutputOps[Self <: GetConnectionOutput] (val x: Self) extends AnyVal {
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

