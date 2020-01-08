package typingsSlinky.maxmind

import typingsSlinky.node.Anon_EncodingFlag
import typingsSlinky.node.Anon_EncodingFlagNull
import typingsSlinky.node.Anon_EncodingFlagString
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptionsPath extends js.Object {
  def apply(path: Double): String | Buffer = js.native
  def apply(path: Double, options: String): String | Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlag): Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlagString): String = js.native
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingFlagString): String = js.native
}

