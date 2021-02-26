package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.Text
import typingsSlinky.ckeditor.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  @JSGlobal("CKEDITOR.dom.comment")
  @js.native
  class comment protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.comment {
    def this(comment: String) = this()
    def this(comment: Node) = this()
    def this(comment: String, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(comment: Node, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.document")
  @js.native
  class document protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.document {
    def this(domDocument: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.documentFragment")
  @js.native
  class documentFragment protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.documentFragment {
    def this(nodeOrDoc: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.domObject")
  @js.native
  class domObject protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.domObject {
    def this(nativeDomObject: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.element")
  @js.native
  class element protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.element {
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(element: HTMLElement, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
  }
  object element {
    
    // static method
    /* static member */
    @JSGlobal("CKEDITOR.dom.element.clearAllMarkers")
    @js.native
    def clearAllMarkers(database: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.element.clearMarkers")
    @js.native
    def clearMarkers(
      database: js.Any,
      element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      removeFromDatabase: Boolean
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.element.createFromHtml")
    @js.native
    def createFromHtml(html: String): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.element.get")
    @js.native
    def get(element: String): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
    @JSGlobal("CKEDITOR.dom.element.get")
    @js.native
    def get(element: HTMLElement): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
    @JSGlobal("CKEDITOR.dom.element.get")
    @js.native
    def get(element: typingsSlinky.ckeditor.CKEDITOR.dom.element): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.element.setMarker")
    @js.native
    def setMarker(
      database: js.Any,
      element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      name: String,
      value: js.Any
    ): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  }
  
  @JSGlobal("CKEDITOR.dom.elementPath")
  @js.native
  class elementPath protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.elementPath {
    def this(startNode: typingsSlinky.ckeditor.CKEDITOR.dom.element) = this()
    def this(
      startNode: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      root: typingsSlinky.ckeditor.CKEDITOR.dom.element
    ) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.event")
  @js.native
  class event protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.event {
    def this(domEvent: Event) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.iterator")
  @js.native
  class iterator protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.iterator {
    def this(range: typingsSlinky.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.node")
  @js.native
  class node protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.node {
    def this(domNode: Node) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.nodeList")
  @js.native
  class nodeList protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.nodeList {
    def this(nativeList: NodeList) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.range")
  @js.native
  class range protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.range {
    def this(root: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(root: typingsSlinky.ckeditor.CKEDITOR.dom.element) = this()
  }
  object range {
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.range.mergeRanges")
    @js.native
    def mergeRanges(ranges: js.Array[typingsSlinky.ckeditor.CKEDITOR.dom.range]): js.Array[typingsSlinky.ckeditor.CKEDITOR.dom.range] = js.native
  }
  
  @JSGlobal("CKEDITOR.dom.rangeList")
  @js.native
  class rangeList ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.rangeList {
    def this(ranges: js.Array[typingsSlinky.ckeditor.CKEDITOR.dom.range]) = this()
    def this(ranges: typingsSlinky.ckeditor.CKEDITOR.dom.range) = this()
  }
  
  // see https://docs.com/ckeditor4/latest/api/CKEDITOR_dom_selection.html
  @JSGlobal("CKEDITOR.dom.selection")
  @js.native
  class selection protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.selection {
    def this(target: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(target: typingsSlinky.ckeditor.CKEDITOR.dom.element) = this()
    def this(target: typingsSlinky.ckeditor.CKEDITOR.dom.selection) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.text")
  @js.native
  class text protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.text {
    def this(text: String) = this()
    def this(text: Text) = this()
    def this(text: String, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
    def this(text: Text, ownerDocument: typingsSlinky.ckeditor.CKEDITOR.dom.document) = this()
  }
  
  @JSGlobal("CKEDITOR.dom.walker")
  @js.native
  class walker protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.walker {
    def this(range: typingsSlinky.ckeditor.CKEDITOR.dom.range) = this()
  }
  object walker {
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.blockBoundary")
    @js.native
    def blockBoundary(customNodeNames: js.Any): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.bogus")
    @js.native
    def bogus(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.bogus")
    @js.native
    def bogus(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.bookmark")
    @js.native
    def bookmark(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.bookmark")
    @js.native
    def bookmark(contentOnly: js.UndefOr[scala.Nothing], isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.bookmark")
    @js.native
    def bookmark(contentOnly: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.bookmark")
    @js.native
    def bookmark(contentOnly: Boolean, isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.editable")
    @js.native
    def editable(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.editable")
    @js.native
    def editable(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.empty")
    @js.native
    def empty(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.empty")
    @js.native
    def empty(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.ignored")
    @js.native
    def ignored(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.ignored")
    @js.native
    def ignored(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.invisible")
    @js.native
    def invisible(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.invisible")
    @js.native
    def invisible(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.listItemBoundary")
    @js.native
    def listItemBoundary(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.nodeType")
    @js.native
    def nodeType(`type`: Double): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.nodeType")
    @js.native
    def nodeType(`type`: Double, isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.temp")
    @js.native
    def temp(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.temp")
    @js.native
    def temp(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.dom.walker.whitespaces")
    @js.native
    def whitespaces(): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    @JSGlobal("CKEDITOR.dom.walker.whitespaces")
    @js.native
    def whitespaces(isReject: Boolean): js.Function1[/* node */ typingsSlinky.ckeditor.CKEDITOR.dom.node, Boolean] = js.native
    
    /* static member */
    object validEmptyBlockContainers
  }
  
  @JSGlobal("CKEDITOR.dom.window")
  @js.native
  class window protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.dom.window {
    def this(domWindow: Window) = this()
  }
}
