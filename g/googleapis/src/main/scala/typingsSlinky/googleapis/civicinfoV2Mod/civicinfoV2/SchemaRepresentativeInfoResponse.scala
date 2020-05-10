package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a representative info lookup query.
  */
@js.native
trait SchemaRepresentativeInfoResponse extends js.Object {
  /**
    * Political geographic divisions that contain the requested address.
    */
  var divisions: js.UndefOr[StringDictionary[SchemaGeographicDivision]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#representativeInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The normalized version of the requested address
    */
  var normalizedInput: js.UndefOr[SchemaSimpleAddressType] = js.native
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

object SchemaRepresentativeInfoResponse {
  @scala.inline
  def apply(): SchemaRepresentativeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepresentativeInfoResponse]
  }
  @scala.inline
  implicit class SchemaRepresentativeInfoResponseOps[Self <: SchemaRepresentativeInfoResponse] (val x: Self) extends AnyVal {
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizedInput(value: SchemaSimpleAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizedInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedInput")(js.undefined)
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

