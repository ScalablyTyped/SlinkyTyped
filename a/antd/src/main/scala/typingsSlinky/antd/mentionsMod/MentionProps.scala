package typingsSlinky.antd.mentionsMod

import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionProps extends MentionsProps {
  var loading: js.UndefOr[Boolean] = js.native
}

object MentionProps {
  @scala.inline
  def apply(): MentionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MentionProps]
  }
  @scala.inline
  implicit class MentionPropsOps[Self <: MentionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
  }
  
}

