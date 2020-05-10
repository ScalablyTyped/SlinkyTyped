package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartOfSpeechTag extends js.Object {
  /**
    * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * Identifies the part of speech that the token represents.
    */
  var Tag: js.UndefOr[PartOfSpeechTagType] = js.native
}

object PartOfSpeechTag {
  @scala.inline
  def apply(): PartOfSpeechTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartOfSpeechTag]
  }
  @scala.inline
  implicit class PartOfSpeechTagOps[Self <: PartOfSpeechTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScore(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Score")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: PartOfSpeechTagType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

