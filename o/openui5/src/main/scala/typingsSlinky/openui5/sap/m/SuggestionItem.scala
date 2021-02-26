package typingsSlinky.openui5.sap.m

import typingsSlinky.openui5.sap.ui.core.Control
import typingsSlinky.openui5.sap.ui.core.RenderManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionItem extends Control {
  
  /**
    * Gets current value of property <code>description</code>.Additional text of type string, optionally
    * to be displayed along with this item.Default value is <code></code>.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  
  /**
    * Gets current value of property <code>icon</code>.The icon belonging to this list item instance.This
    * can be an URI to an image or an icon font URI.Default value is <code></code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): String = js.native
  
  /**
    * Return suggestion text. By default, it is the value of the <code>text</code> property.Subclasses may
    * override this function.
    * @returns suggestion text.
    */
  def getSuggestionText(): String = js.native
  
  /**
    * Produces the HTML of the suggestion item and writes it to render-output-buffer.Subclasses may
    * override this function.
    * @param oRenderManager The <code>RenderManager</code>
    * @param oItem The item which should be rendered
    * @param sSearch The search text that should be emphasized
    * @param bSelected The item is selected
    */
  def render(oRenderManager: RenderManager, oItem: SuggestionItem, sSearch: String, bSelected: Boolean): Unit = js.native
  
  /**
    * Sets a new value for property <code>description</code>.Additional text of type string, optionally to
    * be displayed along with this item.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): SuggestionItem = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.The icon belonging to this list item instance.This
    * can be an URI to an image or an icon font URI.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: String): SuggestionItem = js.native
}
