package typingsSlinky.ckeditor.global.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.dom.nodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.panel")
@js.native
class panel protected ()
  extends typingsSlinky.ckeditor.CKEDITOR.ui.panel {
  def this(document: typingsSlinky.ckeditor.CKEDITOR.dom.document, definition: StringDictionary[js.Any]) = this()
}

@JSGlobal("CKEDITOR.ui.panel")
@js.native
object panel extends js.Object {
  @js.native
  class block ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.panel.block {
    /* CompleteClass */
    override def getItems(): nodeList = js.native
    /* CompleteClass */
    override def markItem(index: Double): Unit = js.native
  }
  
  val handler: typingsSlinky.ckeditor.CKEDITOR.ui.handlerDefinition[typingsSlinky.ckeditor.CKEDITOR.ui.panel] = js.native
}

