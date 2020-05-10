package typingsSlinky.modernizr

import typingsSlinky.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexeddbBoolean extends Boolean {
  var deletedatabase: scala.Boolean = js.native
}

object IndexeddbBoolean {
  @scala.inline
  def apply(deletedatabase: scala.Boolean): IndexeddbBoolean = {
    val __obj = js.Dynamic.literal(deletedatabase = deletedatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexeddbBoolean]
  }
  @scala.inline
  implicit class IndexeddbBooleanOps[Self <: IndexeddbBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedatabase(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedatabase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

