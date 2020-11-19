package typingsSlinky.novaEditorNode.global

import typingsSlinky.novaEditorNode.anon.Cwd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/process/
// This could be improved to split into automatic pipe and jsonrpc types with
// the appropriate methods enabled, but because stdio is configured within
// options it feels like overkill
@JSGlobal("Process")
@js.native
class Process protected ()
  extends typingsSlinky.novaEditorNode.Process {
  def this(command: String) = this()
  def this(command: String, options: Cwd) = this()
}
