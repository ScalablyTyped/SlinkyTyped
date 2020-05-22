package typingsSlinky.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.command
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.elementPath
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.anon.Exec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.indent")
@js.native
object indent extends js.Object {
  @js.native
  class genericDefinition ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.indent.genericDefinition
  
  @js.native
  class specificDefinition ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.indent.specificDefinition {
    /* CompleteClass */
    override var database: StringDictionary[js.Any] = js.native
    /* CompleteClass */
    override val enterBr: Boolean = js.native
    /* CompleteClass */
    override val indentKey: StringDictionary[js.Any] = js.native
    /* CompleteClass */
    override val isIndent: Boolean = js.native
    /* CompleteClass */
    override val jobs: StringDictionary[Exec] = js.native
    /* CompleteClass */
    override val relatedGlobal: StringDictionary[js.Any] = js.native
    /* CompleteClass */
    override def execJob(editor: editor, priority: Double): Boolean = js.native
    /* CompleteClass */
    override def getContext(node: elementPath): element = js.native
    /* CompleteClass */
    override def refreshJob(editor: editor, priority: Double): Double = js.native
  }
  
  def registerCommands(editor: editor, commands: StringDictionary[command]): Unit = js.native
}

