package typingsSlinky.browserfs

import typingsSlinky.browserfs.apiErrorMod.ApiError
import typingsSlinky.browserfs.browserfsStrings.buffer
import typingsSlinky.browserfs.browserfsStrings.json
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrMod {
  
  @JSImport("browserfs/dist/node/generic/xhr", "asyncDownloadFile")
  @js.native
  def asyncDownloadFile(p: String, `type`: String, cb: BFSCallback[_]): Unit = js.native
  @JSImport("browserfs/dist/node/generic/xhr", "asyncDownloadFile")
  @js.native
  def asyncDownloadFile(p: String, `type`: buffer, cb: BFSCallback[Buffer]): Unit = js.native
  @JSImport("browserfs/dist/node/generic/xhr", "asyncDownloadFile")
  @js.native
  def asyncDownloadFile(p: String, `type`: json, cb: BFSCallback[_]): Unit = js.native
  
  @JSImport("browserfs/dist/node/generic/xhr", "getFileSizeAsync")
  @js.native
  def getFileSizeAsync(p: String, cb: js.Function2[/* err */ ApiError, /* size */ js.UndefOr[Double], Unit]): Unit = js.native
  
  @JSImport("browserfs/dist/node/generic/xhr", "getFileSizeSync")
  @js.native
  def getFileSizeSync(p: String): Double = js.native
  
  @JSImport("browserfs/dist/node/generic/xhr", "syncDownloadFile")
  @js.native
  def syncDownloadFile(p: String, `type`: String): js.Any = js.native
  @JSImport("browserfs/dist/node/generic/xhr", "syncDownloadFile")
  @js.native
  def syncDownloadFile(p: String, `type`: buffer): Buffer = js.native
  @JSImport("browserfs/dist/node/generic/xhr", "syncDownloadFile")
  @js.native
  def syncDownloadFile(p: String, `type`: json): js.Any = js.native
}
