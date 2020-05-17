package typingsSlinky.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
  * It owns an HTMLDivElement inside which all panels are docked.
  * Initially the document manager takes up the central space and acts as the root node.
  */
@js.native
trait DockManager extends js.Object {
  var context: DockManagerContext = js.native
  /** Dock the [dialog] below the [referenceNode] node */
  def dockDialogDown(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
  /** Dock the [dialog] as a tab inside the [referenceNode] node */
  def dockDialogFill(referenceNode: DockNode, container: PanelContainer): DockNode = js.native
  /** Dock the [dialog] to the left of the [referenceNode] node */
  def dockDialogLeft(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
  /** Dock the [dialog] to the right of the [referenceNode] node */
  def dockDialogRight(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
  /** Dock the [dialog] above the [referenceNode] node */
  def dockDialogUp(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
  /** Dock the [container] below the [referenceNode] node */
  def dockDown(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
  /** Dock the [container] as a tab inside the [referenceNode] node */
  def dockFill(referenceNode: DockNode, container: PanelContainer): DockNode = js.native
  /** Dock the [container] to the left of the [referenceNode] node */
  def dockLeft(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
  /** Dock the [container] to the right of the [referenceNode] node */
  def dockRight(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
  /** Dock the [container] above the [referenceNode] node */
  def dockUp(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
  def initialize(): Unit = js.native
  def invalidate(): Unit = js.native
  def loadState(state: String): Unit = js.native
  def rebuildLayout(node: DockNode): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def resumeLayout(): Unit = js.native
  def saveState(): String = js.native
  /**
    * Reset the dock model. This happens when state is loaded from JSON.
    */
  def setModel(model: DockModel): Unit = js.native
  def setRootNode(node: DockNode): Unit = js.native
  def suspendLayout(): Unit = js.native
}

object DockManager {
  @scala.inline
  def apply(
    context: DockManagerContext,
    dockDialogDown: (DockNode, Dialog) => DockNode,
    dockDialogFill: (DockNode, PanelContainer) => DockNode,
    dockDialogLeft: (DockNode, Dialog) => DockNode,
    dockDialogRight: (DockNode, Dialog) => DockNode,
    dockDialogUp: (DockNode, Dialog) => DockNode,
    dockDown: (DockNode, PanelContainer, Double) => DockNode,
    dockFill: (DockNode, PanelContainer) => DockNode,
    dockLeft: (DockNode, PanelContainer, Double) => DockNode,
    dockRight: (DockNode, PanelContainer, Double) => DockNode,
    dockUp: (DockNode, PanelContainer, Double) => DockNode,
    initialize: () => Unit,
    invalidate: () => Unit,
    loadState: String => Unit,
    rebuildLayout: DockNode => Unit,
    resize: (Double, Double) => Unit,
    resumeLayout: () => Unit,
    saveState: () => String,
    setModel: DockModel => Unit,
    setRootNode: DockNode => Unit,
    suspendLayout: () => Unit
  ): DockManager = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], dockDialogDown = js.Any.fromFunction2(dockDialogDown), dockDialogFill = js.Any.fromFunction2(dockDialogFill), dockDialogLeft = js.Any.fromFunction2(dockDialogLeft), dockDialogRight = js.Any.fromFunction2(dockDialogRight), dockDialogUp = js.Any.fromFunction2(dockDialogUp), dockDown = js.Any.fromFunction3(dockDown), dockFill = js.Any.fromFunction2(dockFill), dockLeft = js.Any.fromFunction3(dockLeft), dockRight = js.Any.fromFunction3(dockRight), dockUp = js.Any.fromFunction3(dockUp), initialize = js.Any.fromFunction0(initialize), invalidate = js.Any.fromFunction0(invalidate), loadState = js.Any.fromFunction1(loadState), rebuildLayout = js.Any.fromFunction1(rebuildLayout), resize = js.Any.fromFunction2(resize), resumeLayout = js.Any.fromFunction0(resumeLayout), saveState = js.Any.fromFunction0(saveState), setModel = js.Any.fromFunction1(setModel), setRootNode = js.Any.fromFunction1(setRootNode), suspendLayout = js.Any.fromFunction0(suspendLayout))
    __obj.asInstanceOf[DockManager]
  }
  @scala.inline
  implicit class DockManagerOps[Self <: DockManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: DockManagerContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockDialogDown(value: (DockNode, Dialog) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockDialogDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDockDialogFill(value: (DockNode, PanelContainer) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockDialogFill")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDockDialogLeft(value: (DockNode, Dialog) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockDialogLeft")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDockDialogRight(value: (DockNode, Dialog) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockDialogRight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDockDialogUp(value: (DockNode, Dialog) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockDialogUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDockDown(value: (DockNode, PanelContainer, Double) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockDown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDockFill(value: (DockNode, PanelContainer) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockFill")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDockLeft(value: (DockNode, PanelContainer, Double) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockLeft")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDockRight(value: (DockNode, PanelContainer, Double) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockRight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDockUp(value: (DockNode, PanelContainer, Double) => DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockUp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvalidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadState(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRebuildLayout(value: DockNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuildLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResumeLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveState(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetModel(value: DockModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRootNode(value: DockNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuspendLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendLayout")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

