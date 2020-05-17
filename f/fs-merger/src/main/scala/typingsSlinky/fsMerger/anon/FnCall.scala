package typingsSlinky.fsMerger.anon

import typingsSlinky.node.Buffer
import typingsSlinky.node.anon.EncodingFlag
import typingsSlinky.node.anon.Flag
import typingsSlinky.node.anon.FlagString
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: Double): String | Buffer = js.native
  def apply(path: Double, options: String): String = js.native
  def apply(path: Double, options: EncodingFlag): String = js.native
  def apply(path: Double, options: Flag): Buffer = js.native
  def apply(path: Double, options: FlagString): String | Buffer = js.native
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: String): String = js.native
  def apply(path: PathLike, options: EncodingFlag): String = js.native
  def apply(path: PathLike, options: Flag): Buffer = js.native
  def apply(path: PathLike, options: FlagString): String | Buffer = js.native
}

