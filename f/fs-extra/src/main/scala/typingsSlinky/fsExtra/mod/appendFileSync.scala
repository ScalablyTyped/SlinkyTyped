package typingsSlinky.fsExtra.mod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "appendFileSync")
@js.native
object appendFileSync extends js.Object {
  def apply(file: Double, data: String): Unit = js.native
  def apply(file: Double, data: String, options: typingsSlinky.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(file: Double, data: js.typedarray.Uint8Array): Unit = js.native
  def apply(file: Double, data: js.typedarray.Uint8Array, options: typingsSlinky.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: String): Unit = js.native
  def apply(file: PathLike, data: String, options: typingsSlinky.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: js.typedarray.Uint8Array): Unit = js.native
  def apply(file: PathLike, data: js.typedarray.Uint8Array, options: typingsSlinky.node.fsMod.WriteFileOptions): Unit = js.native
}

