package typingsSlinky.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPriority extends js.Object {
  @JSName(".priority")
  var Dotpriority: String | Double | Null = js.native
  @JSName(".value")
  var Dotvalue: js.Any = js.native
}

object AnonPriority {
  @scala.inline
  def apply(Dotvalue: js.Any): AnonPriority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(Dotvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPriority]
  }
  @scala.inline
  implicit class AnonPriorityOps[Self <: AnonPriority] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotvalue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotpriority(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotpriorityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".priority")(null)
        ret
    }
  }
  
}

