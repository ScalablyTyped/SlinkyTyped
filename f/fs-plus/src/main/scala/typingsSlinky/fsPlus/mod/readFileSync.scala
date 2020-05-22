package typingsSlinky.fsPlus.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.BaseEncodingOptionsflagst
import typingsSlinky.node.anon.EncodingBufferEncoding
import typingsSlinky.node.anon.EncodingNull
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "readFileSync")
@js.native
object readFileSync extends js.Object {
  def apply(path: Double): String | Buffer = js.native
  def apply(path: Double, options: BufferEncoding): String = js.native
  def apply(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  def apply(path: Double, options: EncodingBufferEncoding): String = js.native
  def apply(path: Double, options: EncodingNull): Buffer = js.native
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
  def apply(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  def apply(path: PathLike, options: EncodingBufferEncoding): String = js.native
  def apply(path: PathLike, options: EncodingNull): Buffer = js.native
}

