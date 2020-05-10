package typingsSlinky.monacoEditor

import typingsSlinky.monacoEditor.mod.languages.IDocComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDocComment extends js.Object {
  var docComment: js.UndefOr[IDocComment] = js.native
}

object AnonDocComment {
  @scala.inline
  def apply(): AnonDocComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDocComment]
  }
  @scala.inline
  implicit class AnonDocCommentOps[Self <: AnonDocComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocComment(value: IDocComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docComment")(js.undefined)
        ret
    }
  }
  
}

