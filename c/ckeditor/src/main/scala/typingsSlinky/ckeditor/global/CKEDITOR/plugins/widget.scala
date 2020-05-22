package typingsSlinky.ckeditor.global.CKEDITOR.plugins

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.node
import typingsSlinky.ckeditor.CKEDITOR.editable
import typingsSlinky.ckeditor.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.widget")
@js.native
class widget protected ()
  extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget {
  def this(
    widgetsRepo: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.repository,
    id: Double,
    element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
    widgetDef: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
  ) = this()
  def this(
    widgetsRepo: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.repository,
    id: Double,
    element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
    widgetDef: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition,
    starupData: js.Any
  ) = this()
}

@JSGlobal("CKEDITOR.plugins.widget")
@js.native
object widget extends js.Object {
  @js.native
  class nestedEditable protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget.nestedEditable {
    def this(
      editor: typingsSlinky.ckeditor.CKEDITOR.editor,
      element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      config: Filter
    ) = this()
  }
  
  @js.native
  class repository ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget.repository
  
  @js.native
  class widgetselection ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget.widgetselection {
    /* CompleteClass */
    override def addFillers(editable: editable): Boolean = js.native
    /* CompleteClass */
    override def removeFillers(editable: editable): Unit = js.native
  }
  
  var WRAPPER_CLASS_PREFIX: String = js.native
  def getNestedEditable(guard: element, node: node): element = js.native
  def isDomDragHandler(node: node): Boolean = js.native
  def isDomDragHandlerContainer(node: node): Boolean = js.native
  def isDomNestedEditable(node: node): Boolean = js.native
  def isDomWidget(node: node): Boolean = js.native
  def isDomWidgetElement(node: node): Boolean = js.native
  def isDomWidgetWrapper(node: node): Boolean = js.native
  def isParserWidgetElement(node: node): Boolean = js.native
  def isParserWidgetWrapper(node: node): Boolean = js.native
}

