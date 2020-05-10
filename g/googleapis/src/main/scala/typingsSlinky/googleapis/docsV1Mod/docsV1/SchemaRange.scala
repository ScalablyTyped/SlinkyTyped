package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a contiguous range of text.
  */
@js.native
trait SchemaRange extends js.Object {
  /**
    * The zero-based end index of this range, exclusive, in UTF-16 code units.
    * In all current uses, an end index must be provided. This field is an
    * Int32Value in order to accommodate future use cases with open-ended
    * ranges.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The ID of the header, footer or footnote that this range is contained in.
    * An empty segment ID signifies the document&#39;s body.
    */
  var segmentId: js.UndefOr[String] = js.native
  /**
    * The zero-based start index of this range, in UTF-16 code units.  In all
    * current uses, a start index must be provided. This field is an Int32Value
    * in order to accommodate future use cases with open-ended ranges.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object SchemaRange {
  @scala.inline
  def apply(): SchemaRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRange]
  }
  @scala.inline
  implicit class SchemaRangeOps[Self <: SchemaRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
  }
  
}

