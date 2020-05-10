package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice-item.
  */
@js.native
trait ChoiceBase extends js.Object {
  /**
    * The type of the choice.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ChoiceBase {
  @scala.inline
  def apply(): ChoiceBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceBase]
  }
  @scala.inline
  implicit class ChoiceBaseOps[Self <: ChoiceBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
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

