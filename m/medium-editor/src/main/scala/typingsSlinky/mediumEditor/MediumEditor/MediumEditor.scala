package typingsSlinky.mediumEditor.MediumEditor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.Range
import typingsSlinky.mediumEditor.anon.Major
import typingsSlinky.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediumEditor
  extends // Initialization Functions
Instantiable1[/* elements */ elementType, typingsSlinky.mediumEditor.MediumEditor.MediumEditor]
     with Instantiable2[
      /* elements */ elementType, 
      /* options */ CoreOptions, 
      typingsSlinky.mediumEditor.MediumEditor.MediumEditor
    ] {
  
  def addElements(elements: elementType): Unit = js.native
  
  // Helper Functions
  def checkContentChanged(): Unit = js.native
  def checkContentChanged(editable: HTMLElement): Unit = js.native
  
  // Selection Functions
  def checkSelection(): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  
  // Editor Action Functions
  def cleanPaste(text: String): Unit = js.native
  
  def createLink(opts: CreateLinkOptions): Unit = js.native
  
  def delay(fn: js.Function0[_]): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def execAction(action: String): Boolean = js.native
  def execAction(action: String, opts: String): Boolean = js.native
  def execAction(action: String, opts: CreateLinkOptions): Boolean = js.native
  
  def exportSelection(): selectionObject = js.native
  
  def getContent(): String = js.native
  def getContent(index: Double): String = js.native
  
  // Static Function
  def getEditorFromElement(element: HTMLElement): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  
  def getExtensionByName(name: String): js.Any = js.native
  
  def getFocusedElement(): HTMLElement = js.native
  
  def getSelectedParentElement(): HTMLElement = js.native
  def getSelectedParentElement(range: Range): HTMLElement = js.native
  
  def importSelection(selectionState: selectionObject, favorLaterSelectionAnchor: Boolean): Unit = js.native
  
  def off(
    targets: HTMLElement,
    event: String,
    listener: EventListenerOrEventListenerObject,
    useCapture: Boolean
  ): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  def off(
    targets: NodeList,
    event: String,
    listener: EventListenerOrEventListenerObject,
    useCapture: Boolean
  ): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  
  // Event Functions
  def on(
    targets: HTMLElement,
    event: String,
    listener: EventListenerOrEventListenerObject,
    useCapture: Boolean
  ): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  def on(
    targets: NodeList,
    event: String,
    listener: EventListenerOrEventListenerObject,
    useCapture: Boolean
  ): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  
  def pasteHTML(html: String): Unit = js.native
  def pasteHTML(html: String, options: PasteHTMLOptions): Unit = js.native
  
  def queryCommandState(action: String): Boolean = js.native
  
  def removeElements(elements: elementType): Unit = js.native
  
  def resetContent(element: HTMLElement): Unit = js.native
  
  def restoreSelection(): Unit = js.native
  
  def saveSelection(): Unit = js.native
  
  def selectAllContents(): Unit = js.native
  
  def selectElement(element: HTMLElement): Unit = js.native
  
  def serialize(): js.Any = js.native
  
  def setContent(html: String): Unit = js.native
  def setContent(html: String, index: Double): Unit = js.native
  
  def setup(): Unit = js.native
  
  def startSelectionUpdates(): Unit = js.native
  
  def stopSelectionUpdates(): Unit = js.native
  
  def subscribe(name: String, listener: js.Function2[/* data */ js.Any, /* editable */ HTMLElement, Unit]): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  
  def trigger(name: String, data: js.Any, editable: HTMLElement): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  
  def unsubscribe(name: String, listener: js.Function2[/* data */ js.Any, /* editable */ HTMLElement, Unit]): typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
  
  // Properties
  var version: Major = js.native
}
