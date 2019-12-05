package typingsSlinky.atNodelibFsDotScandir

import typingsSlinky.atNodelibFsDotScandir.atNodelibFsDotScandirMod.AsyncCallback
import typingsSlinky.atNodelibFsDotScandir.outSettingsMod.Options
import typingsSlinky.atNodelibFsDotScandir.outSettingsMod.default
import typingsSlinky.atNodelibFsDotScandir.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir", JSImport.Namespace)
@js.native
object atNodelibFsDotScandirMod extends js.Object {
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  def scandirSync(path: String): js.Array[Entry] = js.native
  def scandirSync(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def scandirSync(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
  @js.native
  object scandir extends js.Object {
    def apply(path: String, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
    def __promisify__(path: String): js.Promise[js.Array[Entry]] = js.native
    def __promisify__(path: String, optionsOrSettings: Options): js.Promise[js.Array[Entry]] = js.native
    def __promisify__(path: String, optionsOrSettings: default): js.Promise[js.Array[Entry]] = js.native
  }
  
  type AsyncCallback = typingsSlinky.atNodelibFsDotScandir.outProvidersAsyncMod.AsyncCallback
}

