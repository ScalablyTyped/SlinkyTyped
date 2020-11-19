package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskExecutionMode extends js.Object
@JSImport("azdata", "TaskExecutionMode")
@js.native
object TaskExecutionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskExecutionMode with Double] = js.native
  
  @js.native
  sealed trait execute extends TaskExecutionMode
  /* 0 */ @js.native
  object execute extends TopLevel[execute with Double]
  
  @js.native
  sealed trait executeAndScript extends TaskExecutionMode
  /* 2 */ @js.native
  object executeAndScript extends TopLevel[executeAndScript with Double]
  
  @js.native
  sealed trait script extends TaskExecutionMode
  /* 1 */ @js.native
  object script extends TopLevel[script with Double]
}
