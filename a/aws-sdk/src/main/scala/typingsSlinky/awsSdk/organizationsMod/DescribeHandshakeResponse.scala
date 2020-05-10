package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHandshakeResponse extends js.Object {
  /**
    * A structure that contains information about the specified handshake.
    */
  var Handshake: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Handshake] = js.native
}

object DescribeHandshakeResponse {
  @scala.inline
  def apply(): DescribeHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHandshakeResponse]
  }
  @scala.inline
  implicit class DescribeHandshakeResponseOps[Self <: DescribeHandshakeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandshake(value: Handshake): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handshake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandshake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handshake")(js.undefined)
        ret
    }
  }
  
}

