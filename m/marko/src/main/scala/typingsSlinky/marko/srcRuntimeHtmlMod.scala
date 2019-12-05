package typingsSlinky.marko

import typingsSlinky.marko.srcRuntimeHtmlMod.AsyncStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html", JSImport.Namespace)
@js.native
object srcRuntimeHtmlMod extends js.Object {
  def createWriter(writer: js.Any): AsyncStream = js.native
  def enableAsyncStackTrace(): Unit = js.native
  type AsyncStream = typingsSlinky.marko.srcRuntimeHtmlAsyncStreamMod.AsyncStream
  type RenderResult = typingsSlinky.marko.srcRuntimeHtmlRenderResultMod.RenderResult
  type Template = typingsSlinky.marko.srcRuntimeHtmlTemplateMod.Template
}

