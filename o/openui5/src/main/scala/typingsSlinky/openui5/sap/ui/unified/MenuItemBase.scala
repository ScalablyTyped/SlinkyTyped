package typingsSlinky.openui5.sap.ui.unified

import typingsSlinky.openui5.sap.ui.core.Element
import typingsSlinky.openui5.sap.ui.core.RenderManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemBase extends Element {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.ui.unified.MenuItemBase</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.MenuItemBase</code> itself.Fired when the item is selected by the
    * user.<b>Note:</b> The event is also available for items which have a submenu.In general,
    * applications must not handle event in this case because the user selection opens the sub menu.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.MenuItemBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): MenuItemBase = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MenuItemBase = js.native
  
  /**
    * Destroys the submenu in the aggregation <code>submenu</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySubmenu(): MenuItemBase = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.ui.unified.MenuItemBase</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): MenuItemBase = js.native
  
  /**
    * Fires event <code>select</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>item</code> of type <code>sap.ui.unified.MenuItemBase</code>The current
    * item</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): MenuItemBase = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.When an item is disabled the item can not be
    * selected by the user.The enabled property of the item has no effect when the menu of the item is
    * disabled ({@link sap.ui.unified.Menu#getEnabled Menu#getEnabled}).Default value is
    * <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>startsSection</code>.Defines whether a visual separator should
    * be rendered before the item.<b>Note:</b> If an item is invisible also the separator of this item is
    * not shown.Default value is <code>false</code>.
    * @returns Value of property <code>startsSection</code>
    */
  def getStartsSection(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>submenu</code>.An optional submenu of the item which is opened
    * when the item is selected by the user.
    */
  def getSubmenu(): Menu = js.native
  
  /**
    * Gets current value of property <code>visible</code>.Invisible items do not appear in the
    * menu.Default value is <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Changes the visual hover state of the menu item.Subclasses may override this function.
    * @param bHovered Specifies whether the item is currently hovered or not.
    * @param oMenu The menu to which this item belongs
    */
  def hover(bHovered: Boolean, oMenu: Menu): Unit = js.native
  
  /**
    * Informs the item that the item HTML is now applied to the DOM.Subclasses may override this function.
    */
  def onAfterRendering(): Unit = js.native
  
  /**
    * Event handler which is called whenever the submenu of the item is opened or closed.Subclasses may
    * override this function.
    * @param bOpened Specifies whether the submenu of the item is opened or closed
    */
  def onSubmenuToggle(bOpened: Boolean): Unit = js.native
  
  /**
    * Produces the HTML of an item and writes it to render-output-buffer during the rendering of the
    * corresponding menu.Subclasses may override this function.
    * @param oRenderManager The <code>RenderManager</code> that can be used for writing to the
    * render-output-buffer
    * @param oItem The item which should be rendered
    * @param oMenu The menu to which this item belongs
    */
  def render(oRenderManager: RenderManager, oItem: MenuItemBase, oMenu: Menu): Unit = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.When an item is disabled the item can not be
    * selected by the user.The enabled property of the item has no effect when the menu of the item is
    * disabled ({@link sap.ui.unified.Menu#getEnabled Menu#getEnabled}).When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): MenuItemBase = js.native
  
  /**
    * Sets a new value for property <code>startsSection</code>.Defines whether a visual separator should
    * be rendered before the item.<b>Note:</b> If an item is invisible also the separator of this item is
    * not shown.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bStartsSection New value for property <code>startsSection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartsSection(bStartsSection: Boolean): MenuItemBase = js.native
  
  /**
    * Sets the aggregated <code>submenu</code>.
    * @param oSubmenu The submenu to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSubmenu(oSubmenu: Menu): MenuItemBase = js.native
  
  /**
    * Sets a new value for property <code>visible</code>.Invisible items do not appear in the menu.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): MenuItemBase = js.native
}
