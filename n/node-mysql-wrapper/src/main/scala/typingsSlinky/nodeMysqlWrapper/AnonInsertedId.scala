package typingsSlinky.nodeMysqlWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInsertedId extends js.Object {
  var insertedId: js.UndefOr[String] = js.native
  var numberAffected: js.UndefOr[Double] = js.native
}

object AnonInsertedId {
  @scala.inline
  def apply(): AnonInsertedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInsertedId]
  }
  @scala.inline
  implicit class AnonInsertedIdOps[Self <: AnonInsertedId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedId")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberAffected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAffected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberAffected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAffected")(js.undefined)
        ret
    }
  }
  
}

