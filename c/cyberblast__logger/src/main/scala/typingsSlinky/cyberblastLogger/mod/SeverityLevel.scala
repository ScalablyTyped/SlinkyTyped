package typingsSlinky.cyberblastLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SeverityLevel extends js.Object
@JSImport("@cyberblast/logger", "SeverityLevel")
@js.native
object SeverityLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SeverityLevel with Double] = js.native
  
  @js.native
  sealed trait Error extends SeverityLevel
  /* 4 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Info extends SeverityLevel
  /* 2 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  @js.native
  sealed trait Verbose extends SeverityLevel
  /* 1 */ @js.native
  object Verbose extends TopLevel[Verbose with Double]
  
  @js.native
  sealed trait Warning extends SeverityLevel
  /* 3 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
