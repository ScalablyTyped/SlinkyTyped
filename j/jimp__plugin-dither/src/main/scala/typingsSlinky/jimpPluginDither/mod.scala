package typingsSlinky.jimpPluginDither

import typingsSlinky.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-dither", JSImport.Default)
  @js.native
  def default(): Dither = js.native
  
  @js.native
  trait Dither extends StObject {
    
    def dither16(): this.type = js.native
    def dither16(cb: ImageCallback[this.type]): this.type = js.native
    
    def dither565(): this.type = js.native
    def dither565(cb: ImageCallback[this.type]): this.type = js.native
  }
}
