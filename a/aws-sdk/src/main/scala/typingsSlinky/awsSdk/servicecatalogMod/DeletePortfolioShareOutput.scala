package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePortfolioShareOutput extends js.Object {
  /**
    * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
}

object DeletePortfolioShareOutput {
  @scala.inline
  def apply(): DeletePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePortfolioShareOutput]
  }
  @scala.inline
  implicit class DeletePortfolioShareOutputOps[Self <: DeletePortfolioShareOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortfolioShareToken(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioShareToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortfolioShareToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioShareToken")(js.undefined)
        ret
    }
  }
  
}

