package typingsSlinky.cassandraDriver

import typingsSlinky.cassandraDriver.mod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilter extends js.Object {
  var filter: js.UndefOr[js.Function1[/* host */ Host, Boolean]] = js.native
  var localDc: js.UndefOr[String] = js.native
}

object AnonFilter {
  @scala.inline
  def apply(): AnonFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFilter]
  }
  @scala.inline
  implicit class AnonFilterOps[Self <: AnonFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: /* host */ Host => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalDc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalDc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDc")(js.undefined)
        ret
    }
  }
  
}

