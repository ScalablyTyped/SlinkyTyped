package typingsSlinky.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostInstanceTypesOutput extends js.Object {
  var InstanceTypes: js.UndefOr[InstanceTypeListDefinition] = js.native
  var NextToken: js.UndefOr[Token] = js.native
  var OutpostArn: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.OutpostArn] = js.native
  var OutpostId: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.OutpostId] = js.native
}

object GetOutpostInstanceTypesOutput {
  @scala.inline
  def apply(): GetOutpostInstanceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutpostInstanceTypesOutput]
  }
  @scala.inline
  implicit class GetOutpostInstanceTypesOutputOps[Self <: GetOutpostInstanceTypesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceTypes(value: InstanceTypeListDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOutpostArn(value: OutpostArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOutpostId(value: OutpostId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostId")(js.undefined)
        ret
    }
  }
  
}

