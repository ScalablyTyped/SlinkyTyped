package typingsSlinky.novaEditorNode.global

import typingsSlinky.novaEditorNode.anon.Args
import typingsSlinky.novaEditorNode.anon.Syntaxes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/language-client/
@JSGlobal("LanguageClient")
@js.native
class LanguageClient protected ()
  extends typingsSlinky.novaEditorNode.LanguageClient {
  def this(identifier: String, name: String, serverOptions: Args, clientOptions: Syntaxes) = this()
}

