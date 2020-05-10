package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeKeyResponse extends js.Object {
  /**
    * Metadata associated with the key.
    */
  var KeyMetadata: js.UndefOr[typingsSlinky.awsSdk.kmsMod.KeyMetadata] = js.native
}

object DescribeKeyResponse {
  @scala.inline
  def apply(): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyResponse]
  }
  @scala.inline
  implicit class DescribeKeyResponseOps[Self <: DescribeKeyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyMetadata(value: KeyMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMetadata")(js.undefined)
        ret
    }
  }
  
}

