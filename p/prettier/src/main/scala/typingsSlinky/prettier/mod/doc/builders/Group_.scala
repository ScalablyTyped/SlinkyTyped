package typingsSlinky.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group_ extends Doc {
  var break: Boolean = js.native
  var contents: Doc = js.native
  var expandedStates: js.Array[Doc] = js.native
  var `type`: typingsSlinky.prettier.prettierStrings.group = js.native
}

object Group_ {
  @scala.inline
  def apply(
    break: Boolean,
    contents: Doc,
    expandedStates: js.Array[Doc],
    `type`: typingsSlinky.prettier.prettierStrings.group
  ): Group_ = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group_]
  }
  @scala.inline
  implicit class Group_Ops[Self <: Group_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContents(value: Doc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedStates(value: js.Array[Doc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.prettier.prettierStrings.group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

