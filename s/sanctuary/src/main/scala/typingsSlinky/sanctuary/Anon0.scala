package typingsSlinky.sanctuary

import typingsSlinky.sanctuary.sanctuaryStrings.sanctuarySlashEither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  var `@@type`: sanctuarySlashEither = js.native
}

object Anon0 {
  @scala.inline
  def apply(`@@type`: sanctuarySlashEither): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit class Anon0Ops[Self <: Anon0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with@@type`(value: sanctuarySlashEither): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

