package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelOptionsChangedEvent extends js.Object {
  val indentSize: Boolean = js.native
  val insertSpaces: Boolean = js.native
  val tabSize: Boolean = js.native
  val trimAutoWhitespace: Boolean = js.native
}

object IModelOptionsChangedEvent {
  @scala.inline
  def apply(indentSize: Boolean, insertSpaces: Boolean, tabSize: Boolean, trimAutoWhitespace: Boolean): IModelOptionsChangedEvent = {
    val __obj = js.Dynamic.literal(indentSize = indentSize.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], trimAutoWhitespace = trimAutoWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelOptionsChangedEvent]
  }
  @scala.inline
  implicit class IModelOptionsChangedEventOps[Self <: IModelOptionsChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndentSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimAutoWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimAutoWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

