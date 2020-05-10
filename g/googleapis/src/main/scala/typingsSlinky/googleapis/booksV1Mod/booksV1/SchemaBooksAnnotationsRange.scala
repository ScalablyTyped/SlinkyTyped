package typingsSlinky.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBooksAnnotationsRange extends js.Object {
  /**
    * The offset from the ending position.
    */
  var endOffset: js.UndefOr[String] = js.native
  /**
    * The ending position for the range.
    */
  var endPosition: js.UndefOr[String] = js.native
  /**
    * The offset from the starting position.
    */
  var startOffset: js.UndefOr[String] = js.native
  /**
    * The starting position for the range.
    */
  var startPosition: js.UndefOr[String] = js.native
}

object SchemaBooksAnnotationsRange {
  @scala.inline
  def apply(): SchemaBooksAnnotationsRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooksAnnotationsRange]
  }
  @scala.inline
  implicit class SchemaBooksAnnotationsRangeOps[Self <: SchemaBooksAnnotationsRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withEndPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(js.undefined)
        ret
    }
  }
  
}

