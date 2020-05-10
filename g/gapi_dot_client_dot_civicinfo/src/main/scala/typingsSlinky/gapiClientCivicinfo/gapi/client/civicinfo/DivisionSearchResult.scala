package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivisionSearchResult extends js.Object {
  /**
    * Other Open Civic Data identifiers that refer to the same division -- for example, those that refer to other political divisions whose boundaries are
    * defined to be coterminous with this one. For example, ocd-division/country:us/state:wy will include an alias of ocd-division/country:us/state:wy/cd:1,
    * since Wyoming has only one Congressional district.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /** The name of the division. */
  var name: js.UndefOr[String] = js.native
  /** The unique Open Civic Data identifier for this division. */
  var ocdId: js.UndefOr[String] = js.native
}

object DivisionSearchResult {
  @scala.inline
  def apply(): DivisionSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivisionSearchResult]
  }
  @scala.inline
  implicit class DivisionSearchResultOps[Self <: DivisionSearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOcdId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocdId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOcdId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocdId")(js.undefined)
        ret
    }
  }
  
}

