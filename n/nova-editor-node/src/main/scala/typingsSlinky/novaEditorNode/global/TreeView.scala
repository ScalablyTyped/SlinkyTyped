package typingsSlinky.novaEditorNode.global

import typingsSlinky.novaEditorNode.anon.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/tree-view/
@JSGlobal("TreeView")
@js.native
class TreeView[E] protected ()
  extends typingsSlinky.novaEditorNode.TreeView[E] {
  def this(identifier: String) = this()
  def this(identifier: String, options: DataProvider[E]) = this()
}
