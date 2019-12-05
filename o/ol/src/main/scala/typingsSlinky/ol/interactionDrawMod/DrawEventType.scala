package typingsSlinky.ol.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawEventType extends js.Object

@JSImport("ol/interaction/Draw", "DrawEventType")
@js.native
object DrawEventType extends js.Object {
  @js.native
  sealed trait DRAWEND extends DrawEventType
  
  @js.native
  sealed trait DRAWSTART extends DrawEventType
  
  /* "drawend" */ val DRAWEND: typingsSlinky.ol.interactionDrawMod.DrawEventType.DRAWEND with String = js.native
  /* "drawstart" */ val DRAWSTART: typingsSlinky.ol.interactionDrawMod.DrawEventType.DRAWSTART with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DrawEventType with String] = js.native
}

