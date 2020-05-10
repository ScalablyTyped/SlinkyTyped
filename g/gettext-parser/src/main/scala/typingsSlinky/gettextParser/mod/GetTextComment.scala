package typingsSlinky.gettextParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTextComment extends js.Object {
  var extracted: String = js.native
  var flag: String = js.native
  var previous: String = js.native
  var reference: String = js.native
  var translator: String = js.native
}

object GetTextComment {
  @scala.inline
  def apply(extracted: String, flag: String, previous: String, reference: String, translator: String): GetTextComment = {
    val __obj = js.Dynamic.literal(extracted = extracted.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTextComment]
  }
  @scala.inline
  implicit class GetTextCommentOps[Self <: GetTextComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtracted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extracted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

