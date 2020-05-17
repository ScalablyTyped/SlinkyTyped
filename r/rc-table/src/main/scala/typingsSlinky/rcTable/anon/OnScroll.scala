package typingsSlinky.rcTable.anon

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnScroll extends js.Object {
  var ref: Ref[ScrollLeft] = js.native
  var scrollbarSize: Double = js.native
  def onScroll(info: CurrentTarget): Unit = js.native
}

object OnScroll {
  @scala.inline
  def apply(onScroll: CurrentTarget => Unit, scrollbarSize: Double): OnScroll = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll), scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnScroll]
  }
  @scala.inline
  implicit class OnScrollOps[Self <: OnScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnScroll(value: CurrentTarget => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollbarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[ScrollLeft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ ScrollLeft | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[ScrollLeft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
  }
  
}

