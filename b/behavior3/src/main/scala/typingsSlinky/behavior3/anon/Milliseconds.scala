package typingsSlinky.behavior3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Milliseconds extends js.Object {
  var milliseconds: js.UndefOr[Double] = js.native
}

object Milliseconds {
  @scala.inline
  def apply(): Milliseconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Milliseconds]
  }
  @scala.inline
  implicit class MillisecondsOps[Self <: Milliseconds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milliseconds")(js.undefined)
        ret
    }
  }
  
}

