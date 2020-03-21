package typingsSlinky.frctlFractal.mod.fractal.api.files

import typingsSlinky.frctlFractal.mod.fractal.core.mixins.Collection
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileCollection extends Collection[File] {
  def files(): this.type = js.native
  def gulpify(): Readable = js.native
  def `match`(test: String): this.type = js.native
  def `match`(test: js.Array[String | RegExp]): this.type = js.native
  def `match`(test: RegExp): this.type = js.native
  def matchItems(items: Collection[File], test: String): File = js.native
  def matchItems(items: Collection[File], test: js.Array[String | RegExp]): File = js.native
  def matchItems(items: Collection[File], test: RegExp): File = js.native
  def toVinylArray(): js.Array[typingsSlinky.vinyl.mod.File] = js.native
  def toVinylStream(): Readable = js.native
}

