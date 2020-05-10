package typingsSlinky.javascriptObfuscator.estreeMod

import typingsSlinky.javascriptObfuscator.javascriptObfuscatorStrings.`use strict`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatement extends BaseNode {
  var directive: js.UndefOr[`use strict`] = js.native
}

object ExpressionStatement {
  @scala.inline
  def apply(): ExpressionStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressionStatement]
  }
  @scala.inline
  implicit class ExpressionStatementOps[Self <: ExpressionStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirective(value: `use strict`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(js.undefined)
        ret
    }
  }
  
}

