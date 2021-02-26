package typingsSlinky.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("marko/src/runtime/html", "createWriter")
  @js.native
  def createWriter(writer: js.Any): AsyncStream = js.native
  
  @JSImport("marko/src/runtime/html", "enableAsyncStackTrace")
  @js.native
  def enableAsyncStackTrace(): Unit = js.native
  
  type AsyncStream = typingsSlinky.marko.asyncStreamMod.AsyncStream
  
  type RenderResult = typingsSlinky.marko.renderResultMod.RenderResult
  
  type Template = typingsSlinky.marko.templateMod.Template
}
