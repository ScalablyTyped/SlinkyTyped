package typingsSlinky.envEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  var binary: String = js.native
  var id: String = js.native
  var isTerminalEditor: Boolean = js.native
  var keywords: js.Array[String] = js.native
  var name: String = js.native
  var paths: js.Array[String] = js.native
}

object Editor {
  @scala.inline
  def apply(
    binary: String,
    id: String,
    isTerminalEditor: Boolean,
    keywords: js.Array[String],
    name: String,
    paths: js.Array[String]
  ): Editor = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isTerminalEditor = isTerminalEditor.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  @scala.inline
  implicit class EditorOps[Self <: Editor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTerminalEditor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTerminalEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

