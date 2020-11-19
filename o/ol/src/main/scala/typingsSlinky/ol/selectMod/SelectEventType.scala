package typingsSlinky.ol.selectMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectEventType extends js.Object
@JSImport("ol/interaction/Select", "SelectEventType")
@js.native
object SelectEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectEventType with String] = js.native
  
  @js.native
  sealed trait SELECT extends SelectEventType
  /* "select" */ @js.native
  object SELECT extends TopLevel[SELECT with String]
}
