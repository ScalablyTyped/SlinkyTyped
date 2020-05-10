package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AnnotationSource holds the source information of the annotation.
  */
@js.native
trait SchemaAnnotationSource extends js.Object {
  /**
    * Cloud Healthcare API resource.
    */
  var cloudHealthcareSource: js.UndefOr[SchemaCloudHealthcareSource] = js.native
}

object SchemaAnnotationSource {
  @scala.inline
  def apply(): SchemaAnnotationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationSource]
  }
  @scala.inline
  implicit class SchemaAnnotationSourceOps[Self <: SchemaAnnotationSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudHealthcareSource(value: SchemaCloudHealthcareSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudHealthcareSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudHealthcareSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudHealthcareSource")(js.undefined)
        ret
    }
  }
  
}

