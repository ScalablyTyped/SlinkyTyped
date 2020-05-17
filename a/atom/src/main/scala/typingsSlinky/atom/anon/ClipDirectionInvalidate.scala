package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.backward
import typingsSlinky.atom.atomStrings.closest
import typingsSlinky.atom.atomStrings.forward
import typingsSlinky.atom.atomStrings.inside
import typingsSlinky.atom.atomStrings.never
import typingsSlinky.atom.atomStrings.overlap
import typingsSlinky.atom.atomStrings.surround
import typingsSlinky.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipDirectionInvalidate extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
}

object ClipDirectionInvalidate {
  @scala.inline
  def apply(): ClipDirectionInvalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipDirectionInvalidate]
  }
  @scala.inline
  implicit class ClipDirectionInvalidateOps[Self <: ClipDirectionInvalidate] (val x: Self) extends AnyVal {
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
    def withInvalidate(value: never | surround | overlap | inside | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.undefined)
        ret
    }
  }
  
}

