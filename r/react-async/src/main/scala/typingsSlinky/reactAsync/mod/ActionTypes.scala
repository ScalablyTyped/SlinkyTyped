package typingsSlinky.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("react-async", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  
  @js.native
  sealed trait cancel extends ActionTypes
  /* "cancel" */ val cancel: typingsSlinky.reactAsync.mod.ActionTypes.cancel with String = js.native
  
  @js.native
  sealed trait fulfill extends ActionTypes
  /* "fulfill" */ val fulfill: typingsSlinky.reactAsync.mod.ActionTypes.fulfill with String = js.native
  
  @js.native
  sealed trait reject extends ActionTypes
  /* "reject" */ val reject: typingsSlinky.reactAsync.mod.ActionTypes.reject with String = js.native
  
  @js.native
  sealed trait start extends ActionTypes
  /* "start" */ val start: typingsSlinky.reactAsync.mod.ActionTypes.start with String = js.native
}
