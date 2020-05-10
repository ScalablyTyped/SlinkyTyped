package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRange extends js.Object {
  /**
    * The one-based end line of the range to fold. The folded area ends with the line's last character.
    */
  var end: Double = js.native
  /**
    * Describes the [Kind](#FoldingRangeKind) of the folding range such as [Comment](#FoldingRangeKind.Comment) or
    * [Region](#FoldingRangeKind.Region). The kind is used to categorize folding ranges and used by commands
    * like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[FoldingRangeKind] = js.native
  /**
    * The one-based start line of the range to fold. The folded area starts after the line's last character.
    */
  var start: Double = js.native
}

object FoldingRange {
  @scala.inline
  def apply(end: Double, start: Double): FoldingRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
  @scala.inline
  implicit class FoldingRangeOps[Self <: FoldingRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: FoldingRangeKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

