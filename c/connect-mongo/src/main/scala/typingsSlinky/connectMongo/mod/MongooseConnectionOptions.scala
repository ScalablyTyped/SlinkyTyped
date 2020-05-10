package typingsSlinky.connectMongo.mod

import typingsSlinky.mongoose.mod.Connection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongooseConnectionOptions extends DefaultOptions {
  var mongooseConnection: Connection_ = js.native
}

object MongooseConnectionOptions {
  @scala.inline
  def apply(mongooseConnection: Connection_): MongooseConnectionOptions = {
    val __obj = js.Dynamic.literal(mongooseConnection = mongooseConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongooseConnectionOptions]
  }
  @scala.inline
  implicit class MongooseConnectionOptionsOps[Self <: MongooseConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMongooseConnection(value: Connection_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongooseConnection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

