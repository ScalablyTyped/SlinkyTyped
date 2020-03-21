package typingsSlinky.nodelibFsStat

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.nodelibFsStat.optionsMod.StrictOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat/out/providers/stat", JSImport.Namespace)
@js.native
object statMod extends js.Object {
  def async(path: PathLike, options: StrictOptions, callback: AsyncCallback): Unit = js.native
  def isFollowedSymlink(stat: Stats, options: StrictOptions): Boolean = js.native
  def sync(path: PathLike, options: StrictOptions): Stats = js.native
  type AsyncCallback = js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit]
}

