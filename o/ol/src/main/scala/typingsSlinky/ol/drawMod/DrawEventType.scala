package typingsSlinky.ol.drawMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DrawEventType extends js.Object
@JSImport("ol/interaction/Draw", "DrawEventType")
@js.native
object DrawEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DrawEventType with String] = js.native
  
  @js.native
  sealed trait DRAWABORT extends DrawEventType
  /* "drawabort" */ @js.native
  object DRAWABORT extends TopLevel[DRAWABORT with String]
  
  @js.native
  sealed trait DRAWEND extends DrawEventType
  /* "drawend" */ @js.native
  object DRAWEND extends TopLevel[DRAWEND with String]
  
  @js.native
  sealed trait DRAWSTART extends DrawEventType
  /* "drawstart" */ @js.native
  object DRAWSTART extends TopLevel[DRAWSTART with String]
}
