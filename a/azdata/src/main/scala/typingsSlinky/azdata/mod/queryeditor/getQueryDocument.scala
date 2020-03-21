package typingsSlinky.azdata.mod.queryeditor

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "queryeditor.getQueryDocument")
@js.native
object getQueryDocument extends js.Object {
  def apply(fileUri: String): Thenable[QueryDocument] = js.native
}

