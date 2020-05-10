package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRepresentativeInfoData extends js.Object {
  /**
    * Political geographic divisions that contain the requested address.
    */
  var divisions: js.UndefOr[StringDictionary[SchemaGeographicDivision]] = js.native
  /**
    * Elected offices referenced by the divisions listed above. Will only be
    * present if includeOffices was true in the request.
    */
  var offices: js.UndefOr[js.Array[SchemaOffice]] = js.native
  /**
    * Officials holding the offices listed above. Will only be present if
    * includeOffices was true in the request.
    */
  var officials: js.UndefOr[js.Array[SchemaOfficial]] = js.native
}

object SchemaRepresentativeInfoData {
  @scala.inline
  def apply(): SchemaRepresentativeInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepresentativeInfoData]
  }
  @scala.inline
  implicit class SchemaRepresentativeInfoDataOps[Self <: SchemaRepresentativeInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivisions(value: StringDictionary[SchemaGeographicDivision]): Self = {
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
    def withOffices(value: js.Array[SchemaOffice]): Self = {
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
    def withOfficials(value: js.Array[SchemaOfficial]): Self = {
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

