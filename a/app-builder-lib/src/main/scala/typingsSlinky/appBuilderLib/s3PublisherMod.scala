package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.baseS3PublisherMod.BaseS3Publisher
import typingsSlinky.builderUtilRuntime.publishOptionsMod.S3Options
import typingsSlinky.electronPublish.mod.PublishContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/s3/s3Publisher", JSImport.Namespace)
@js.native
object s3PublisherMod extends js.Object {
  @js.native
  trait S3Publisher extends BaseS3Publisher {
    val info: js.Any = js.native
  }
  
  @js.native
  class default protected () extends S3Publisher {
    def this(context: PublishContext, info: S3Options) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def checkAndResolveOptions(options: S3Options, channelFromAppVersion: String, errorIfCannot: Boolean): js.Promise[Unit] = js.native
    def checkAndResolveOptions(options: S3Options, channelFromAppVersion: Null, errorIfCannot: Boolean): js.Promise[Unit] = js.native
  }
  
}

