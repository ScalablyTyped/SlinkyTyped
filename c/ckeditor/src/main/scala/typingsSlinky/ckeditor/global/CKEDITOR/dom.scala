package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.Text
import typingsSlinky.ckeditor.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom")
@js.native
object dom extends js.Object {
  @js.native
  class comment protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.comment {
    def this(comment: String) = this()
    def this(comment: Node) = this()
    def this(comment: String, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(comment: Node, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @js.native
  class document protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.document {
    def this(domDocument: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class documentFragment protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.documentFragment {
    def this(nodeOrDoc: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class domObject protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.domObject {
    def this(nativeDomObject: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class element protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.element {
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(element: HTMLElement, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @js.native
  class elementPath protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.elementPath {
    def this(startNode: typingsSlinky.ckeditor.CKEDITOR.dom.element) = this()
    def this(
      startNode: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      root: typingsSlinky.ckeditor.CKEDITOR.dom.element
    ) = this()
  }
  
  @js.native
  class event protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.event {
    def this(domEvent: Event) = this()
  }
  
  @js.native
  class iterator protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.iterator {
    def this(range: typingsSlinky.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  @js.native
  class node protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.node {
    def this(domNode: Node) = this()
  }
  
  @js.native
  class nodeList protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.nodeList {
    def this(nativeList: NodeList) = this()
    /* CompleteClass */
    override def count(): Double = js.native
    /* CompleteClass */
    override def getItem(index: Double): typingsSlinky.ckeditor.CKEDITOR.dom.node = js.native
    /* CompleteClass */
    override def toArray(): js.Array[typingsSlinky.ckeditor.CKEDITOR.dom.node] = js.native
  }
  
  @js.native
  class range protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.range {
    def this(root: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(root: typingsSlinky.ckeditor.CKEDITOR.dom.element) = this()
  }
  
  @js.native
  class rangeList ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.rangeList {
    def this(ranges: js.Array[typingsSlinky.ckeditor.CKEDITOR.dom.range]) = this()
    def this(ranges: typingsSlinky.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  // see https://docs.com/ckeditor4/latest/api/CKEDITOR_dom_selection.html
  @js.native
  class selection protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.selection {
    def this(target: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(target: typingsSlinky.ckeditor.CKEDITOR.dom.element) = this()
    def this(target: typingsSlinky.ckeditor.CKEDITOR.dom.selection) = this()
  }
  
  @js.native
  class text protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.text {
    def this(text: String) = this()
    def this(text: Text) = this()
    def this(text: String, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(text: Text, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @js.native
  class walker protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.walker {
    def this(range: typingsSlinky.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  @js.native
  class window protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.window {
    def this(domWindow: Window) = this()
  }
  
  /* static members */
  @js.native
  object element extends js.Object {
    // static method
    def clearAllMarkers(database: js.Any): js.Any = js.native
    def clearMarkers(
      database: js.Any,
      element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      removeFromDatabase: Boolean
    ): Unit = js.native
    def createFromHtml(html: String): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
    def get(element: String): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
    def get(element: typingsSlinky.ckeditor.CKEDITOR.dom.element): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
    def get(element: HTMLElement): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
    def setMarker(
      database: js.Any,
      element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      name: String,
      value: js.Any
    ): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  }
  
  /* static members */
  @js.native
  object range extends js.Object {
    def mergeRanges(ranges: js.Array[typingsSlinky.ckeditor.CKEDITOR.dom.range]): js.Array[typingsSlinky.ckeditor.CKEDITOR.dom.range] = js.native
  }
  
  /* static members */
  @js.native
  object walker extends js.Object {
    var validEmptyBlockContainers: StringDictionary[js.Any] = js.native
    def blockBoundary(customNodeNames: js.Any): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bogus(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bogus(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bookmark(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bookmark(contentOnly: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def bookmark(contentOnly: Boolean, isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def editable(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def editable(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def empty(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def empty(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def ignored(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def ignored(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def invisible(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def invisible(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def listItemBoundary(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def nodeType(`type`: Double): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def nodeType(`type`: Double, isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def temp(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def temp(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def whitespaces(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    def whitespaces(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
  }
  
}

