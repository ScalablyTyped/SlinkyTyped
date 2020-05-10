package typingsSlinky.reactNativeDatawedgeIntents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtrasObject extends js.Object {
  var action: String = js.native
  var extras: js.UndefOr[js.Object] = js.native
}

object ExtrasObject {
  @scala.inline
  def apply(action: String): ExtrasObject = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrasObject]
  }
  @scala.inline
  implicit class ExtrasObjectOps[Self <: ExtrasObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtras(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(js.undefined)
        ret
    }
  }
  
}

