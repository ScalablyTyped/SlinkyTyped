package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An annotation record.
  */
@js.native
trait SchemaAnnotation extends js.Object {
  /**
    * Details of the source.
    */
  var annotationSource: js.UndefOr[SchemaAnnotationSource] = js.native
  /**
    * Annnotations for images, e.g., bounding polygons.
    */
  var imageAnnotation: js.UndefOr[SchemaImageAnnotation] = js.native
  /**
    * Output only. Resource name of the Annotation, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Annotations for resource, e.g., classification tags.
    */
  var resourceAnnotation: js.UndefOr[SchemaResourceAnnotation] = js.native
  /**
    * Annotations for sentitive texts, e.g., range of such texts.
    */
  var textAnnotation: js.UndefOr[SchemaSensitiveTextAnnotation] = js.native
}

object SchemaAnnotation {
  @scala.inline
  def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  @scala.inline
  implicit class SchemaAnnotationOps[Self <: SchemaAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationSource(value: SchemaAnnotationSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationSource")(js.undefined)
        ret
    }
    @scala.inline
    def withImageAnnotation(value: SchemaImageAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAnnotation")(js.undefined)
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
    def withResourceAnnotation(value: SchemaResourceAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnnotation(value: SchemaSensitiveTextAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnnotation")(js.undefined)
        ret
    }
  }
  
}

