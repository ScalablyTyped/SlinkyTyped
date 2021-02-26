package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobCompletionActionCondition extends StObject
@JSImport("azdata", "JobCompletionActionCondition")
@js.native
object JobCompletionActionCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JobCompletionActionCondition with Double] = js.native
  
  @js.native
  sealed trait Always extends JobCompletionActionCondition
  /* 3 */ val Always: typingsSlinky.azdata.mod.JobCompletionActionCondition.Always with Double = js.native
  
  @js.native
  sealed trait Never extends JobCompletionActionCondition
  /* 0 */ val Never: typingsSlinky.azdata.mod.JobCompletionActionCondition.Never with Double = js.native
  
  @js.native
  sealed trait OnFailure extends JobCompletionActionCondition
  /* 2 */ val OnFailure: typingsSlinky.azdata.mod.JobCompletionActionCondition.OnFailure with Double = js.native
  
  @js.native
  sealed trait OnSuccess extends JobCompletionActionCondition
  /* 1 */ val OnSuccess: typingsSlinky.azdata.mod.JobCompletionActionCondition.OnSuccess with Double = js.native
}
