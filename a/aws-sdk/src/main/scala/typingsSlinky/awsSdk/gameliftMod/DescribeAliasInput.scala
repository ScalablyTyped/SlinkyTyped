package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAliasInput extends js.Object {
  /**
    * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN value. 
    */
  var AliasId: typingsSlinky.awsSdk.gameliftMod.AliasId = js.native
}

object DescribeAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): DescribeAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAliasInput]
  }
  @scala.inline
  implicit class DescribeAliasInputOps[Self <: DescribeAliasInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasId(value: AliasId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

