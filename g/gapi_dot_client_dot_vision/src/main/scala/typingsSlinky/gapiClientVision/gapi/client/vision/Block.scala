package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  /** Detected block type (text, image etc) for this block. */
  var blockType: js.UndefOr[String] = js.native
  /**
    * The bounding box for the block.
    * The vertices are in the order of top-left, top-right, bottom-right,
    * bottom-left. When a rotation of the bounding box is detected the rotation
    * is represented as around the top-left corner as defined when the text is
    * read in the 'natural' orientation.
    * For example:
    * &#42; when the text is horizontal it might look like:
    * 0----1
    * |    |
    * 3----2
    * &#42; when it's rotated 180 degrees around the top-left corner it becomes:
    * 2----3
    * |    |
    * 1----0
    * and the vertice order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[BoundingPoly] = js.native
  /** List of paragraphs in this block (if this blocks is of type text). */
  var paragraphs: js.UndefOr[js.Array[Paragraph]] = js.native
  /** Additional information detected for the block. */
  var property: js.UndefOr[TextProperty] = js.native
}

object Block {
  @scala.inline
  def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockType")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundingBox(value: BoundingPoly): Self = {
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
    def withParagraphs(value: js.Array[Paragraph]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: TextProperty): Self = {
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
  }
  
}

