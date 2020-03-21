package typingsSlinky.marko

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html", JSImport.Namespace)
@js.native
object htmlMod extends js.Object {
  def createWriter(writer: js.Any): AsyncStream = js.native
  def enableAsyncStackTrace(): Unit = js.native
  type AsyncStream = typingsSlinky.marko.asyncStreamMod.AsyncStream
  type RenderResult = typingsSlinky.marko.renderResultMod.RenderResult
  type Template = typingsSlinky.marko.templateMod.Template
}

