package typingsSlinky.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Request
import typingsSlinky.mongodb.mongodbMod.Db
import typingsSlinky.mongodb.mongodbMod.MongoClient
import typingsSlinky.mongoose.mongooseMod.Connection
import typingsSlinky.mongoose.mongooseMod.Mongoose
import typingsSlinky.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod._Global_.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbStorageOptions extends MulterGfsOptions {
  var client: js.UndefOr[MongoClient | js.Promise[MongoClient]] = js.undefined
  var db: Mongoose | Connection | Db | (js.Promise[Mongoose | Connection | Db])
}

object DbStorageOptions {
  @scala.inline
  def apply(
    db: Mongoose | Connection | Db | (js.Promise[Mongoose | Connection | Db]),
    client: MongoClient | js.Promise[MongoClient] = null,
    file: (/* req */ Request, /* file */ File) => _ = null
  ): DbStorageOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2(file))
    __obj.asInstanceOf[DbStorageOptions]
  }
}

