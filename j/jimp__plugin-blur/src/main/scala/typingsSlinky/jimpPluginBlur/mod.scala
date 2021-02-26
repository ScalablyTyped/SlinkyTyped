package typingsSlinky.jimpPluginBlur

import typingsSlinky.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-blur", JSImport.Default)
  @js.native
  def default(): Blur = js.native
  
  @js.native
  trait Blur extends StObject {
    
    def blur(r: Double): this.type = js.native
    def blur(r: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
