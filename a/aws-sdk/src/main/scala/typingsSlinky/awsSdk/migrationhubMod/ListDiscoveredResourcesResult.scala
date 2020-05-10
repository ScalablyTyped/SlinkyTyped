package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoveredResourcesResult extends js.Object {
  /**
    * Returned list of discovered resources associated with the given MigrationTask.
    */
  var DiscoveredResourceList: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.DiscoveredResourceList] = js.native
  /**
    * If there are more discovered resources than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListDiscoveredResourcesResult {
  @scala.inline
  def apply(): ListDiscoveredResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveredResourcesResult]
  }
  @scala.inline
  implicit class ListDiscoveredResourcesResultOps[Self <: ListDiscoveredResourcesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscoveredResourceList(value: DiscoveredResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscoveredResourceList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscoveredResourceList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscoveredResourceList")(js.undefined)
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
  }
  
}

