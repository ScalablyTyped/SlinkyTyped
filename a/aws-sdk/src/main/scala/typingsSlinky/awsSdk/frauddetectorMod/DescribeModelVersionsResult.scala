package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelVersionsResult extends js.Object {
  /**
    * The model version details.
    */
  var modelVersionDetails: js.UndefOr[ModelVersionDetailList] = js.native
  /**
    * The next token.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeModelVersionsResult {
  @scala.inline
  def apply(): DescribeModelVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeModelVersionsResult]
  }
  @scala.inline
  implicit class DescribeModelVersionsResultOps[Self <: DescribeModelVersionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelVersionDetails(value: ModelVersionDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVersionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

