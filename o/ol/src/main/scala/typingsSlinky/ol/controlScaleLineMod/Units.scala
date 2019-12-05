package typingsSlinky.ol.controlScaleLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Units extends js.Object

@JSImport("ol/control/ScaleLine", "Units")
@js.native
object Units extends js.Object {
  @js.native
  sealed trait DEGREES extends Units
  
  @js.native
  sealed trait IMPERIAL extends Units
  
  @js.native
  sealed trait METRIC extends Units
  
  @js.native
  sealed trait NAUTICAL extends Units
  
  @js.native
  sealed trait US extends Units
  
  /* "degrees" */ val DEGREES: typingsSlinky.ol.controlScaleLineMod.Units.DEGREES with String = js.native
  /* "imperial" */ val IMPERIAL: typingsSlinky.ol.controlScaleLineMod.Units.IMPERIAL with String = js.native
  /* "metric" */ val METRIC: typingsSlinky.ol.controlScaleLineMod.Units.METRIC with String = js.native
  /* "nautical" */ val NAUTICAL: typingsSlinky.ol.controlScaleLineMod.Units.NAUTICAL with String = js.native
  /* "us" */ val US: typingsSlinky.ol.controlScaleLineMod.Units.US with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Units with String] = js.native
}

