package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of detected entity features.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1EntityAnnotation extends js.Object {
  /**
    * Image region to which this entity belongs. Not produced for
    * `LABEL_DETECTION` features.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  /**
    * **Deprecated. Use `score` instead.** The accuracy of the entity detection
    * in an image. For example, for an image in which the &quot;Eiffel
    * Tower&quot; entity is detected, this field represents the confidence that
    * there is a tower in the query image. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Entity textual description, expressed in its `locale` language.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The language code for the locale in which the entity textual
    * `description` is expressed.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The location information for the detected entity. Multiple `LocationInfo`
    * elements can be present because one location may indicate the location of
    * the scene in the image, and another location may indicate the location of
    * the place where the image was taken. Location information is usually
    * present for landmarks.
    */
  var locations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1LocationInfo]] = js.native
  /**
    * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph
    * Search API](https://developers.google.com/knowledge-graph/).
    */
  var mid: js.UndefOr[String] = js.native
  /**
    * Some entities may have optional user-supplied `Property` (name/value)
    * fields, such a score or string that qualifies the entity.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1Property]] = js.native
  /**
    * Overall score of the result. Range [0, 1].
    */
  var score: js.UndefOr[Double] = js.native
  /**
    * The relevancy of the ICA (Image Content Annotation) label to the image.
    * For example, the relevancy of &quot;tower&quot; is likely higher to an
    * image containing the detected &quot;Eiffel Tower&quot; than to an image
    * containing a detected distant towering building, even though the
    * confidence that there is a tower in each image may be the same. Range [0,
    * 1].
    */
  var topicality: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1EntityAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1EntityAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1EntityAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1EntityAnnotationOps[Self <: SchemaGoogleCloudVisionV1p4beta1EntityAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingPoly(value: SchemaGoogleCloudVisionV1p4beta1BoundingPoly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingPoly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[SchemaGoogleCloudVisionV1p4beta1LocationInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[SchemaGoogleCloudVisionV1p4beta1Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicality")(js.undefined)
        ret
    }
  }
  
}

