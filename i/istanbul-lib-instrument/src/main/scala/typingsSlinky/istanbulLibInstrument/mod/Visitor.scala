package typingsSlinky.istanbulLibInstrument.mod

import typingsSlinky.istanbulLibInstrument.AnonFileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends js.Object {
  def enter(path: String): Unit = js.native
  def exit(path: String): AnonFileCoverage = js.native
}

object Visitor {
  @scala.inline
  def apply(enter: String => Unit, exit: String => AnonFileCoverage): Visitor = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit))
    __obj.asInstanceOf[Visitor]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExit(value: String => AnonFileCoverage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

