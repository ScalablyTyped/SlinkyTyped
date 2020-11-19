package typingsSlinky.pngjs.anon

import typingsSlinky.node.Buffer
import typingsSlinky.pngjs.mod.PNG
import typingsSlinky.pngjs.mod.PNGWithMetadata
import typingsSlinky.pngjs.mod.PackerOptions
import typingsSlinky.pngjs.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Read extends js.Object {
  
  def read(buffer: Buffer): PNGWithMetadata = js.native
  def read(buffer: Buffer, options: ParserOptions): PNGWithMetadata = js.native
  
  def write(png: PNG): Buffer = js.native
  def write(png: PNG, options: PackerOptions): Buffer = js.native
}
