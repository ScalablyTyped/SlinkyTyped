package typingsSlinky.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusTypes extends StObject
@JSImport("react-async", "StatusTypes")
@js.native
object StatusTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatusTypes with String] = js.native
  
  @js.native
  sealed trait fulfilled extends StatusTypes
  /* "fulfilled" */ val fulfilled: typingsSlinky.reactAsync.mod.StatusTypes.fulfilled with String = js.native
  
  @js.native
  sealed trait initial extends StatusTypes
  /* "initial" */ val initial: typingsSlinky.reactAsync.mod.StatusTypes.initial with String = js.native
  
  @js.native
  sealed trait pending extends StatusTypes
  /* "pending" */ val pending: typingsSlinky.reactAsync.mod.StatusTypes.pending with String = js.native
  
  @js.native
  sealed trait rejected extends StatusTypes
  /* "rejected" */ val rejected: typingsSlinky.reactAsync.mod.StatusTypes.rejected with String = js.native
}
