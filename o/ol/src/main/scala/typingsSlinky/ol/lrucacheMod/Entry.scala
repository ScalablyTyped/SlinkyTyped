package typingsSlinky.ol.lrucacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  var key_ : String = js.native
  var newer: js.Any = js.native
  var older: js.Any = js.native
  var value_ : js.Any = js.native
}

object Entry {
  @scala.inline
  def apply(key_ : String, newer: js.Any, older: js.Any, value_ : js.Any): Entry = {
    val __obj = js.Dynamic.literal(key_ = key_.asInstanceOf[js.Any], newer = newer.asInstanceOf[js.Any], older = older.asInstanceOf[js.Any], value_ = value_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOlder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("older")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue_(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

