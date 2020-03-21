package typingsSlinky.nodelibFsScandir

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.nodelibFsScandir.settingsMod.default
import typingsSlinky.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/providers/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  def read(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  def readdir(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  def readdirWithFileTypes(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* entries */ js.Array[Entry], Unit]
}

