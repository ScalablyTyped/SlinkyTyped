package typingsSlinky.broccoliDashOutputDashWrapper

import typingsSlinky.broccoliDashOutputDashWrapper.broccoliDashOutputDashWrapperStrings.buffer
import typingsSlinky.node.Anon_BufferEncodingFalse
import typingsSlinky.node.Anon_EncodingFalse
import typingsSlinky.node.Anon_EncodingFalseWithFileTypes
import typingsSlinky.node.Anon_EncodingTrue
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Buffer extends js.Object {
  def apply(path: PathLike): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
  def apply(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}

