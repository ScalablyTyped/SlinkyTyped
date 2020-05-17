package typingsSlinky.maxmind.anon

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
  def apply(path: Double): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: Double, options: EncodingFlag): js.Promise[String] = js.native
  def apply(path: Double, options: Flag): js.Promise[Buffer] = js.native
  def apply(path: Double, options: FlagString): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: EncodingFlag): js.Promise[String] = js.native
  def apply(path: PathLike, options: Flag): js.Promise[Buffer] = js.native
  def apply(path: PathLike, options: FlagString): js.Promise[String | Buffer] = js.native
}

