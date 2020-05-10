package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchTags extends js.Object {
  /**
    * Highlight both matching tags.
    */
  var bothTags: js.UndefOr[Boolean] = js.native
}

object MatchTags {
  @scala.inline
  def apply(): MatchTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchTags]
  }
  @scala.inline
  implicit class MatchTagsOps[Self <: MatchTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBothTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bothTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBothTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bothTags")(js.undefined)
        ret
    }
  }
  
}

