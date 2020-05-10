package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures de-id options specific to different types of content. Each
  * submessage customizes the handling of an
  * https://tools.ietf.org/html/rfc6838 media type or subtype. Configs are
  * applied in a nested manner at runtime.
  */
@js.native
trait SchemaDeidentifyConfig extends js.Object {
  /**
    * Configures de-id of application/DICOM content.
    */
  var dicom: js.UndefOr[SchemaDicomConfig] = js.native
  /**
    * Configures de-id of application/FHIR content.
    */
  var fhir: js.UndefOr[SchemaFhirConfig] = js.native
  /**
    * Configures de-identification of image pixels wherever they are found in
    * the source_dataset.
    */
  var image: js.UndefOr[SchemaImageConfig] = js.native
}

object SchemaDeidentifyConfig {
  @scala.inline
  def apply(): SchemaDeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyConfig]
  }
  @scala.inline
  implicit class SchemaDeidentifyConfigOps[Self <: SchemaDeidentifyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDicom(value: SchemaDicomConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dicom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDicom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dicom")(js.undefined)
        ret
    }
    @scala.inline
    def withFhir(value: SchemaFhirConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fhir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFhir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fhir")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SchemaImageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
  }
  
}

