package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.backward
import typingsSlinky.atom.atomStrings.closest
import typingsSlinky.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClipDirection extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
}

object AnonClipDirection {
  @scala.inline
  def apply(): AnonClipDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClipDirection]
  }
  @scala.inline
  implicit class AnonClipDirectionOps[Self <: AnonClipDirection] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
  }
  
}

