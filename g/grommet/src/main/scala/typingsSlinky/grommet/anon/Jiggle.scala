package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jiggle extends js.Object {
  var duration: js.UndefOr[String] = js.native
  var jiggle: js.UndefOr[Duration] = js.native
}

object Jiggle {
  @scala.inline
  def apply(): Jiggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jiggle]
  }
  @scala.inline
  implicit class JiggleOps[Self <: Jiggle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withJiggle(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jiggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJiggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jiggle")(js.undefined)
        ret
    }
  }
  
}

