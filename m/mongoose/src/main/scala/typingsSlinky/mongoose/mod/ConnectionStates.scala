package typingsSlinky.mongoose.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionStates extends js.Object
@JSImport("mongoose", "ConnectionStates")
@js.native
object ConnectionStates extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionStates with Double] = js.native
  
  @js.native
  sealed trait connected extends ConnectionStates
  /* 1 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  @js.native
  sealed trait connecting extends ConnectionStates
  /* 2 */ @js.native
  object connecting extends TopLevel[connecting with Double]
  
  @js.native
  sealed trait disconnected extends ConnectionStates
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  @js.native
  sealed trait disconnecting extends ConnectionStates
  /* 3 */ @js.native
  object disconnecting extends TopLevel[disconnecting with Double]
  
  @js.native
  sealed trait uninitialized extends ConnectionStates
  /* 99 */ @js.native
  object uninitialized extends TopLevel[uninitialized with Double]
}
