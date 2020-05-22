package typingsSlinky.dockSpawn

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dockSpawn.dockspawn.TabStripDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object dockspawn extends js.Object {
    @js.native
    class Dialog protected ()
      extends typingsSlinky.dockSpawn.dockspawn.Dialog {
      def this(
        panel: typingsSlinky.dockSpawn.dockspawn.PanelContainer,
        dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager
      ) = this()
      /* CompleteClass */
      override def bringToFront(): Unit = js.native
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      /* CompleteClass */
      override def setPosition(x: Double, y: Double): Unit = js.native
      /* CompleteClass */
      override def setTitle(title: String): Unit = js.native
      /* CompleteClass */
      override def setTitleIcon(iconName: String): Unit = js.native
    }
    
    /**
      * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
      * It owns an HTMLDivElement inside which all panels are docked.
      * Initially the document manager takes up the central space and acts as the root node.
      */
    @js.native
    class DockManager protected ()
      extends typingsSlinky.dockSpawn.dockspawn.DockManager {
      def this(element: HTMLDivElement) = this()
      /* CompleteClass */
      override var context: typingsSlinky.dockSpawn.dockspawn.DockManagerContext = js.native
      /** Dock the [dialog] below the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogDown(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        dialog: typingsSlinky.dockSpawn.dockspawn.Dialog
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [dialog] as a tab inside the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogFill(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        container: typingsSlinky.dockSpawn.dockspawn.PanelContainer
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [dialog] to the left of the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogLeft(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        dialog: typingsSlinky.dockSpawn.dockspawn.Dialog
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [dialog] to the right of the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogRight(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        dialog: typingsSlinky.dockSpawn.dockspawn.Dialog
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [dialog] above the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogUp(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        dialog: typingsSlinky.dockSpawn.dockspawn.Dialog
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [container] below the [referenceNode] node */
      /* CompleteClass */
      override def dockDown(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        container: typingsSlinky.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [container] as a tab inside the [referenceNode] node */
      /* CompleteClass */
      override def dockFill(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        container: typingsSlinky.dockSpawn.dockspawn.PanelContainer
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [container] to the left of the [referenceNode] node */
      /* CompleteClass */
      override def dockLeft(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        container: typingsSlinky.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [container] to the right of the [referenceNode] node */
      /* CompleteClass */
      override def dockRight(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        container: typingsSlinky.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /** Dock the [container] above the [referenceNode] node */
      /* CompleteClass */
      override def dockUp(
        referenceNode: typingsSlinky.dockSpawn.dockspawn.DockNode,
        container: typingsSlinky.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /* CompleteClass */
      override def initialize(): Unit = js.native
      /* CompleteClass */
      override def invalidate(): Unit = js.native
      /* CompleteClass */
      override def loadState(state: String): Unit = js.native
      /* CompleteClass */
      override def rebuildLayout(node: typingsSlinky.dockSpawn.dockspawn.DockNode): Unit = js.native
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      /* CompleteClass */
      override def resumeLayout(): Unit = js.native
      /* CompleteClass */
      override def saveState(): String = js.native
      /**
        * Reset the dock model. This happens when state is loaded from JSON.
        */
      /* CompleteClass */
      override def setModel(model: typingsSlinky.dockSpawn.dockspawn.DockModel): Unit = js.native
      /* CompleteClass */
      override def setRootNode(node: typingsSlinky.dockSpawn.dockspawn.DockNode): Unit = js.native
      /* CompleteClass */
      override def suspendLayout(): Unit = js.native
    }
    
    @js.native
    class DockManagerContext protected ()
      extends typingsSlinky.dockSpawn.dockspawn.DockManagerContext {
      def this(dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager) = this()
      /* CompleteClass */
      override var dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager = js.native
      /* CompleteClass */
      override var documentManagerView: typingsSlinky.dockSpawn.dockspawn.DocumentManagerContainer = js.native
      /* CompleteClass */
      override var model: typingsSlinky.dockSpawn.dockspawn.DockModel = js.native
    }
    
    @js.native
    class DockModel ()
      extends typingsSlinky.dockSpawn.dockspawn.DockModel {
      /* CompleteClass */
      override var documentManagerNode: typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
      /* CompleteClass */
      override var rootNode: typingsSlinky.dockSpawn.dockspawn.DockNode = js.native
    }
    
    @js.native
    class DockNode protected ()
      extends typingsSlinky.dockSpawn.dockspawn.DockNode {
      def this(container: typingsSlinky.dockSpawn.dockspawn.PanelContainer) = this()
      /* CompleteClass */
      override def detachFromParent(): Unit = js.native
    }
    
    /**
      * The document manager is then central area of the dock layout hierarchy.
      * This is where more important panels are placed (e.g. the text editor in an IDE,
      * 3D view in a modelling package etc
      */
    @js.native
    class DocumentManagerContainer protected ()
      extends typingsSlinky.dockSpawn.dockspawn.DocumentManagerContainer {
      def this(dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager) = this()
      /* CompleteClass */
      override var containerType: String = js.native
      /* CompleteClass */
      override var dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager = js.native
      /* CompleteClass */
      override var element: HTMLDivElement = js.native
      /* CompleteClass */
      override var minimumAllowedChildNodes: Double = js.native
      /* CompleteClass */
      override var name: String = js.native
      /* CompleteClass */
      override var selectedTab: typingsSlinky.dockSpawn.dockspawn.TabPage = js.native
      /* CompleteClass */
      override var tabHost: typingsSlinky.dockSpawn.dockspawn.TabHost = js.native
      /* CompleteClass */
      override var tabOrientation: TabStripDirection = js.native
      /* CompleteClass */
      override def saveState(state: String): Unit = js.native
    }
    
    @js.native
    class FillDockContainer protected ()
      extends typingsSlinky.dockSpawn.dockspawn.FillDockContainer {
      def this(dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager) = this()
      def this(dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager, tabStripDirection: TabStripDirection) = this()
      /* CompleteClass */
      override var containerType: String = js.native
      /* CompleteClass */
      override var dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager = js.native
      /* CompleteClass */
      override var element: HTMLDivElement = js.native
      /* CompleteClass */
      override var minimumAllowedChildNodes: Double = js.native
      /* CompleteClass */
      override var name: String = js.native
      /* CompleteClass */
      override var tabHost: typingsSlinky.dockSpawn.dockspawn.TabHost = js.native
      /* CompleteClass */
      override var tabOrientation: TabStripDirection = js.native
    }
    
    @js.native
    class PanelContainer protected ()
      extends typingsSlinky.dockSpawn.dockspawn.PanelContainer {
      def this(element: HTMLElement, dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager) = this()
      def this(element: HTMLElement, dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager, title: String) = this()
      /* CompleteClass */
      override var height: Double = js.native
      /* CompleteClass */
      override var width: Double = js.native
      /* CompleteClass */
      override def setTitle(title: String): Unit = js.native
      /* CompleteClass */
      override def setTitleIcon(iconName: String): Unit = js.native
    }
    
    /**
      * Tab Host control contains tabs known as TabPages.
      * The tab strip can be aligned in different orientations
      */
    @js.native
    class TabHost ()
      extends typingsSlinky.dockSpawn.dockspawn.TabHost {
      def this(tabStripDirection: TabStripDirection) = this()
      def this(tabStripDirection: TabStripDirection, displayCloseButton: Boolean) = this()
      /* CompleteClass */
      override var contentElement: HTMLDivElement = js.native
      /* CompleteClass */
      override var displayCloseButton: Boolean = js.native
      /* CompleteClass */
      override var hostElement: HTMLDivElement = js.native
      /* CompleteClass */
      override var pages: js.Array[typingsSlinky.dockSpawn.dockspawn.TabPage] = js.native
      /* CompleteClass */
      override var separatorElement: HTMLDivElement = js.native
      /* CompleteClass */
      override var tabListElement: HTMLDivElement = js.native
      /* CompleteClass */
      override var tabStripDirection: TabStripDirection = js.native
      /** Set the selected TabPage. */
      /* CompleteClass */
      override def onTabPageSelected(page: typingsSlinky.dockSpawn.dockspawn.TabPage): Unit = js.native
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      /* CompleteClass */
      override def setActiveTab(container: typingsSlinky.dockSpawn.dockspawn.PanelContainer): Unit = js.native
    }
    
    @js.native
    class TabPage protected ()
      extends typingsSlinky.dockSpawn.dockspawn.TabPage {
      def this(
        host: typingsSlinky.dockSpawn.dockspawn.TabHost,
        container: typingsSlinky.dockSpawn.dockspawn.PanelContainer
      ) = this()
    }
    
    /* static members */
    @js.native
    object Dialog extends js.Object {
      def fromElement(id: String, dockManager: typingsSlinky.dockSpawn.dockspawn.DockManager): typingsSlinky.dockSpawn.dockspawn.Dialog = js.native
    }
    
    @js.native
    object TabStripDirection extends js.Object {
      /* 1 */ val DIRECTION_BOTTOM: typingsSlinky.dockSpawn.dockspawn.TabStripDirection.DIRECTION_BOTTOM with Double = js.native
      /* 2 */ val DIRECTION_LEFT: typingsSlinky.dockSpawn.dockspawn.TabStripDirection.DIRECTION_LEFT with Double = js.native
      /* 3 */ val DIRECTION_RIGHT: typingsSlinky.dockSpawn.dockspawn.TabStripDirection.DIRECTION_RIGHT with Double = js.native
      /* 0 */ val DIRECTION_TOP: typingsSlinky.dockSpawn.dockspawn.TabStripDirection.DIRECTION_TOP with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.dockSpawn.dockspawn.TabStripDirection with Double] = js.native
    }
    
  }
  
}

