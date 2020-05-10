package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.backward
import typingsSlinky.atom.atomStrings.closest
import typingsSlinky.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon26 extends js.Object {
  var clipDirection: backward | forward | closest = js.native
}

object Anon26 {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): Anon26 = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon26]
  }
  @scala.inline
  implicit class Anon26Ops[Self <: Anon26] (val x: Self) extends AnyVal {
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
  }
  
}

