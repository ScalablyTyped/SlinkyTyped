package typingsSlinky.googleapis

import typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInsertId extends js.Object {
  var insertId: js.UndefOr[String] = js.native
  var json: js.UndefOr[SchemaJsonObject] = js.native
}

object AnonInsertId {
  @scala.inline
  def apply(): AnonInsertId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInsertId]
  }
  @scala.inline
  implicit class AnonInsertIdOps[Self <: AnonInsertId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: SchemaJsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
  }
  
}

