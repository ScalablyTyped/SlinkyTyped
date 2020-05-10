package typingsSlinky.prettierLinterHelpers.mod

import typingsSlinky.prettierLinterHelpers.prettierLinterHelpersStrings.delete
import typingsSlinky.prettierLinterHelpers.prettierLinterHelpersStrings.insert
import typingsSlinky.prettierLinterHelpers.prettierLinterHelpersStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Difference extends js.Object {
  var deleteText: js.UndefOr[String] = js.native
  var insertText: js.UndefOr[String] = js.native
  var offset: Double = js.native
  var operation: insert | delete | replace = js.native
}

object Difference {
  @scala.inline
  def apply(offset: Double, operation: insert | delete | replace): Difference = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Difference]
  }
  @scala.inline
  implicit class DifferenceOps[Self <: Difference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: insert | delete | replace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteText")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(js.undefined)
        ret
    }
  }
  
}

