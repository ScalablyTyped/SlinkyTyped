package typingsSlinky.gapiClientSqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelectQuery extends js.Object {
  /** The select query used to extract the data. */
  var selectQuery: js.UndefOr[String] = js.native
}

object AnonSelectQuery {
  @scala.inline
  def apply(): AnonSelectQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSelectQuery]
  }
  @scala.inline
  implicit class AnonSelectQueryOps[Self <: AnonSelectQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectQuery")(js.undefined)
        ret
    }
  }
  
}

