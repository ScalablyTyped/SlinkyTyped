package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAge extends js.Object {
  var age: js.Any = js.native
  var daemon: js.Any = js.native
  var ttlInterval: js.Any = js.native
}

object AnonAge {
  @scala.inline
  def apply(age: js.Any, daemon: js.Any, ttlInterval: js.Any): AnonAge = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], daemon = daemon.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAge]
  }
  @scala.inline
  implicit class AnonAgeOps[Self <: AnonAge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAge(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaemon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daemon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtlInterval(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttlInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

