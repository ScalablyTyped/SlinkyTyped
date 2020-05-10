package typingsSlinky.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColl extends js.Object {
  var coll: String = js.native
  var db: String = js.native
}

object AnonColl {
  @scala.inline
  def apply(coll: String, db: String): AnonColl = {
    val __obj = js.Dynamic.literal(coll = coll.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColl]
  }
  @scala.inline
  implicit class AnonCollOps[Self <: AnonColl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

