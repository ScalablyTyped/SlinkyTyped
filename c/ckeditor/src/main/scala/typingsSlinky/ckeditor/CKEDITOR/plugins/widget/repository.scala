package typingsSlinky.ckeditor.CKEDITOR.plugins.widget

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.event
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.element
import typingsSlinky.ckeditor.anon.FocusInited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait repository extends event {
  
  def add(name: String, widgetDef: definition): Unit = js.native
  
  def addUpcastCallback(callback: js.Function2[/* element */ element, /* data */ js.Any, Boolean]): Unit = js.native
  
  def checkSelection(): Unit = js.native
  
  def checkWidgets(): Unit = js.native
  def checkWidgets(options: FocusInited): Unit = js.native
  
  def del(widget: typingsSlinky.ckeditor.CKEDITOR.plugins.widget): Unit = js.native
  
  def destroy(widget: typingsSlinky.ckeditor.CKEDITOR.plugins.widget): Unit = js.native
  def destroy(widget: typingsSlinky.ckeditor.CKEDITOR.plugins.widget, offline: Boolean): Unit = js.native
  
  def destroyAll(): Unit = js.native
  def destroyAll(offline: Boolean): Unit = js.native
  
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  
  def finalizeCreation(container: js.Any): Unit = js.native
  
  val focused: typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  
  def getByElement(element: js.Any, checkWrapperOnly: Boolean): typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  
  def initOn(element: typingsSlinky.ckeditor.CKEDITOR.dom.element): typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(
    element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
    widgetDef: js.UndefOr[scala.Nothing],
    startupData: StringDictionary[js.Any]
  ): typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(element: typingsSlinky.ckeditor.CKEDITOR.dom.element, widgetDef: String): typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(
    element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
    widgetDef: String,
    startupData: StringDictionary[js.Any]
  ): typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(element: typingsSlinky.ckeditor.CKEDITOR.dom.element, widgetDef: definition): typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(
    element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
    widgetDef: definition,
    startupData: StringDictionary[js.Any]
  ): typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  
  def initOnAll(): js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.widget] = js.native
  def initOnAll(container: typingsSlinky.ckeditor.CKEDITOR.dom.element): js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.widget] = js.native
  
  val instances: StringDictionary[typingsSlinky.ckeditor.CKEDITOR.plugins.widget] = js.native
  
  def parseElementClasses(classes: String): js.Any = js.native
  
  val registered: StringDictionary[definition] = js.native
  
  val selected: js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.widget] = js.native
  
  val widgetHoldingFocusedEditable: typingsSlinky.ckeditor.CKEDITOR.plugins.widget = js.native
  
  def wrapElement(element: js.Any): js.Any = js.native
  def wrapElement(element: js.Any, widgetName: String): js.Any = js.native
}
