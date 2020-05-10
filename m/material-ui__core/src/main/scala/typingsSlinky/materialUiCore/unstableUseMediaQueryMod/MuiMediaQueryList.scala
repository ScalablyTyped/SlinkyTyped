package typingsSlinky.materialUiCore.unstableUseMediaQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiMediaQueryList extends js.Object {
  var matches: Boolean = js.native
  def addListener(listener: MuiMediaQueryListListener): Unit = js.native
  def removeListener(listener: MuiMediaQueryListListener): Unit = js.native
}

object MuiMediaQueryList {
  @scala.inline
  def apply(
    addListener: MuiMediaQueryListListener => Unit,
    matches: Boolean,
    removeListener: MuiMediaQueryListListener => Unit
  ): MuiMediaQueryList = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), matches = matches.asInstanceOf[js.Any], removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[MuiMediaQueryList]
  }
  @scala.inline
  implicit class MuiMediaQueryListOps[Self <: MuiMediaQueryList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: MuiMediaQueryListListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveListener(value: MuiMediaQueryListListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

