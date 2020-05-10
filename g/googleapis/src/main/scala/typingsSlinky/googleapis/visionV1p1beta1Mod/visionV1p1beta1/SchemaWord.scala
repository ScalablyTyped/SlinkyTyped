package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A word representation.
  */
@js.native
trait SchemaWord extends js.Object {
  /**
    * The bounding box for the word. The vertices are in the order of top-left,
    * top-right, bottom-right, bottom-left. When a rotation of the bounding box
    * is detected the rotation is represented as around the top-left corner as
    * defined when the text is read in the &#39;natural&#39; orientation. For
    * example:   * when the text is horizontal it might look like:      0----1
    * |    |      3----2   * when it&#39;s rotated 180 degrees around the
    * top-left corner it becomes:      2----3      |    |      1----0   and the
    * vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaBoundingPoly] = js.native
  /**
    * Confidence of the OCR results for the word. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Additional information detected for the word.
    */
  var property: js.UndefOr[SchemaTextProperty] = js.native
  /**
    * List of symbols in the word. The order of the symbols follows the natural
    * reading order.
    */
  var symbols: js.UndefOr[js.Array[SchemaSymbol]] = js.native
}

object SchemaWord {
  @scala.inline
  def apply(): SchemaWord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWord]
  }
  @scala.inline
  implicit class SchemaWordOps[Self <: SchemaWord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBox(value: SchemaBoundingPoly): Self = {
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
    def withProperty(value: SchemaTextProperty): Self = {
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
    def withSymbols(value: js.Array[SchemaSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
  }
  
}

