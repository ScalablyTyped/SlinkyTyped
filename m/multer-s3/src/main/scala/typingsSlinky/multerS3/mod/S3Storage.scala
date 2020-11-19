package typingsSlinky.multerS3.mod

import typingsSlinky.expressServeStaticCore.mod.global.Express.Request
import typingsSlinky.multer.mod.StorageEngine
import typingsSlinky.multer.mod.global.Express.Multer.File
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Storage extends js.Object {
  
  def apply(): StorageEngine = js.native
  def apply(options: Options): StorageEngine = js.native
  
  def AUTO_CONTENT_TYPE(
    req: Request,
    file: File,
    callback: js.Function3[
      /* error */ js.Any, 
      /* mime */ js.UndefOr[String], 
      /* stream */ js.UndefOr[ReadableStream], 
      Unit
    ]
  ): Unit = js.native
  
  def DEFAULT_CONTENT_TYPE(
    req: Request,
    file: File,
    callback: js.Function2[/* error */ js.Any, /* mime */ js.UndefOr[String], Unit]
  ): Unit = js.native
}
