package typingsSlinky.jimpPluginResize.mod

import typingsSlinky.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeClass extends js.Object {
  
  def resize(w: Double, h: Double): this.type = js.native
  def resize(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  def resize(w: Double, h: Double, mode: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
  def resize(w: Double, h: Double, mode: String): this.type = js.native
  def resize(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
}
