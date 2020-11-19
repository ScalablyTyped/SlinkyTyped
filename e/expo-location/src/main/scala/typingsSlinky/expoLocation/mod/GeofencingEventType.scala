package typingsSlinky.expoLocation.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeofencingEventType extends js.Object
@JSImport("expo-location", "GeofencingEventType")
@js.native
object GeofencingEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofencingEventType with Double] = js.native
  
  @js.native
  sealed trait Enter extends GeofencingEventType
  /* 1 */ @js.native
  object Enter extends TopLevel[Enter with Double]
  
  @js.native
  sealed trait Exit extends GeofencingEventType
  /* 2 */ @js.native
  object Exit extends TopLevel[Exit with Double]
}
