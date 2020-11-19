package typingsSlinky.escpos.mod

import typingsSlinky.escpos.anon.Colors
import typingsSlinky.escpos.anon.Data
import typingsSlinky.escpos.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Image")
@js.native
class Image protected () extends js.Object {
  def this(pixels: js.Any) = this()
  
  def size(): Colors = js.native
  
  def toBitmap(): Data = js.native
  def toBitmap(density: Double): Data = js.native
  
  def toRaster(): Height = js.native
}
/* static members */
@JSImport("escpos", "Image")
@js.native
object Image extends js.Object {
  
  def load(url: String): Unit = js.native
  def load(url: String, callback: js.Function1[/* result */ this.type | js.Error, Unit]): Unit = js.native
  def load(url: String, `type`: MIME_TYPE): Unit = js.native
  def load(url: String, `type`: MIME_TYPE, callback: js.Function1[/* result */ this.type | js.Error, Unit]): Unit = js.native
}
