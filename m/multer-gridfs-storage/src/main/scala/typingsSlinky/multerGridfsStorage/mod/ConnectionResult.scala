package typingsSlinky.multerGridfsStorage.mod

import typingsSlinky.mongodb.mod.Db
import typingsSlinky.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionResult extends js.Object {
  var client: js.UndefOr[MongoClient] = js.native
  var db: Db = js.native
}

object ConnectionResult {
  @scala.inline
  def apply(db: Db): ConnectionResult = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionResult]
  }
  @scala.inline
  implicit class ConnectionResultOps[Self <: ConnectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDb(value: Db): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: MongoClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
  }
  
}

