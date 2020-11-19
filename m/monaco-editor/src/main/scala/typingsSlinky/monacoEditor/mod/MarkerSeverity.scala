package typingsSlinky.monacoEditor.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerSeverity extends js.Object
@JSImport("monaco-editor", "MarkerSeverity")
@js.native
object MarkerSeverity extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSeverity with Double] = js.native
  
  @js.native
  sealed trait Error extends MarkerSeverity
  /* 8 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Hint extends MarkerSeverity
  /* 1 */ @js.native
  object Hint extends TopLevel[Hint with Double]
  
  @js.native
  sealed trait Info extends MarkerSeverity
  /* 2 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  @js.native
  sealed trait Warning extends MarkerSeverity
  /* 4 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
