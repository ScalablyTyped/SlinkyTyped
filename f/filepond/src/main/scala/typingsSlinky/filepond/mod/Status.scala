package typingsSlinky.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends StObject
@JSImport("filepond", "Status")
@js.native
object Status extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  
  @js.native
  sealed trait BUSY extends Status
  /* 3 */ val BUSY: typingsSlinky.filepond.mod.Status.BUSY with Double = js.native
  
  @js.native
  sealed trait EMPTY extends Status
  /* 0 */ val EMPTY: typingsSlinky.filepond.mod.Status.EMPTY with Double = js.native
  
  @js.native
  sealed trait ERROR extends Status
  /* 2 */ val ERROR: typingsSlinky.filepond.mod.Status.ERROR with Double = js.native
  
  @js.native
  sealed trait IDLE extends Status
  /* 1 */ val IDLE: typingsSlinky.filepond.mod.Status.IDLE with Double = js.native
  
  @js.native
  sealed trait READY extends Status
  /* 4 */ val READY: typingsSlinky.filepond.mod.Status.READY with Double = js.native
}
