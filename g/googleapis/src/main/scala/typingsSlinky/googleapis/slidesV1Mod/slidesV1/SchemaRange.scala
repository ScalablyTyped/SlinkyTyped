package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a contiguous range of an indexed collection, such as characters
  * in text.
  */
@js.native
trait SchemaRange extends js.Object {
  /**
    * The optional zero-based index of the end of the collection. Required for
    * `FIXED_RANGE` ranges.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The optional zero-based index of the beginning of the collection.
    * Required for `FIXED_RANGE` and `FROM_START_INDEX` ranges.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The type of range.
    */
  var `type`: js.UndefOr[String] = js.native
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

