package typingsSlinky.heremaps.global.H.map

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.heremaps.H.map.Icon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A visual representation of the H.map.Marker.
  */
@JSGlobal("H.map.Icon")
@js.native
class Icon protected ()
  extends typingsSlinky.heremaps.H.map.Icon {
  /**
    * Constructor
    * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
    * @param opt_options {H.map.Icon.Options=}
    */
  def this(bitmap: String) = this()
  def this(bitmap: HTMLCanvasElement) = this()
  def this(bitmap: HTMLImageElement) = this()
  def this(bitmap: String, opt_options: Options) = this()
  def this(bitmap: HTMLCanvasElement, opt_options: Options) = this()
  def this(bitmap: HTMLImageElement, opt_options: Options) = this()
}

@JSGlobal("H.map.Icon")
@js.native
object Icon extends js.Object {
  /**
    * The state types of an Icon
    */
  @js.native
  object State extends js.Object {
    /* 0 */ val ERROR: typingsSlinky.heremaps.H.map.Icon.State.ERROR with Double = js.native
    /* 1 */ val LOADING: typingsSlinky.heremaps.H.map.Icon.State.LOADING with Double = js.native
    /* 2 */ val READY: typingsSlinky.heremaps.H.map.Icon.State.READY with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.heremaps.H.map.Icon.State with Double] = js.native
  }
  
}

