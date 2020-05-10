package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaybeStatementResource extends js.Object {
  var NotResource: js.UndefOr[String | js.Array[String]] = js.native
  var Resource: js.UndefOr[String | js.Array[String]] = js.native
}

object MaybeStatementResource {
  @scala.inline
  def apply(): MaybeStatementResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeStatementResource]
  }
  @scala.inline
  implicit class MaybeStatementResourceOps[Self <: MaybeStatementResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotResource(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotResource")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(js.undefined)
        ret
    }
  }
  
}

