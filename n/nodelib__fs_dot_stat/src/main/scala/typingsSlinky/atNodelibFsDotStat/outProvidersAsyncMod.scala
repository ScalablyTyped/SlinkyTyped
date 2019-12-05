package typingsSlinky.atNodelibFsDotStat

import typingsSlinky.atNodelibFsDotStat.outProvidersAsyncMod.AsyncCallback
import typingsSlinky.atNodelibFsDotStat.outSettingsMod.default
import typingsSlinky.atNodelibFsDotStat.outTypesMod.ErrnoException
import typingsSlinky.atNodelibFsDotStat.outTypesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat/out/providers/async", JSImport.Namespace)
@js.native
object outProvidersAsyncMod extends js.Object {
  def read(path: String, settings: default, callback: AsyncCallback): Unit = js.native
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit]
}

