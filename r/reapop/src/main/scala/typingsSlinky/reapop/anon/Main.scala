package typingsSlinky.reapop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Main extends js.Object {
  var main: js.UndefOr[String] = js.native
  var position: js.UndefOr[js.Function1[/* position */ String, String]] = js.native
}

object Main {
  @scala.inline
  def apply(): Main = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Main]
  }
  @scala.inline
  implicit class MainOps[Self <: Main] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: /* position */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

