package typingsSlinky.agGrid.originalColumnGroupChildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalColumnGroupChild extends js.Object {
  def getColumnGroupShow(): String = js.native
  def getId(): String = js.native
  def isVisible(): Boolean = js.native
}

object OriginalColumnGroupChild {
  @scala.inline
  def apply(getColumnGroupShow: () => String, getId: () => String, isVisible: () => Boolean): OriginalColumnGroupChild = {
    val __obj = js.Dynamic.literal(getColumnGroupShow = js.Any.fromFunction0(getColumnGroupShow), getId = js.Any.fromFunction0(getId), isVisible = js.Any.fromFunction0(isVisible))
    __obj.asInstanceOf[OriginalColumnGroupChild]
  }
  @scala.inline
  implicit class OriginalColumnGroupChildOps[Self <: OriginalColumnGroupChild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColumnGroupShow(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnGroupShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

