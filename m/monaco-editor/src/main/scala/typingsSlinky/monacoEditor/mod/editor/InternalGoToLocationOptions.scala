package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.goto
import typingsSlinky.monacoEditor.monacoEditorStrings.gotoAndPeek
import typingsSlinky.monacoEditor.monacoEditorStrings.peek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalGoToLocationOptions extends js.Object {
  val multiple: peek | gotoAndPeek | goto = js.native
}

object InternalGoToLocationOptions {
  @scala.inline
  def apply(multiple: peek | gotoAndPeek | goto): InternalGoToLocationOptions = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalGoToLocationOptions]
  }
  @scala.inline
  implicit class InternalGoToLocationOptionsOps[Self <: InternalGoToLocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiple(value: peek | gotoAndPeek | goto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

