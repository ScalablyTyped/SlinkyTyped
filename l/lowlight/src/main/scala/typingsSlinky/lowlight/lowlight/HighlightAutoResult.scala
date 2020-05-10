package typingsSlinky.lowlight.lowlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightAutoResult extends HighlightResult {
  var secondBest: js.UndefOr[HighlightAutoResult] = js.native
}

object HighlightAutoResult {
  @scala.inline
  def apply(language: String, relevance: Double, value: js.Array[HastNode]): HighlightAutoResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightAutoResult]
  }
  @scala.inline
  implicit class HighlightAutoResultOps[Self <: HighlightAutoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecondBest(value: HighlightAutoResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondBest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondBest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondBest")(js.undefined)
        ret
    }
  }
  
}

