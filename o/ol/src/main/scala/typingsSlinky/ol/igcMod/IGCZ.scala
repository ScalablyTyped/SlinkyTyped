package typingsSlinky.ol.igcMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IGCZ extends js.Object
@JSImport("ol/format/IGC", "IGCZ")
@js.native
object IGCZ extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IGCZ with String] = js.native
  
  @js.native
  sealed trait BAROMETRIC extends IGCZ
  /* "barometric" */ @js.native
  object BAROMETRIC extends TopLevel[BAROMETRIC with String]
  
  @js.native
  sealed trait GPS extends IGCZ
  /* "gps" */ @js.native
  object GPS extends TopLevel[GPS with String]
  
  @js.native
  sealed trait NONE extends IGCZ
  /* "none" */ @js.native
  object NONE extends TopLevel[NONE with String]
}
