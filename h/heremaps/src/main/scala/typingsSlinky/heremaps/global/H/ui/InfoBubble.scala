package typingsSlinky.heremaps.global.H.ui

import typingsSlinky.heremaps.H.geo.IPoint
import typingsSlinky.heremaps.H.ui.InfoBubble.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents an information bubble bound to a geo-position on the map.
  */
@JSGlobal("H.ui.InfoBubble")
@js.native
class InfoBubble protected ()
  extends typingsSlinky.heremaps.H.ui.InfoBubble {
  /**
    * Constructor
    * @param position {H.geo.IPoint} - the geo-position to which this info bubble corresponds
    * @param opt_options {H.ui.InfoBubble.Options=} - optional parameters to be passed to the info bubble
    */
  def this(position: IPoint) = this()
  def this(position: IPoint, opt_options: Options) = this()
}
@JSGlobal("H.ui.InfoBubble")
@js.native
object InfoBubble extends js.Object {
  
  /**
    * This enumeration holds the state an info bubble can have.
    */
  @js.native
  object State extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.heremaps.H.ui.InfoBubble.State with Double] = js.native
    
    /* 1 */ val CLOSED: typingsSlinky.heremaps.H.ui.InfoBubble.State.CLOSED with Double = js.native
    
    /* 0 */ val OPEN: typingsSlinky.heremaps.H.ui.InfoBubble.State.OPEN with Double = js.native
  }
}
