package typingsSlinky.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreatedate extends js.Object {
  var `create date`: js.Date = js.native
  var `last use date`: js.Date = js.native
  var name: String = js.native
}

object AnonCreatedate {
  @scala.inline
  def apply(`create date`: js.Date, `last use date`: js.Date, name: String): AnonCreatedate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("create date")((`create date`).asInstanceOf[js.Any])
    __obj.updateDynamic("last use date")((`last use date`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreatedate]
  }
  @scala.inline
  implicit class AnonCreatedateOps[Self <: AnonCreatedate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCreate date`(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLast use date`(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last use date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

