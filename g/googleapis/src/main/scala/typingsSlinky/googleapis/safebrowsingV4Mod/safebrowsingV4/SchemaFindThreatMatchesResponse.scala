package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFindThreatMatchesResponse extends js.Object {
  /**
    * The threat list matches.
    */
  var matches: js.UndefOr[js.Array[SchemaThreatMatch]] = js.native
}

object SchemaFindThreatMatchesResponse {
  @scala.inline
  def apply(): SchemaFindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindThreatMatchesResponse]
  }
  @scala.inline
  implicit class SchemaFindThreatMatchesResponseOps[Self <: SchemaFindThreatMatchesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: js.Array[SchemaThreatMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
  }
  
}

