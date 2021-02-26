package typingsSlinky.openui5.sap.m

import typingsSlinky.openui5.sap.ui.core.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiComboBox extends ComboBoxBase {
  
  /**
    * Adds some item <code>oItem</code> to the association named <code>selectedItems</code>.
    * @param oItem The selected item to add; if empty, nothing is added.
    * @returns <code>this</code> to allow method chaining.
    */
  def addSelectedItem(oItem: Item): MultiComboBox = js.native
  
  /**
    * Adds selected items. Only items with valid keys are added as selected.
    * @param aKeys An array of item keys that identifies the items to be added as selected
    */
  def addSelectedKeys(aKeys: js.Array[String]): MultiComboBox = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>selectionChange</code> event of this
    * <code>sap.m.MultiComboBox</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.MultiComboBox</code> itself.Event is fired when selection of an item is
    * changed.Note: please do not use the "change" event inherited from sap.m.InputBase
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MultiComboBox</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any): MultiComboBox = js.native
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MultiComboBox = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>selectionFinish</code> event of this
    * <code>sap.m.MultiComboBox</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.MultiComboBox</code> itself.Event is fired when user has finished a selection of
    * items in a list box and list box has been closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MultiComboBox</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelectionFinish(oData: js.Any, fnFunction: js.Any): MultiComboBox = js.native
  def attachSelectionFinish(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MultiComboBox = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>selectionChange</code> event of this
    * <code>sap.m.MultiComboBox</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelectionChange(fnFunction: js.Any, oListener: js.Any): MultiComboBox = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>selectionFinish</code> event of this
    * <code>sap.m.MultiComboBox</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelectionFinish(fnFunction: js.Any, oListener: js.Any): MultiComboBox = js.native
  
  /**
    * Fires event <code>selectionChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>changedItem</code> of type <code>sap.ui.core.Item</code>Item which
    * selection is changed</li><li><code>selected</code> of type <code>boolean</code>Selection state: true
    * if item is selected, false ifitem is not selected</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelectionChange(mArguments: js.Any): MultiComboBox = js.native
  
  /**
    * Fires event <code>selectionFinish</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItems</code> of type <code>sap.ui.core.Item[]</code>The selected
    * items which are selected after list box has been closed.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelectionFinish(mArguments: js.Any): MultiComboBox = js.native
  
  /**
    * Retrieves the selected item objects from the association named <code>selectedItems</code>.
    * @returns Array of sap.ui.core.Item instances. The current target of the <code>selectedItems</code>  
    *       association.
    */
  def getSelectedItems(): js.Array[Item] = js.native
  
  /**
    * Gets current value of property <code>selectedKeys</code>.Keys of the selected items. If the key has
    * no corresponding item, no changes will apply. If duplicate keys exists the first item matching the
    * key is used.Default value is <code>[]</code>.
    * @returns Value of property <code>selectedKeys</code>
    */
  def getSelectedKeys(): js.Array[String] = js.native
  
  /**
    * This hook method is called after the MultiComboBox's Pop-up is rendered.
    */
  def onAfterRenderingPicker(): Unit = js.native
  
  /**
    * This hook method is called before the MultiComboBox's Pop-up is rendered.
    */
  def onBeforeRenderingPicker(): Unit = js.native
  
  /**
    * Removes all the controls in the association named <code>selectedItems</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSelectedItems(): js.Array[_] = js.native
  
  def removeSelectedItem(vSelectedItem: js.Any): js.Any = js.native
  /**
    * Removes an selectedItem from the association named <code>selectedItems</code>.
    * @param vSelectedItem The selectedItem to be removed or its index or ID
    * @returns The removed selectedItem or <code>null</code>
    */
  def removeSelectedItem(vSelectedItem: Double): js.Any = js.native
  def removeSelectedItem(vSelectedItem: Item): js.Any = js.native
  
  /**
    * Removes selected items. Only items with valid keys are removed.
    * @param aKeys An array of item keys that identifies the items to be removed
    */
  def removeSelectedKeys(aKeys: js.Array[String]): MultiComboBox = js.native
  
  def setSelectedItems(aItems: js.Any): MultiComboBox = js.native
  /**
    * Setter for association <code>selectedItems</code>.
    * @param aItems new values for association <code>selectedItems</code>.Array of sap.ui.core.Item Id
    * which becomes the new target of this <code>selectedItems</code> association.Alternatively, an array
    * of sap.ui.core.Item instance may be given or null.
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedItems(aItems: js.Array[Item | String]): MultiComboBox = js.native
  
  /**
    * Sets a new value for property <code>selectedKeys</code>.Keys of the selected items. If the key has
    * no corresponding item, no changes will apply. If duplicate keys exists the first item matching the
    * key is used.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>[]</code>.
    * @param sSelectedKeys New value for property <code>selectedKeys</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelectedKeys(sSelectedKeys: js.Array[String]): MultiComboBox = js.native
}
