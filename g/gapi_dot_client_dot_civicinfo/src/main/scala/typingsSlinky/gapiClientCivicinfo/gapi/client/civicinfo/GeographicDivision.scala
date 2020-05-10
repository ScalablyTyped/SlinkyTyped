package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeographicDivision extends js.Object {
  /**
    * Any other valid OCD IDs that refer to the same division.
    *
    * Because OCD IDs are meant to be human-readable and at least somewhat predictable, there are occasionally several identifiers for a single division.
    * These identifiers are defined to be equivalent to one another, and one is always indicated as the primary identifier. The primary identifier will be
    * returned in ocd_id above, and any other equivalent valid identifiers will be returned in this list.
    *
    * For example, if this division's OCD ID is ocd-division/country:us/district:dc, this will contain ocd-division/country:us/state:dc.
    */
  var alsoKnownAs: js.UndefOr[js.Array[String]] = js.native
  /** The name of the division. */
  var name: js.UndefOr[String] = js.native
  /**
    * List of indices in the offices array, one for each office elected from this division. Will only be present if includeOffices was true (or absent) in
    * the request.
    */
  var officeIndices: js.UndefOr[js.Array[Double]] = js.native
}

object GeographicDivision {
  @scala.inline
  def apply(): GeographicDivision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeographicDivision]
  }
  @scala.inline
  implicit class GeographicDivisionOps[Self <: GeographicDivision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlsoKnownAs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alsoKnownAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlsoKnownAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alsoKnownAs")(js.undefined)
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
    def withOfficeIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfficeIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeIndices")(js.undefined)
        ret
    }
  }
  
}

