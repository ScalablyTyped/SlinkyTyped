package typingsSlinky.electronPublish.mod

import typingsSlinky.electronPublish.progressMod.ProgressBar
import typingsSlinky.fsExtra.mod.Stats
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish", "Publisher")
@js.native
abstract class Publisher protected () extends js.Object {
  protected def this(context: PublishContext) = this()
  val context: PublishContext = js.native
  /* protected */ def createProgressBar(fileName: String, size: Double): ProgressBar | Null = js.native
  /* protected */ def createReadStreamAndProgressBar(file: String, fileStat: Stats, progressBar: Null, reject: js.Function1[/* error */ js.Error, Unit]): ReadableStream = js.native
  /* protected */ def createReadStreamAndProgressBar(
    file: String,
    fileStat: Stats,
    progressBar: ProgressBar,
    reject: js.Function1[/* error */ js.Error, Unit]
  ): ReadableStream = js.native
  def providerName: String = js.native
  def upload(task: UploadTask): js.Promise[_] = js.native
}

