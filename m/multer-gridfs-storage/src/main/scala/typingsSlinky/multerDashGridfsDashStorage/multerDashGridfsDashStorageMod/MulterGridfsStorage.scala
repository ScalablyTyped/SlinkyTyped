package typingsSlinky.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Request
import typingsSlinky.mongodb.mongodbMod.Db
import typingsSlinky.mongodb.mongodbMod.MongoClient
import typingsSlinky.multer.multerMod.StorageEngine
import typingsSlinky.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod._Global_.Express.Multer.File
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulterGridfsStorage
  extends EventEmitter
     with StorageEngine {
  var cacheIndex: js.Object = js.native
  var cacheName: String = js.native
  var caching: Boolean = js.native
  var client: MongoClient = js.native
  var configuration: UrlStorageOptions | DbStorageOptions = js.native
  var connected: Boolean = js.native
  var connecting: Boolean = js.native
  var db: Db = js.native
  var error: js.Error = js.native
  def _handleFile(
    req: Request,
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]
  ): Unit = js.native
  def _removeFile(req: Request, file: File, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  def ready(): js.Promise[ConnectionResult] = js.native
}

