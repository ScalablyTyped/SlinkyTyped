package typingsSlinky.migrateMongo

import typingsSlinky.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClient extends js.Object {
  var client: MongoClient = js.native
  var db: DbcloseMongoClientclose = js.native
}

object AnonClient {
  @scala.inline
  def apply(client: MongoClient, db: DbcloseMongoClientclose): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
  @scala.inline
  implicit class AnonClientOps[Self <: AnonClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: MongoClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDb(value: DbcloseMongoClientclose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

