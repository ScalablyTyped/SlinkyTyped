package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppsResult extends js.Object {
  /**
    *  List of Amplify Apps. 
    */
  var apps: Apps = js.native
  /**
    *  Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a result, then pass its value in here to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAppsResult {
  @scala.inline
  def apply(apps: Apps): ListAppsResult = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsResult]
  }
  @scala.inline
  implicit class ListAppsResultOps[Self <: ListAppsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApps(value: Apps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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

