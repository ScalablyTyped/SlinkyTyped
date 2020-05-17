package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoiceTransitionName extends js.Object {
  var bordered: Boolean = js.native
  var choiceTransitionName: String = js.native
  var transitionName: String = js.native
}

object ChoiceTransitionName {
  @scala.inline
  def apply(bordered: Boolean, choiceTransitionName: String, transitionName: String): ChoiceTransitionName = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], choiceTransitionName = choiceTransitionName.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceTransitionName]
  }
  @scala.inline
  implicit class ChoiceTransitionNameOps[Self <: ChoiceTransitionName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoiceTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choiceTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

