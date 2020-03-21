package typingsSlinky.browserfs

import typingsSlinky.browserfs.apiErrorMod.ApiError
import typingsSlinky.browserfs.browserfsStrings.buffer
import typingsSlinky.browserfs.browserfsStrings.json
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/xhr", JSImport.Namespace)
@js.native
object xhrMod extends js.Object {
  def getFileSizeAsync(p: String, cb: js.Function2[/* err */ ApiError, /* size */ js.UndefOr[Double], Unit]): Unit = js.native
  def getFileSizeSync(p: String): Double = js.native
  @js.native
  object asyncDownloadFile extends js.Object {
    def apply(p: String, `type`: String, cb: BFSCallback[_]): Unit = js.native
    def apply(p: String, `type`: buffer, cb: BFSCallback[Buffer]): Unit = js.native
    def apply(p: String, `type`: json, cb: BFSCallback[_]): Unit = js.native
  }
  
  @js.native
  object syncDownloadFile extends js.Object {
    def apply(p: String, `type`: String): js.Any = js.native
    def apply(p: String, `type`: buffer): Buffer = js.native
    def apply(p: String, `type`: json): js.Any = js.native
  }
  
}

