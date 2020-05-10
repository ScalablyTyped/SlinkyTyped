package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to check entries against lists.
  */
@js.native
trait SchemaFindThreatMatchesRequest extends js.Object {
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The lists and entries to be checked for matches.
    */
  var threatInfo: js.UndefOr[SchemaThreatInfo] = js.native
}

object SchemaFindThreatMatchesRequest {
  @scala.inline
  def apply(): SchemaFindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindThreatMatchesRequest]
  }
  @scala.inline
  implicit class SchemaFindThreatMatchesRequestOps[Self <: SchemaFindThreatMatchesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: SchemaClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatInfo(value: SchemaThreatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatInfo")(js.undefined)
        ret
    }
  }
  
}

