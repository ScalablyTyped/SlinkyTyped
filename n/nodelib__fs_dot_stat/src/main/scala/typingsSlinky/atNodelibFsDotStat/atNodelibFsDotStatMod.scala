package typingsSlinky.atNodelibFsDotStat

import typingsSlinky.atNodelibFsDotStat.outSettingsMod.Options
import typingsSlinky.atNodelibFsDotStat.outSettingsMod.default
import typingsSlinky.atNodelibFsDotStat.outTypesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat", JSImport.Namespace)
@js.native
object atNodelibFsDotStatMod extends js.Object {
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  def statSync(path: String): Stats = js.native
  def statSync(path: String, optionsOrSettings: Options): Stats = js.native
  def statSync(path: String, optionsOrSettings: default): Stats = js.native
  @js.native
  object stat extends js.Object {
    def apply(path: String, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
    def __promisify__(path: String): js.Promise[Stats] = js.native
    def __promisify__(path: String, optionsOrSettings: Options): js.Promise[Stats] = js.native
    def __promisify__(path: String, optionsOrSettings: default): js.Promise[Stats] = js.native
  }
  
  type AsyncCallback = typingsSlinky.atNodelibFsDotStat.outProvidersAsyncMod.AsyncCallback
}

