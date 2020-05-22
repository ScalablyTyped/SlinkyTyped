package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "appendFileSync")
@js.native
object appendFileSync extends js.Object {
  def apply(file: Double, data: String): Unit = js.native
  def apply(file: Double, data: String, options: WriteFileOptions): Unit = js.native
  def apply(file: Double, data: js.typedarray.Uint8Array): Unit = js.native
  def apply(file: Double, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: String): Unit = js.native
  def apply(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: js.typedarray.Uint8Array): Unit = js.native
  def apply(file: PathLike, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
}

