package typingsSlinky.kosCore.mod

import typingsSlinky.kosCore.AnonNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  def getActionType(action: String): AnonNamespace = js.native
  def getParam(): js.Any = js.native
}

object Util {
  @scala.inline
  def apply(getActionType: String => AnonNamespace, getParam: () => js.Any): Util = {
    val __obj = js.Dynamic.literal(getActionType = js.Any.fromFunction1(getActionType), getParam = js.Any.fromFunction0(getParam))
    __obj.asInstanceOf[Util]
  }
  @scala.inline
  implicit class UtilOps[Self <: Util] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActionType(value: String => AnonNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActionType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParam(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParam")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

