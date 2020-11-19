package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.view.Menu_.Callback
import typingsSlinky.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu__ extends js.Object {
  
  def add(groupId: Double, itemId: Double, order: Double, title: String): MenuItem = js.native
  def add(title: String): MenuItem = js.native
  
  /* private */ def addInternal(group: js.Any, id: js.Any, categoryOrder: js.Any, title: js.Any): js.Any = js.native
  
  def clear(): Unit = js.native
  
  def dispatchMenuItemSelected(menu: Menu_, item: MenuItem): Boolean = js.native
  
  def findGroupIndex(group: Double): Double = js.native
  def findGroupIndex(group: Double, start: Double): Double = js.native
  
  def findItem(id: Double): MenuItem = js.native
  
  def findItemIndex(id: Double): Double = js.native
  
  def getContext(): Context = js.native
  
  def getItem(index: Double): MenuItem = js.native
  
  def getRootMenu(): Menu_ = js.native
  
  def getVisibleItems(): ArrayList[MenuItem] = js.native
  
  def hasVisibleItems(): Boolean = js.native
  
  var mCallback: js.Any = js.native
  
  var mContext: js.Any = js.native
  
  var mItems: js.Any = js.native
  
  var mVisibleItems: js.Any = js.native
  
  def onItemsChanged(structureChanged: Boolean): Unit = js.native
  
  def removeGroup(groupId: Double): Unit = js.native
  
  def removeItem(id: Double): Unit = js.native
  
  /* private */ def removeItemAtInt(index: js.Any, updateChildrenOnMenuViews: js.Any): js.Any = js.native
  
  def setCallback(cb: Callback): Unit = js.native
  
  def setGroupEnabled(group: Double, enabled: Boolean): Unit = js.native
  
  def setGroupVisible(group: Double, visible: Boolean): Unit = js.native
  
  def size(): Double = js.native
}
