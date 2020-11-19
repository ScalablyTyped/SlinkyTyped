package typingsSlinky.aceBuilds.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.aceBuilds.anon.PartialEditorOptions
import typingsSlinky.aceBuilds.mod.Ace.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ace-builds", "edit")
@js.native
object edit extends js.Object {
  
  def apply(el: String): Editor = js.native
  def apply(el: String, options: PartialEditorOptions): Editor = js.native
  def apply(el: Element): Editor = js.native
  def apply(el: Element, options: PartialEditorOptions): Editor = js.native
}
