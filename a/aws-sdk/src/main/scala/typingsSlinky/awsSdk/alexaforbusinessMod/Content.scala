package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  /**
    * The list of audio messages.
    */
  var AudioList: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.AudioList] = js.native
  /**
    * The list of SSML messages.
    */
  var SsmlList: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SsmlList] = js.native
  /**
    * The list of text messages.
    */
  var TextList: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.TextList] = js.native
}

object Content {
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioList(value: AudioList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioList")(js.undefined)
        ret
    }
    @scala.inline
    def withSsmlList(value: SsmlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SsmlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsmlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SsmlList")(js.undefined)
        ret
    }
    @scala.inline
    def withTextList(value: TextList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextList")(js.undefined)
        ret
    }
  }
  
}

