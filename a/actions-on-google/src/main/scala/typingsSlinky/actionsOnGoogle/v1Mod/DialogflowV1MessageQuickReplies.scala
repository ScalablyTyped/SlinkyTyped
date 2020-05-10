package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageQuickReplies
  extends DialogflowV1BaseMessage[`2`]
     with DialogflowV1Message {
  var replies: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
}

object DialogflowV1MessageQuickReplies {
  @scala.inline
  def apply(): DialogflowV1MessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageQuickReplies]
  }
  @scala.inline
  implicit class DialogflowV1MessageQuickRepliesOps[Self <: DialogflowV1MessageQuickReplies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

