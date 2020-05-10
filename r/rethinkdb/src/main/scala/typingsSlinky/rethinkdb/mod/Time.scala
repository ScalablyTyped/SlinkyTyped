package typingsSlinky.rethinkdb.mod

import typingsSlinky.rethinkdb.rethinkdbStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Time extends ReqlType {
  @JSName("$reql_type$")
  var Dollarreql_typeDollar_Time: TIME = js.native
  var epoch_time: Double = js.native
  var timezone: String = js.native
}

object Time {
  @scala.inline
  def apply(Dollarreql_typeDollar: TIME, epoch_time: Double, timezone: String): Time = {
    val __obj = js.Dynamic.literal(epoch_time = epoch_time.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  @scala.inline
  implicit class TimeOps[Self <: Time] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDollarreql_typeDollar(value: TIME): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$reql_type$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpoch_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epoch_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

