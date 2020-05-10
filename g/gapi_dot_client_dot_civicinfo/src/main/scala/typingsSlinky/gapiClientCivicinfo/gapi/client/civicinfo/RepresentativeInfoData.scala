package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepresentativeInfoData extends js.Object {
  /** Political geographic divisions that contain the requested address. */
  var divisions: js.UndefOr[Record[String, GeographicDivision]] = js.native
  /** Elected offices referenced by the divisions listed above. Will only be present if includeOffices was true in the request. */
  var offices: js.UndefOr[js.Array[Office]] = js.native
  /** Officials holding the offices listed above. Will only be present if includeOffices was true in the request. */
  var officials: js.UndefOr[js.Array[Official]] = js.native
}

object RepresentativeInfoData {
  @scala.inline
  def apply(): RepresentativeInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepresentativeInfoData]
  }
  @scala.inline
  implicit class RepresentativeInfoDataOps[Self <: RepresentativeInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivisions(value: Record[String, GeographicDivision]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisions")(js.undefined)
        ret
    }
    @scala.inline
    def withOffices(value: js.Array[Office]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offices")(js.undefined)
        ret
    }
    @scala.inline
    def withOfficials(value: js.Array[Official]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfficials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officials")(js.undefined)
        ret
    }
  }
  
}

