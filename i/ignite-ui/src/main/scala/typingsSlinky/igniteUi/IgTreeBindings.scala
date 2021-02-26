package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeBindings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets the next layer of bindings in a recursive fashion.
    *
    */
  var bindings: js.UndefOr[IgTreeBindingsBindings] = js.native
  
  /**
    * Gets the name of the data source property the value of which would hold the node's
    * check state. The check state itself is represented by a string enumeration with the
    * checked|partially checked|unchecked states being respectively "on|partial|off".
    *
    */
  var checkedKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property that holds the child data of the current layer node.
    *
    */
  var childDataProperty: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the child data node. Used in client-only binding directly to XML.
    *
    */
  var childDataXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would hold the node`s
    * expanded state. The expanded state is represented by a boolean.
    *
    */
  var expandedKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be used as a URL for the node image.
    *
    */
  var imageUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the image URL attribute/node. Used in client-only binding directly to XML.
    *
    */
  var imageUrlXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be used as an href attribute for the node anchor.
    *
    */
  var navigateUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the navigate URL attribute/node. Used in client-only binding directly to XML.
    *
    */
  var navigateUrlXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the node content template for the current layer of bindings. The igTree utilizes igTemplating
    * for generating node content templates. A good example of how to setup templating can be found here http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/06/17/how-to-use-templates-to-style-the-different-nodes-of-the-ignite-ui-tree-control.aspx
    *
    */
  var nodeContentTemplate: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which is the primary key attribute
    * for the data. This property is used when load on demand is enabled and if specified the node paths
    * would be generated using primary keys instead of indices.
    *
    */
  var primaryKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the root data node. Used in client-only binding directly to XML.
    *
    */
  var searchFieldXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be used as a target
    * attribute for the node anchor.
    *
    */
  var targetKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be the node text.
    *
    */
  var textKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the text attribute/node. Used in client-only binding directly to XML.
    *
    */
  var textXPath: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the data source property the value of which would be the node value.
    *
    */
  var valueKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the XPath to the value attribute/node. Used in client-only binding directly to XML.
    *
    */
  var valueXPath: js.UndefOr[String] = js.native
}
object IgTreeBindings {
  
  @scala.inline
  def apply(): IgTreeBindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeBindings]
  }
  
  @scala.inline
  implicit class IgTreeBindingsMutableBuilder[Self <: IgTreeBindings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: IgTreeBindingsBindings): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setCheckedKey(value: String): Self = StObject.set(x, "checkedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedKeyUndefined: Self = StObject.set(x, "checkedKey", js.undefined)
    
    @scala.inline
    def setChildDataProperty(value: String): Self = StObject.set(x, "childDataProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDataPropertyUndefined: Self = StObject.set(x, "childDataProperty", js.undefined)
    
    @scala.inline
    def setChildDataXPath(value: String): Self = StObject.set(x, "childDataXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDataXPathUndefined: Self = StObject.set(x, "childDataXPath", js.undefined)
    
    @scala.inline
    def setExpandedKey(value: String): Self = StObject.set(x, "expandedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeyUndefined: Self = StObject.set(x, "expandedKey", js.undefined)
    
    @scala.inline
    def setImageUrlKey(value: String): Self = StObject.set(x, "imageUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlKeyUndefined: Self = StObject.set(x, "imageUrlKey", js.undefined)
    
    @scala.inline
    def setImageUrlXPath(value: String): Self = StObject.set(x, "imageUrlXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlXPathUndefined: Self = StObject.set(x, "imageUrlXPath", js.undefined)
    
    @scala.inline
    def setNavigateUrlKey(value: String): Self = StObject.set(x, "navigateUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigateUrlKeyUndefined: Self = StObject.set(x, "navigateUrlKey", js.undefined)
    
    @scala.inline
    def setNavigateUrlXPath(value: String): Self = StObject.set(x, "navigateUrlXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigateUrlXPathUndefined: Self = StObject.set(x, "navigateUrlXPath", js.undefined)
    
    @scala.inline
    def setNodeContentTemplate(value: String): Self = StObject.set(x, "nodeContentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeContentTemplateUndefined: Self = StObject.set(x, "nodeContentTemplate", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setSearchFieldXPath(value: String): Self = StObject.set(x, "searchFieldXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFieldXPathUndefined: Self = StObject.set(x, "searchFieldXPath", js.undefined)
    
    @scala.inline
    def setTargetKey(value: String): Self = StObject.set(x, "targetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeyUndefined: Self = StObject.set(x, "targetKey", js.undefined)
    
    @scala.inline
    def setTextKey(value: String): Self = StObject.set(x, "textKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextKeyUndefined: Self = StObject.set(x, "textKey", js.undefined)
    
    @scala.inline
    def setTextXPath(value: String): Self = StObject.set(x, "textXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextXPathUndefined: Self = StObject.set(x, "textXPath", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    
    @scala.inline
    def setValueXPath(value: String): Self = StObject.set(x, "valueXPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueXPathUndefined: Self = StObject.set(x, "valueXPath", js.undefined)
  }
}
