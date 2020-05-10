package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.goto
import typingsSlinky.monacoEditor.monacoEditorStrings.gotoAndPeek
import typingsSlinky.monacoEditor.monacoEditorStrings.peek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGotoLocationOptions extends js.Object {
  /**
    * Control how goto-command work when having multiple results.
    */
  var multiple: js.UndefOr[peek | gotoAndPeek | goto] = js.native
}

object IGotoLocationOptions {
  @scala.inline
  def apply(): IGotoLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGotoLocationOptions]
  }
  @scala.inline
  implicit class IGotoLocationOptionsOps[Self <: IGotoLocationOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
  }
  
}

