package typingsSlinky.rbx.cardHeaderTitleMod

import typingsSlinky.rbx.rbxStrings.centered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardHeaderTitleVariablesDefaults extends js.Object {
  var alignments: centered = js.native
}

object CardHeaderTitleVariablesDefaults {
  @scala.inline
  def apply(alignments: centered): CardHeaderTitleVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderTitleVariablesDefaults]
  }
  @scala.inline
  implicit class CardHeaderTitleVariablesDefaultsOps[Self <: CardHeaderTitleVariablesDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignments(value: centered): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

