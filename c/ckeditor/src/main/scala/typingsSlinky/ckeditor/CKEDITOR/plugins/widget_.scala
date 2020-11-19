package typingsSlinky.ckeditor.CKEDITOR.plugins

import typingsSlinky.ckeditor.CKEDITOR.event
import typingsSlinky.ckeditor.CKEDITOR.plugins.widget.nestedEditable
import typingsSlinky.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait widget_
  extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
     with event {
  
  def addClass(className: String): Unit = js.native
  
  def applyStyle(style: style): Unit = js.native
  
  def checkStyleActive(style: style): Boolean = js.native
  
  val dataReady: Boolean = js.native
  
  val definition: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition = js.native
  
  def destroy(): Unit = js.native
  def destroy(offline: Boolean): Unit = js.native
  
  def destroyEditable(editableName: String): Unit = js.native
  def destroyEditable(editableName: String, offline: Boolean): Unit = js.native
  
  @JSName("edit")
  def edit_Mwidget_(): Boolean = js.native
  
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  
  val element: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  
  def focus(): Unit = js.native
  
  val focusedEditable: nestedEditable = js.native
  
  def getClasses(): js.Any = js.native
  
  def hasClass(className: String, Whether: Boolean): Unit = js.native
  
  val id: Double = js.native
  
  def initEditable(
    editableName: String,
    definition: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.nestedEditable.definition
  ): Boolean = js.native
  
  val inited: Boolean = js.native
  
  def isInited(): Boolean = js.native
  
  def isReady(): Boolean = js.native
  
  val ready: Boolean = js.native
  
  def removeClass(className: String): Unit = js.native
  
  def removeStyle(style: style): Unit = js.native
  
  val repository: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.repository = js.native
  
  def setData(keyOrData: js.Any, value: js.Any): widget = js.native
  
  def setFocused(selected: Boolean): widget = js.native
  
  def setSelected(selected: Boolean): widget = js.native
  
  def updateDragHandlerPosition(): Unit = js.native
  
  val wrapper: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
}
