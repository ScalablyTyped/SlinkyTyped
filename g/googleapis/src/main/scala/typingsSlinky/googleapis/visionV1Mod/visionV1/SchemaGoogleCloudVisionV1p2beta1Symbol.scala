package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single symbol representation.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1Symbol extends js.Object {
  /**
    * The bounding box for the symbol. The vertices are in the order of
    * top-left, top-right, bottom-right, bottom-left. When a rotation of the
    * bounding box is detected the rotation is represented as around the
    * top-left corner as defined when the text is read in the &#39;natural&#39;
    * orientation. For example:   * when the text is horizontal it might look
    * like:      0----1      |    |      3----2   * when it&#39;s rotated 180
    * degrees around the top-left corner it becomes:      2----3      |    |
    * 1----0   and the vertice order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.native
  /**
    * Confidence of the OCR results for the symbol. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Additional information detected for the symbol.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1TextAnnotationTextProperty] = js.native
  /**
    * The actual UTF-8 representation of the symbol.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1Symbol {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1Symbol]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1SymbolOps[Self <: SchemaGoogleCloudVisionV1p2beta1Symbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBox(value: SchemaGoogleCloudVisionV1p2beta1BoundingPoly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(js.undefined)
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
    def withProperty(value: SchemaGoogleCloudVisionV1p2beta1TextAnnotationTextProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

