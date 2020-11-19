package typingsSlinky.looksSame

import typingsSlinky.looksSame.anon.BoundingBox
import typingsSlinky.looksSame.originalPngMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("looks-same/build/src/lib/png", JSImport.Namespace)
@js.native
object pngMod extends js.Object {
  
  def create(png: js.Any): default | typingsSlinky.looksSame.boundedPngMod.default = js.native
  def create(png: js.Any, hasBoundingBox: BoundingBox): default | typingsSlinky.looksSame.boundedPngMod.default = js.native
  
  def empty(width: js.Any, height: js.Any): js.Any = js.native
  
  def fromBuffer(buffer: js.Any): js.Promise[_] = js.native
  def fromBuffer(buffer: js.Any, opts: js.Object): js.Promise[_] = js.native
  
  def fromFile(filePath: js.Any): js.Promise[_] = js.native
  def fromFile(filePath: js.Any, opts: js.Object): js.Promise[_] = js.native
}
