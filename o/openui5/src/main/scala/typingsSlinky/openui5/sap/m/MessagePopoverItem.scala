package typingsSlinky.openui5.sap.m

import typingsSlinky.openui5.sap.ui.core.Element
import typingsSlinky.openui5.sap.ui.core.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePopoverItem extends Element {
  
  /**
    * Destroys the link in the aggregation <code>link</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyLink(): MessagePopoverItem = js.native
  
  /**
    * Gets current value of property <code>counter</code>.Defines the number of messages for a given
    * message.
    * @returns Value of property <code>counter</code>
    */
  def getCounter(): Double = js.native
  
  /**
    * Gets current value of property <code>description</code>.Specifies detailed description of the
    * messageDefault value is <code></code>.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  
  /**
    * Gets content of aggregation <code>link</code>.Adds a sap.m.Link control which will be displayed at
    * the end of the description of a message.
    */
  def getLink(): Link = js.native
  
  /**
    * Gets current value of property <code>longtextUrl</code>.Specifies long text description location URL
    * @returns Value of property <code>longtextUrl</code>
    */
  def getLongtextUrl(): js.Any = js.native
  
  /**
    * Gets current value of property <code>markupDescription</code>.Specifies if description should be
    * interpreted as markupDefault value is <code>false</code>.
    * @returns Value of property <code>markupDescription</code>
    */
  def getMarkupDescription(): Boolean = js.native
  
  /**
    * Gets current value of property <code>subtitle</code>.Specifies the subtitle of the
    * message<b>Note:</b> This is only visible when the <code>title</code> property is not empty.
    * @returns Value of property <code>subtitle</code>
    */
  def getSubtitle(): String = js.native
  
  /**
    * Gets current value of property <code>title</code>.Specifies the title of the messageDefault value is
    * <code></code>.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Gets current value of property <code>type</code>.Specifies the type of the messageDefault value is
    * <code>Error</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): MessageType = js.native
  
  /**
    * Sets a new value for property <code>counter</code>.Defines the number of messages for a given
    * message.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param iCounter New value for property <code>counter</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCounter(iCounter: Double): MessagePopoverItem = js.native
  
  /**
    * Sets a new value for property <code>description</code>.Specifies detailed description of the
    * messageWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code></code>.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): MessagePopoverItem = js.native
  
  /**
    * Sets the aggregated <code>link</code>.
    * @param oLink The link to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLink(oLink: Link): MessagePopoverItem = js.native
  
  /**
    * Sets a new value for property <code>longtextUrl</code>.Specifies long text description location
    * URLWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sLongtextUrl New value for property <code>longtextUrl</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLongtextUrl(sLongtextUrl: js.Any): MessagePopoverItem = js.native
  
  /**
    * Sets a new value for property <code>markupDescription</code>.Specifies if description should be
    * interpreted as markupWhen called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @param bMarkupDescription New value for property <code>markupDescription</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMarkupDescription(bMarkupDescription: Boolean): MessagePopoverItem = js.native
  
  /**
    * Sets a new value for property <code>subtitle</code>.Specifies the subtitle of the
    * message<b>Note:</b> This is only visible when the <code>title</code> property is not empty.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sSubtitle New value for property <code>subtitle</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSubtitle(sSubtitle: String): MessagePopoverItem = js.native
  
  /**
    * Sets a new value for property <code>title</code>.Specifies the title of the messageWhen called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): MessagePopoverItem = js.native
  
  /**
    * Sets a new value for property <code>type</code>.Specifies the type of the messageWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Error</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: MessageType): MessagePopoverItem = js.native
}
