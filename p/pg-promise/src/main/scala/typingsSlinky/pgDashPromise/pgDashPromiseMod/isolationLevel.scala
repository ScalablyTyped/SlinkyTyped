package typingsSlinky.pgDashPromise.pgDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait isolationLevel extends js.Object

// Transaction Isolation Level;
// API: http://vitaly-t.github.io/pg-promise/txMode.html#.isolationLevel
@JSImport("pg-promise", "isolationLevel")
@js.native
object isolationLevel extends js.Object {
  @js.native
  sealed trait none extends isolationLevel
  
  @js.native
  sealed trait readCommitted extends isolationLevel
  
  @js.native
  sealed trait repeatableRead extends isolationLevel
  
  @js.native
  sealed trait serializable extends isolationLevel
  
  /* 0 */ val none: typingsSlinky.pgDashPromise.pgDashPromiseMod.isolationLevel.none with Double = js.native
  /* 3 */ val readCommitted: typingsSlinky.pgDashPromise.pgDashPromiseMod.isolationLevel.readCommitted with Double = js.native
  /* 2 */ val repeatableRead: typingsSlinky.pgDashPromise.pgDashPromiseMod.isolationLevel.repeatableRead with Double = js.native
  /* 1 */ val serializable: typingsSlinky.pgDashPromise.pgDashPromiseMod.isolationLevel.serializable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[isolationLevel with Double] = js.native
}

