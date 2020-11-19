package typingsSlinky.frctlFractal.mod.fractal.api.files

import typingsSlinky.frctlFractal.mod.fractal.core.mixins.Collection
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCollection extends Collection[File] {
  
  def files(): this.type = js.native
  
  def gulpify(): Readable = js.native
  
  def `match`(test: String): this.type = js.native
  def `match`(test: js.Array[String | js.RegExp]): this.type = js.native
  def `match`(test: js.RegExp): this.type = js.native
  
  def matchItems(items: Collection[File], test: String): File = js.native
  def matchItems(items: Collection[File], test: js.Array[String | js.RegExp]): File = js.native
  def matchItems(items: Collection[File], test: js.RegExp): File = js.native
  
  def toVinylArray(): js.Array[typingsSlinky.vinyl.mod.File] = js.native
  
  def toVinylStream(): Readable = js.native
}
