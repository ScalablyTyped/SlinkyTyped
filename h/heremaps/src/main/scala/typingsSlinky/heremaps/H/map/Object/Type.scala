package typingsSlinky.heremaps.H.map.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

/**
  * The major types of map objects
  */
@JSGlobal("H.map.Object.Type")
@js.native
object Type extends js.Object {
  /** spatial object */
  @js.native
  sealed trait ANY extends Type
  
  /** DomMarker object */
  @js.native
  sealed trait DOM_MARKER extends Type
  
  /** DomMarker object */
  @js.native
  sealed trait GROUP extends Type
  
  /** Marker object */
  @js.native
  sealed trait MARKER extends Type
  
  /** spatial object */
  @js.native
  sealed trait OVERLAY extends Type
  
  /** spatial object */
  @js.native
  sealed trait SPATIAL extends Type
  
  /* 0 */ val ANY: typingsSlinky.heremaps.H.map.Object.Type.ANY with Double = js.native
  /* 4 */ val DOM_MARKER: typingsSlinky.heremaps.H.map.Object.Type.DOM_MARKER with Double = js.native
  /* 5 */ val GROUP: typingsSlinky.heremaps.H.map.Object.Type.GROUP with Double = js.native
  /* 3 */ val MARKER: typingsSlinky.heremaps.H.map.Object.Type.MARKER with Double = js.native
  /* 1 */ val OVERLAY: typingsSlinky.heremaps.H.map.Object.Type.OVERLAY with Double = js.native
  /* 2 */ val SPATIAL: typingsSlinky.heremaps.H.map.Object.Type.SPATIAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

