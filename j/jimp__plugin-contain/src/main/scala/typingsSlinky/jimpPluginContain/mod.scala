package typingsSlinky.jimpPluginContain

import typingsSlinky.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-contain", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Contain = js.native
  
  @js.native
  trait Contain extends js.Object {
    
    def contain(w: Double, h: Double): this.type = js.native
    def contain(
      w: Double,
      h: Double,
      alignBits: js.UndefOr[scala.Nothing],
      mode: js.UndefOr[scala.Nothing],
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def contain(w: Double, h: Double, alignBits: js.UndefOr[scala.Nothing], mode: String): this.type = js.native
    def contain(
      w: Double,
      h: Double,
      alignBits: js.UndefOr[scala.Nothing],
      mode: String,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, cb: ImageCallback[this.type]): this.type = js.native
    def contain(
      w: Double,
      h: Double,
      alignBits: Double,
      mode: js.UndefOr[scala.Nothing],
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, mode: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def contain(w: Double, h: Double, mode: String): this.type = js.native
    def contain(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
  }
}
