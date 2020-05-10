package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.backward
import typingsSlinky.atom.atomStrings.closest
import typingsSlinky.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon27 extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
}

object Anon27 {
  @scala.inline
  def apply(): Anon27 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon27]
  }
  @scala.inline
  implicit class Anon27Ops[Self <: Anon27] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipDirection(value: backward | forward | closest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipDirection")(js.undefined)
        ret
    }
  }
  
}

