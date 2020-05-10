package typingsSlinky.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSitesOutput extends js.Object {
  var NextToken: js.UndefOr[Token] = js.native
  var Sites: js.UndefOr[siteListDefinition] = js.native
}

object ListSitesOutput {
  @scala.inline
  def apply(): ListSitesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSitesOutput]
  }
  @scala.inline
  implicit class ListSitesOutputOps[Self <: ListSitesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSites(value: siteListDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sites")(js.undefined)
        ret
    }
  }
  
}

