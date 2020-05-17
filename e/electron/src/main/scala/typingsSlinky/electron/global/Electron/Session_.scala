package typingsSlinky.electron.global.Electron

import typingsSlinky.electron.Electron.FromPartitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Session")
@js.native
class Session_ ()
  extends typingsSlinky.electron.Electron.Session_

/* static members */
@JSGlobal("Electron.Session")
@js.native
object Session_ extends js.Object {
  /**
    * A Session object, the default session object of the app.
    */
  var defaultSession: js.UndefOr[typingsSlinky.electron.Electron.Session_] = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. if there is no
    * persist: prefix, the page will use an in-memory session. If the partition is
    * empty then default session of the app will be returned. To create a Session with
    * options, you have to ensure the Session with the partition has never been used
    * before. There is no way to change the options of an existing Session object.
    */
  def fromPartition(partition: String): typingsSlinky.electron.Electron.Session_ = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): typingsSlinky.electron.Electron.Session_ = js.native
}

