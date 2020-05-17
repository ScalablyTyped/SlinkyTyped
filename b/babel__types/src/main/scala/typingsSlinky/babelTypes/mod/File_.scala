package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File_
  extends BaseNode
     with Node {
  var comments: js.Any = js.native
  var program: Program_ = js.native
  var tokens: js.Any = js.native
  @JSName("type")
  var type_File_ : File = js.native
}

object File_ {
  @scala.inline
  def apply(comments: js.Any, program: Program_, tokens: js.Any, `type`: File): File_ = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File_]
  }
  @scala.inline
  implicit class File_Ops[Self <: File_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgram(value: Program_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

