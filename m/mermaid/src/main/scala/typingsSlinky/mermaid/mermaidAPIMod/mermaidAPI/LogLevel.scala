package typingsSlinky.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends js.Object
@JSImport("mermaid/mermaidAPI", "mermaidAPI.LogLevel")
@js.native
object LogLevel extends js.Object {
  
  @js.native
  sealed trait Debug extends LogLevel
  
  @js.native
  sealed trait Error extends LogLevel
  
  @js.native
  sealed trait Fatal extends LogLevel
  
  @js.native
  sealed trait Info extends LogLevel
  
  @js.native
  sealed trait Warn extends LogLevel
}
