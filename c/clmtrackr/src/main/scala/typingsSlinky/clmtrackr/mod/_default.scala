package typingsSlinky.clmtrackr.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.clmtrackr.clmtrackrBooleans.`false`
import typingsSlinky.clmtrackr.clmtrackrStrings.blend
import typingsSlinky.clmtrackr.clmtrackrStrings.cycle
import typingsSlinky.clmtrackr.clmtrackrStrings.lbp
import typingsSlinky.clmtrackr.clmtrackrStrings.raw
import typingsSlinky.clmtrackr.clmtrackrStrings.single
import typingsSlinky.clmtrackr.clmtrackrStrings.sobel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("clmtrackr", "_default")
@js.native
object _default extends js.Object {
  
  @js.native
  trait tracker extends js.Object {
    
    def draw(canvas: HTMLCanvasElement): Unit = js.native
    
    def getConvergence(): Double = js.native
    
    def getCurrentParameters(): js.Array[Double] = js.native
    
    def getCurrentPosition(): js.Array[IPosition] | `false` = js.native
    
    def getScore(): Double = js.native
    
    def init(): Unit = js.native
    def init(model: Model): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setResponseMode(`type`: blend, list: js.Array[raw | sobel | lbp]): Unit = js.native
    def setResponseMode(`type`: cycle, list: js.Array[raw | sobel | lbp]): Unit = js.native
    def setResponseMode(`type`: single, list: js.Array[raw | sobel | lbp]): Unit = js.native
    
    def start(element: HTMLCanvasElement): Unit = js.native
    def start(element: HTMLVideoElement): Unit = js.native
    
    def track(element: HTMLCanvasElement): js.Array[IPosition] | `false` = js.native
    def track(element: HTMLVideoElement): js.Array[IPosition] | `false` = js.native
  }
}
