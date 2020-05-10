package typingsSlinky.connectMongo.mod

import typingsSlinky.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeMongoPromiseOptions extends DefaultOptions {
  var clientPromise: js.Promise[MongoClient] = js.native
}

object NativeMongoPromiseOptions {
  @scala.inline
  def apply(clientPromise: js.Promise[MongoClient]): NativeMongoPromiseOptions = {
    val __obj = js.Dynamic.literal(clientPromise = clientPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeMongoPromiseOptions]
  }
  @scala.inline
  implicit class NativeMongoPromiseOptionsOps[Self <: NativeMongoPromiseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientPromise(value: js.Promise[MongoClient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPromise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

