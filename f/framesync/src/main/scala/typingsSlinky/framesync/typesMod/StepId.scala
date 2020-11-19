package typingsSlinky.framesync.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepId extends js.Object
@JSImport("framesync/lib/types", "StepId")
@js.native
object StepId extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StepId with String] = js.native
  
  @js.native
  sealed trait FixedUpdate extends StepId
  /* "fixedUpdate" */ @js.native
  object FixedUpdate extends TopLevel[FixedUpdate with String]
  
  @js.native
  sealed trait PostRender extends StepId
  /* "postRender" */ @js.native
  object PostRender extends TopLevel[PostRender with String]
  
  @js.native
  sealed trait Read extends StepId
  /* "read" */ @js.native
  object Read extends TopLevel[Read with String]
  
  @js.native
  sealed trait Render extends StepId
  /* "render" */ @js.native
  object Render extends TopLevel[Render with String]
  
  @js.native
  sealed trait Update extends StepId
  /* "update" */ @js.native
  object Update extends TopLevel[Update with String]
}
