package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies FHIR paths to match, and how to handle de-identification of
  * matching fields.
  */
@js.native
trait SchemaFieldMetadata extends js.Object {
  /**
    * Deidentify action for one field.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * List of paths to FHIR fields to be redacted. Each path is a
    * period-separated list where each component is either a field name or FHIR
    * type name, for example: Patient, HumanName. For &quot;choice&quot; types
    * (those defined in the FHIR spec with the form: field[x]) we use two
    * separate components. e.g. &quot;deceasedAge.unit&quot; is matched by
    * &quot;Deceased.Age.unit&quot;. Supported types are:
    * AdministrativeGenderCode, Code, Date, DateTime, Decimal, HumanName, Id,
    * LanguageCode, Markdown, MimeTypeCode, Oid, String, Uri, Uuid, Xhtml.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFieldMetadata {
  @scala.inline
  def apply(): SchemaFieldMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMetadata]
  }
  @scala.inline
  implicit class SchemaFieldMetadataOps[Self <: SchemaFieldMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
  }
  
}

