package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeView extends CollectionWidget {
  
  /** @name dxTreeView.collapseAll() */
  def collapseAll(): Unit = js.native
  
  /** @name dxTreeView.collapseItem(itemData) */
  def collapseItem(itemData: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeView.collapseItem(itemElement) */
  def collapseItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxTreeView.expandAll() */
  def expandAll(): Unit = js.native
  
  /** @name dxTreeView.expandItem(itemData) */
  def expandItem(itemData: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeView.expandItem(itemElement) */
  def expandItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxTreeView.getNodes() */
  def getNodes(): js.Array[dxTreeViewNode] = js.native
  
  /** @name dxTreeView.getSelectedNodeKeys() */
  def getSelectedNodeKeys(): js.Array[_] = js.native
  
  /** @name dxTreeView.getSelectedNodes() */
  def getSelectedNodes(): js.Array[dxTreeViewNode] = js.native
  
  /** @name dxTreeView.scrollToItem(itemData) */
  def scrollToItem(itemData: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeView.scrollToItem(itemElement) */
  def scrollToItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxTreeView.selectAll() */
  def selectAll(): Unit = js.native
  
  /** @name dxTreeView.selectItem(itemData) */
  def selectItem(itemData: js.Any): Boolean = js.native
  /** @name dxTreeView.selectItem(itemElement) */
  def selectItem(itemElement: Element): Boolean = js.native
  
  /** @name dxTreeView.unselectAll() */
  def unselectAll(): Unit = js.native
  
  /** @name dxTreeView.unselectItem(itemData) */
  def unselectItem(itemData: js.Any): Boolean = js.native
  /** @name dxTreeView.unselectItem(itemElement) */
  def unselectItem(itemElement: Element): Boolean = js.native
  
  /** @name dxTreeView.updateDimensions() */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
