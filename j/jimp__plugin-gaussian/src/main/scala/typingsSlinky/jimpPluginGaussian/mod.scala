package typingsSlinky.jimpPluginGaussian

import typingsSlinky.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-gaussian", JSImport.Default)
  @js.native
  def default(): Gaussian = js.native
  
  @js.native
  trait Gaussian extends StObject {
    
    def gaussian(r: Double): this.type = js.native
    def gaussian(r: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
