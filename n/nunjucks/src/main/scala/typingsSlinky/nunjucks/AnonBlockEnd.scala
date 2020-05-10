package typingsSlinky.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlockEnd extends js.Object {
  var blockEnd: js.UndefOr[String] = js.native
  var blockStart: js.UndefOr[String] = js.native
  var commentEnd: js.UndefOr[String] = js.native
  var commentStart: js.UndefOr[String] = js.native
  var variableEnd: js.UndefOr[String] = js.native
  var variableStart: js.UndefOr[String] = js.native
}

object AnonBlockEnd {
  @scala.inline
  def apply(): AnonBlockEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBlockEnd]
  }
  @scala.inline
  implicit class AnonBlockEndOps[Self <: AnonBlockEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentStart")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableStart")(js.undefined)
        ret
    }
  }
  
}

