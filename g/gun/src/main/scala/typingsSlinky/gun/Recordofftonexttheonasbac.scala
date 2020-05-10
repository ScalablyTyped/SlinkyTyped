package typingsSlinky.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'off' | 'to' | 'next' | 'the' | 'on' | 'as' | 'back' | 'rid' | 'id', any> */
@js.native
trait Recordofftonexttheonasbac extends js.Object {
  var as: js.Any = js.native
  var back: js.Any = js.native
  var id: js.Any = js.native
  var next: js.Any = js.native
  var off: js.Any = js.native
  var on: js.Any = js.native
  var rid: js.Any = js.native
  var the: js.Any = js.native
  var to: js.Any = js.native
}

object Recordofftonexttheonasbac {
  @scala.inline
  def apply(
    as: js.Any,
    back: js.Any,
    id: js.Any,
    next: js.Any,
    off: js.Any,
    on: js.Any,
    rid: js.Any,
    the: js.Any,
    to: js.Any
  ): Recordofftonexttheonasbac = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], back = back.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], the = the.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordofftonexttheonasbac]
  }
  @scala.inline
  implicit class RecordofftonexttheonasbacOps[Self <: Recordofftonexttheonasbac] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBack(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOff(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThe(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("the")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

