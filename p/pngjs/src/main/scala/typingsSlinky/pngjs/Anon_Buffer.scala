package typingsSlinky.pngjs

import typingsSlinky.node.Buffer
import typingsSlinky.pngjs.pngjsMod.PNG
import typingsSlinky.pngjs.pngjsMod.PackerOptions
import typingsSlinky.pngjs.pngjsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Buffer extends js.Object {
  def read(buffer: Buffer): PNG = js.native
  def read(buffer: Buffer, options: ParserOptions): PNG = js.native
  def write(png: PNG): Buffer = js.native
  def write(png: PNG, options: PackerOptions): Buffer = js.native
}

