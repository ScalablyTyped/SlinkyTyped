package typingsSlinky.jimpPluginNormalize

import typingsSlinky.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-normalize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Normalize = js.native
  
  @js.native
  trait Normalize extends js.Object {
    
    def normalize(): this.type = js.native
    def normalize(cb: ImageCallback[this.type]): this.type = js.native
  }
}
