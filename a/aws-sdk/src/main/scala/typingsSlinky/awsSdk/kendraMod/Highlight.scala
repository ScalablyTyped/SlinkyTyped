package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Highlight extends js.Object {
  /**
    * The zero-based location in the response string where the highlight starts.
    */
  var BeginOffset: Integer = js.native
  /**
    * The zero-based location in the response string where the highlight ends.
    */
  var EndOffset: Integer = js.native
  /**
    * Indicates whether the response is the best response. True if this is the best response; otherwise, false.
    */
  var TopAnswer: js.UndefOr[Boolean] = js.native
}

object Highlight {
  @scala.inline
  def apply(BeginOffset: Integer, EndOffset: Integer): Highlight = {
    val __obj = js.Dynamic.literal(BeginOffset = BeginOffset.asInstanceOf[js.Any], EndOffset = EndOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  @scala.inline
  implicit class HighlightOps[Self <: Highlight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginOffset(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndOffset(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopAnswer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopAnswer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopAnswer")(js.undefined)
        ret
    }
  }
  
}

