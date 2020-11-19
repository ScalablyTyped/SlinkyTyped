package typingsSlinky.jimpPluginFisheye

import typingsSlinky.jimpCore.etcMod.ImageCallback
import typingsSlinky.jimpPluginFisheye.anon.R
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-fisheye", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Fisheye = js.native
  
  @js.native
  trait Fisheye extends js.Object {
    
    def fishEye(): this.type = js.native
    def fishEye(cb: ImageCallback[this.type]): this.type = js.native
    def fishEye(opts: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def fishEye(opts: R): this.type = js.native
    def fishEye(opts: R, cb: ImageCallback[this.type]): this.type = js.native
  }
}
