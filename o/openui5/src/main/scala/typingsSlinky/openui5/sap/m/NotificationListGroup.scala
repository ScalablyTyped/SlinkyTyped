package typingsSlinky.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationListGroup extends NotificationListBase {
  
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: NotificationListItem): NotificationListGroup = js.native
  
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): NotificationListGroup = js.native
  
  /**
    * Gets current value of property <code>autoPriority</code>.Determines if the group will automatically
    * set the priority based on the highest priority of its notifications or get its priority from the
    * developer.Default value is <code>true</code>.
    * @returns Value of property <code>autoPriority</code>
    */
  def getAutoPriority(): Boolean = js.native
  
  /**
    * Gets current value of property <code>collapsed</code>.Determines if the group is collapsed or
    * expanded.Default value is <code>false</code>.
    * @returns Value of property <code>collapsed</code>
    */
  def getCollapsed(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>items</code>.The NotificationListItems inside the group.
    */
  def getItems(): js.Array[NotificationListItem] = js.native
  
  /**
    * Gets current value of property <code>showEmptyGroup</code>.Determines if the group header/footer of
    * the empty group will be always shown. By default groups with 0 notifications are not shown.Default
    * value is <code>false</code>.
    * @returns Value of property <code>showEmptyGroup</code>
    */
  def getShowEmptyGroup(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.m.NotificationListItem</code> in the aggregation
    * <code>items</code>.and returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: NotificationListItem): Double = js.native
  
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: NotificationListItem, iIndex: Double): NotificationListGroup = js.native
  
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[NotificationListItem] = js.native
  
  def removeItem(vItem: String): NotificationListItem = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): NotificationListItem = js.native
  def removeItem(vItem: NotificationListItem): NotificationListItem = js.native
  
  /**
    * Sets a new value for property <code>autoPriority</code>.Determines if the group will automatically
    * set the priority based on the highest priority of its notifications or get its priority from the
    * developer.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bAutoPriority New value for property <code>autoPriority</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAutoPriority(bAutoPriority: Boolean): NotificationListGroup = js.native
  
  /**
    * Sets a new value for property <code>collapsed</code>.Determines if the group is collapsed or
    * expanded.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bCollapsed New value for property <code>collapsed</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCollapsed(bCollapsed: Boolean): NotificationListGroup = js.native
  
  /**
    * Sets a new value for property <code>showEmptyGroup</code>.Determines if the group header/footer of
    * the empty group will be always shown. By default groups with 0 notifications are not shown.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bShowEmptyGroup New value for property <code>showEmptyGroup</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowEmptyGroup(bShowEmptyGroup: Boolean): NotificationListGroup = js.native
}
