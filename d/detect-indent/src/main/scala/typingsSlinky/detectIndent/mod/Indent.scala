package typingsSlinky.detectIndent.mod

import typingsSlinky.detectIndent.detectIndentStrings.space
import typingsSlinky.detectIndent.detectIndentStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indent extends js.Object {
  /**
  		Amount of indentation, for example `2`.
  		*/
  var amount: Double = js.native
  /**
  		Actual indentation.
  		*/
  var indent: String = js.native
  /**
  		Type of indentation. Is `undefined` if no indentation is detected.
  		*/
  var `type`: js.UndefOr[tab | space] = js.native
}

object Indent {
  @scala.inline
  def apply(amount: Double, indent: String): Indent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
  @scala.inline
  implicit class IndentOps[Self <: Indent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: tab | space): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

